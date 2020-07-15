package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionFile {
	
	public static void loadPermission() {
		
		File file = new File("plugins//RPG//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Spawn.Zombie", "rpg.zombie");
		config.addDefault("Spawn.Witch", "rpg.witch");
		config.addDefault("Spawn.Pig", "rpg.pig");
		config.addDefault("Spawn.Cow", "rpg.cow");
		config.addDefault("Spawn.Skelett", "rpg.skelett");
		config.addDefault("Spawn.Spider", "rpg.spider");
		config.addDefault("Spawn.Giant", "rpg.giant");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
