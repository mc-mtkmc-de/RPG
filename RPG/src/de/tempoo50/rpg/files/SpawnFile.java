package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class SpawnFile {

	public static void loadSpawn() {
		
		File file = new File("plugins//RPG//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Message.Join", "");
		config.addDefault("Message.Quit", "");
		
		config.options().copyDefaults(true);
	    try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
}
