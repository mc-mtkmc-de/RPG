package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.MessagesUtil;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			if(player.hasPermission((String) config.get("Heal"))) {
				if(args.length == 0) {
					
					player.setHealth(20);
					player.setFoodLevel(20);
					
					player.sendMessage(MessagesUtil.PREFIX + "Du wurdest geheilt");
					
				}else if(args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null) {
						
						target.setHealth(20);
						target.setFoodLevel(20);
						target.sendMessage(MessagesUtil.PREFIX + "Du wurdest geheilt!");
						player.sendMessage(MessagesUtil.PREFIX + "Du hast den Spieler " + target.getName() + "geheilt");
						
					}else
						player.sendMessage(MessagesUtil.PREFIX + "Der Spieler " + args[0] + " ist nicht auf dem Server!");
				}
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
