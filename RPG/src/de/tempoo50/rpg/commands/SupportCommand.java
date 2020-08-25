package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HashMapUtil;
import de.tempoo50.rpg.utils.MessagesUtil;

public class SupportCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			if(args.length == 0) {
				if(!HashMapUtil.needHelp.contains(player.getName())) {
					HashMapUtil.needHelp.add(player.getName());
					player.sendMessage(MessagesUtil.PREFIX + "§cDu hast Hilfe angefordert! Warte einen kurzen Moment!");
					for(String suppString : HashMapUtil.onlineSupporters) {
						Player supporter = Bukkit.getPlayer(suppString);
						if(supporter == null) return true;
						supporter.sendMessage(MessagesUtil.PREFIX + "§c" + player.getName() + " §bbenötigt Hilfe! §a/support accept " + player.getName() + " §bum ihm zu helfen!");
					}
				}else 
					player.sendMessage(MessagesUtil.PREFIX + "§cDu hast bereits Hilfe angefordert!");
				
			}else if(args.length == 2) {
				if(player.hasPermission((String) config.get("Support.Chat"))) {
					if(args[0].equalsIgnoreCase("accept")) {
						Player target = Bukkit.getPlayer(args[1]);
						if(target != null) {
							if(HashMapUtil.needHelp.contains(target.getName())) {
								if(!HashMapUtil.supportChat.containsKey(player.getName())) {
									HashMapUtil.needHelp.remove(target.getName());
									HashMapUtil.supportChat.put(player.getName(), target.getName());
									HashMapUtil.supportChat.put(target.getName(), player.getName());
									target.sendMessage(MessagesUtil.PREFIX + "§eDu bist nun in einem Chat mit " + player.getName());
									player.sendMessage(MessagesUtil.PREFIX + "§eDu bist nun in einem Chat mit " + target.getName());
								
								}else
									player.sendMessage(MessagesUtil.PREFIX + "§cDu bist bereits mit einem Spieler im Chat!");
							
							}else
								player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler hat keine Hilfe angefordert!");
						
						}else
							player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler ist nicht online!");
					
					}else if(args[0].equalsIgnoreCase("close")) {
						Player target = Bukkit.getPlayer(args[1]);
						if(target != null) {
							
							if(HashMapUtil.supportChat.containsKey(player.getName()) && HashMapUtil.supportChat.containsValue(target.getName())) {
								HashMapUtil.supportChat.remove(player.getName());
								HashMapUtil.supportChat.remove(target.getName());
								target.sendMessage(MessagesUtil.PREFIX + "§eDu bist nun nicht mehr im Hilfe-Chat!");
								player.sendMessage(MessagesUtil.PREFIX + "§eDu bist nun nicht mehr im Hilfe-Chat!");
							
							}else
								player.sendMessage(MessagesUtil.PREFIX + "§cDu bist nicht mit diesem Spieler im Chat");
							
						}else
							player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler ist nicht online!");
					
					}else if(args[0].equalsIgnoreCase("deny")) {
						Player target = Bukkit.getPlayer(args[1]);
						if(target != null) {
							if(HashMapUtil.needHelp.contains(target.getName())) {
								HashMapUtil.needHelp.remove(target.getName());
								target.sendMessage(MessagesUtil.PREFIX + "§eDein Antragauf Hilfe wurde abgelehnt!");
								player.sendMessage(MessagesUtil.PREFIX + "§eDu hast den Antrag von " + target.getName() + " abgelehnt!");
							
							}else
								player.sendMessage(MessagesUtil.PREFIX + "§cDieser Spieler hat keine Hilfe angefordert!");
						
						}else
							player.sendMessage(MessagesUtil.PREFIX + "§cDer Spielr ist nicht online!");
						
					}
					
				}else
					player.sendMessage(MessagesUtil.NOPERM);
			}
			
		}
		
		return false;
	}

}
