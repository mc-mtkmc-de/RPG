package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.MessagesUtil;

public class NightCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			File perm = new File("plugins//RPG//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
			
			if(player.hasPermission((String) per.get("Time.Night"))) {
				
				player.getLocation().getWorld().setTime(14000);
				player.sendMessage("§cEs ist nun Nacht");
				Bukkit.broadcastMessage(MessagesUtil.PREFIX + player.getName() + " §eHat die Spielzeit auf Nacht gestellt!");
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
