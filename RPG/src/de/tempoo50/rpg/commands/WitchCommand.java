package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.SpawnUtil;

public class WitchCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			File file = new File("plugins//RPG//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			if(player.hasPermission((String) config.get("Spawn.Witch"))) {
				SpawnUtil.spawnwhitch(player.getLocation());
				player.sendMessage("Du hast gerade ein Hexe spawnen lassen");
			}
		}
		
		return false;
	}

}