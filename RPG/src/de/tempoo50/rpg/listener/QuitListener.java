package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
	
	@EventHandler
	
	public void handlePlayerQuit(PlayerQuitEvent event) {

		File file = new File("plugins//RPG//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		event.setQuitMessage((String) config.get("Message.Quit"));
		
	}

}
