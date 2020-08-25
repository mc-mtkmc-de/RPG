package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class LiveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Live.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			File pfile = new File("plugins//RPG//Permission.yml");
			YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);
			
			String live1 = (String) config.get("Live.1");
			String live2 = (String) config.get("Live.2");
			String live3 = (String) config.get("Live.3");
			String live4 = (String) config.get("Live.4");
			String live5 = (String) config.get("Live.5");
			String live6 = (String) config.get("Live.6");
			String live7 = (String) config.get("Live.7");
			String live8 = (String) config.get("Live.8");
			String live9 = (String) config.get("Live.9");
			String live10 = (String) config.get("Live.10");
			
			String livem1 = (String) config.get("LiveMessage.1");
			String livem2 = (String) config.get("LiveMessage.2");
			String livem3 = (String) config.get("LiveMessage.3");
			String livem4 = (String) config.get("LiveMessage.4");
			String livem5 = (String) config.get("LiveMessage.5");
			String livem6 = (String) config.get("LiveMessage.6");
			String livem7 = (String) config.get("LiveMessage.7");
			String livem8 = (String) config.get("LiveMessage.8");
			String livem9 = (String) config.get("LiveMessage.9");
			String livem10 = (String) config.get("LiveMessage.10");
			
			if(args.length == 0) {
				player.sendMessage("§aBitte benutze §b/live <Spieler>");
				
			}else if(player.hasPermission((String) pconfig.get("Live.1"))) {
				if(args[0].equalsIgnoreCase(live1)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live1 + " ist gerade live auf §b" + livem1);
						
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.2"))) {
				if(args[0].equalsIgnoreCase(live2)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live2 + " ist gerade Live auf §b" + livem2);
						
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.3"))) {
				if(args[0].equalsIgnoreCase(live3)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live3 + " ist gerade live auf §b" + livem3);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.4"))) {
				if(args[0].equalsIgnoreCase(live4)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live4 + " ist gerade live auf §b" + livem4);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.5"))) {
				if(args[0].equalsIgnoreCase(live5)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live5 + " ist gerade Live auf §b" + livem5);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live6"))) {
				if(args[0].equalsIgnoreCase(live6)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live6 + " ist gerade Live auf §b" + livem6);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.7"))) {
				if(args[0].equalsIgnoreCase(live7)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live7 + " ist gerade Live auf §b" + livem7);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.8"))) {
				if(args[0].equalsIgnoreCase(live8)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live8 + " ist gerade Live auf §b" + livem8);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.9"))) {
				if(args[0].equalsIgnoreCase(live9)) {
					if(args.length == 0) {
						
						Bukkit.broadcastMessage(live9 + " ist gerade Live auf §b" + livem9);
					}
				}
			}else if(player.hasPermission((String) pconfig.get("Live.10"))) {
				if(args[0].equalsIgnoreCase(live10)) {
					if(args.length == 1) {
						
						Bukkit.broadcastMessage(live10 + " ist gerade Live auf §b" + livem10);
					}
				}
			}
		}
		
		return false;
	}

}
