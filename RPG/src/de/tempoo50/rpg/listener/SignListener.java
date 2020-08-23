package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener {

	File perm = new File("plugins//RPG//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
	
	@EventHandler
	public void onSign(SignChangeEvent event) {
		String[] lines = event.getLines();
		Player player = event.getPlayer();
		
		if(player.hasPermission((String) per.get("Sign.Color"))) {
			for(int i = 0; i <= 3; i++) {
				event.setLine(i, ChatColor.translateAlternateColorCodes('&', lines[i]));
			}
		}
	}
	
}
