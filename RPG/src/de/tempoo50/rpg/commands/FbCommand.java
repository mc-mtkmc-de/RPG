package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class FbCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			if(args.length == 0) {

				File file = new File("plugins//RPG//ServerLinks.yml");
				YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
				
				String msg = (String) config.get("ServerLinks.FB");
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
				
			}
			
		}
		
		return false;
	}

}
