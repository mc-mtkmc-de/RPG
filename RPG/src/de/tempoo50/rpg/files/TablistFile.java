package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class TablistFile {
	
	public static void loadFile() {
		
		File file = new File("plugins//RPG//Tablist.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Prefix.1", "Admin");
		config.addDefault("Prefix.2", "Dev");
		config.addDefault("Prefix3", "Schulker");
		config.addDefault("Prefix.4", "Elytren");
		config.addDefault("Prefix.5", "MBuilder");
		config.addDefault("Prefix.6", "Builder");
		config.addDefault("Prefix.7", "Mod");
		config.addDefault("Prefix.8", "Sup");
		config.addDefault("Prefix.9", "Krieger");
		config.addDefault("Prefix.10", "Jäger");
		config.addDefault("Prefix.11", "Start");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
