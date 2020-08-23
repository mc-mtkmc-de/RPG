package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.MessagesUtil;

public class TpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			

			File perm = new File("plugins//RPG//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
			
			if(player.hasPermission((String) per.get("Tp.Player"))) {
				if(args.length == 1) {
					String name = args[0];
					if(Bukkit.getPlayer(name) != null) {
						Player target = (Player) Bukkit.getPlayer(name);
						player.teleport(target);
						player.sendMessage(MessagesUtil.PREFIX + "§bDu wurdest zu §6" + target.getName() + "§bteleportiert!");
						return true;
					}else
						player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler ist gerade nicht Online!");
				}else {
					player.sendMessage(MessagesUtil.PREFIX + "§6Bitte benutze §b/tp <Spieler>");
					return false;
				}
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
