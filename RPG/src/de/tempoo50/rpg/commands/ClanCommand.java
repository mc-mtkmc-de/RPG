package de.tempoo50.rpg.commands;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.files.ClanData;
import de.tempoo50.rpg.utils.ClanManager;
import de.tempoo50.rpg.utils.ClanPlayer;
import de.tempoo50.rpg.utils.ClanStats;
import de.tempoo50.rpg.utils.ClanUtil;
import de.tempoo50.rpg.utils.Invitemet;
import de.tempoo50.rpg.utils.MessagesUtil;

public class ClanCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (args.length == 0) {
			help(p);
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("info")) {
				if (!(ClanPlayer.getClan(p) == null)) {
					p.sendMessage("§e§m---------<" + ClanUtil.prefix() + "§e>§m---------");
					p.sendMessage("§8[§cClans§8] §6Informationen");
					p.sendMessage("§eName§7: §6" + ClanPlayer.getClan(p));
					p.sendMessage("§eKürzel§7: §6"
							+ ClanManager.getPrefix(ClanPlayer.getClan(p)));
					p.sendMessage("§eClanleaders§7:");
					for (String uuid : ClanManager
							.getAdmins(ClanPlayer.getClan(p))) {
						p.sendMessage("§7- §8" + Bukkit.getOfflinePlayer(UUID.fromString(uuid)).getName());
					}
					p.sendMessage("§eClanmitglieder:");
					for (String uuid : ClanManager
							.getMember(ClanPlayer.getClan(p))) {
						p.sendMessage("§7- §8" + Bukkit.getOfflinePlayer(UUID.fromString(uuid)).getName());
					}
					p.sendMessage("§e§m---------<" + ClanUtil.prefix() + "§e>§m---------");
				} else {
					p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("leave")) {
					if (ClanPlayer.getClan(p) == null) {
						p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
						return false;
					} else {
						String clan = ClanPlayer.getClan(p);
						if (ClanPlayer.isadmin(p, clan)) {
							ClanManager.deleteClan(clan);
						}
						ClanPlayer.leaveClan(p, clan);
						p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanverlassen());
					}
			} else if (args[0].equalsIgnoreCase("invites")) {
				List<String> invites = ClanPlayer.getInvites(p);
				p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanseinladen());
				for (String clan : invites) {
					p.sendMessage("§e-§c§l " + clan);
				}
			} else {
				help(p);
			}
		} else if (args.length == 2) {
			
			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
			
			if (args[0].equalsIgnoreCase("delete")) {
				String clan = args[1];
				if (ClanPlayer.isadmin(p, clan) || p.hasPermission((String) per.get("Clan.Del"))) {
					ClanManager.deleteClan(clan);
				} else {
					p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
				}
			} else if (args[0].equalsIgnoreCase("invite")) {
				String player = args[1];
				if (!(ClanPlayer.getClan(p) == null)) {
					if ((ClanPlayer.getClan(Bukkit.getOfflinePlayer(player)) == null)) {
						if (ClanPlayer.isadmin(p, ClanPlayer.getClan(p))) {
							if(Bukkit.getOfflinePlayer(player).hasPlayedBefore()) {
								ClanPlayer.invitePlayer(Bukkit.getOfflinePlayer(player),
										ClanPlayer.getClan(p));
								p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielereingeladen());
								if (Bukkit.getOfflinePlayer(player).isOnline()) {
									Bukkit.getPlayer(player).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Einladungerhalten(ClanPlayer.getClan(p)));
									Bukkit.getPlayer(player).sendMessage(ClanUtil.prefix() + " " + ClanUtil.joinoderdeny());
								}
							} else {
								p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielernochnieonline());
								return false;
							}
						} else {
							p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
						}
					} else {
						p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.SpielerbereitsinClan());
					}
				} else {
					p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("kick")) {
				String player = args[1];
				if (!(ClanPlayer.getClan(p) == null)) {
					if (ClanPlayer.isadmin(p, ClanPlayer.getClan(p))) {
						if (ClanPlayer.getClan(p).equalsIgnoreCase(
								ClanPlayer.getClan(Bukkit.getOfflinePlayer(player)))) {
							ClanPlayer.leaveClan(Bukkit.getOfflinePlayer(player),
									ClanPlayer.getClan(p));
							p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielergekickt());
							if (Bukkit.getOfflinePlayer(player).isOnline()) {
								Bukkit.getPlayer(player).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Dugekickt());
							}
						} else {
							p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
						}
					} else {
						p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
					}
				} else {
					p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("promote")) {
				OfflinePlayer player = Bukkit.getOfflinePlayer(args[1]);
				if (!(ClanPlayer.getClan(p) == null)) {
					if (ClanPlayer.isadmin(p, ClanPlayer.getClan(p))) {
						if (ClanPlayer.getClan(p)
								.equalsIgnoreCase(ClanPlayer.getClan(player))) {
							ClanManager.promotePlayer(player,
									ClanPlayer.getClan(p));
							p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielerpromotet());
						} else {
							p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
						}
					} else {
						p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
					}
				} else {
					p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
				}
			} else if (args[0].equalsIgnoreCase("join")) {
				if (Invitemet.PlayerJoin(p, args[1])) {
					p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.gejoint());
				} else {
					p.sendMessage(ClanUtil.prefix() + " "
							+ "§cDu wurdest nicht eingeladen, der Clan existiert nicht mehr oder der Clan ist voll!");
				}
			} else if (args[0].equalsIgnoreCase("deny")) {
				Invitemet.PlayerDeny(p, args[1]);
				p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.einladungnichtangenommen());
			} else if (args[0].equalsIgnoreCase("stats")) {
				String clan = args[1];
				int kills = ClanStats.getkills(clan);
				int deaths = ClanStats.getdeaths(clan);
				p.sendMessage("§e§m---------<" + ClanUtil.prefix() + "§e>§m---------");
				p.sendMessage("§8[§cClans§8] §6Stats");
				p.sendMessage("§eKills§7: §6" + kills);
				p.sendMessage("§eDeaths§7: §6" + deaths);
				p.sendMessage("§e§m---------<" + ClanUtil.prefix() + "§e>§m---------");
			} else {
				help(p);
			}
		}
		if (args.length == 3) {
			if (args[0].equalsIgnoreCase("create")) {
				String clan = args[1];
				String prefix = args[2];
				if ((prefix.length() >= 3) && (prefix.length() <= 7)) {
					
					File perm = new File("plugins//ServerSystem//Permission.yml");
					YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
					
					if (p.hasPermission((String) per.get("Clan.Create"))) {
						if (ClanPlayer.getClan(p) == null) {
							if (ClanData.Clan.getString("Clan." + clan) == null) {
								ClanManager.createClan(p, clan, prefix);
								p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanerstellt());
								Bukkit.broadcastMessage(MessagesUtil.PREFIX + p.getName() + " §aHat den Clan §e" + "§8[§e" + ChatColor.translateAlternateColorCodes('&', ClanManager.getPrefix(ClanPlayer.getClan(p))) + "§8]" + " §aerstellt!");
							} else {
								p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clangibtsschon());
							}
						} else {
							p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Dubistbereitsineinemclan());
						}
					} else {
						p.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
					}
				}else {
					p.sendMessage(ClanUtil.prefix() + " " + "§7Der §cTag §7darf nur zwischen 3 und 7 Buchstaben haben§8.");
					return false;
				}
				
			} else {
				help(p);
			}
		}
		return false;
	}

		private void help(Player p) {
			p.sendMessage("§8§m---------------" + ClanUtil.prefix() + "§8§m---------------");
			p.sendMessage("§c/Clan create [Name] [Tag/Prefix]");
			p.sendMessage("§c/Clan delete [Name]");
			p.sendMessage("§c/Clan leave");
			p.sendMessage("§c/Clan info");
			p.sendMessage("§c/Clan invite [Player]");
			p.sendMessage("§c/Clan invites");
			p.sendMessage("§c/Clan Join [Clan]");
			p.sendMessage("§c/Clan Deny [Clan]");
			p.sendMessage("§c/Clan promote [Player]");
			p.sendMessage("§c/Clan kick [Player]");
			p.sendMessage("§6--");
			p.sendMessage("§c/CM [Text]");
			p.sendMessage("§8§m---------------" + ClanUtil.prefix() + "§8§m---------------");
		}
	}
