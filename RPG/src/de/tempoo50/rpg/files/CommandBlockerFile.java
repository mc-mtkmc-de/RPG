package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class CommandBlockerFile {
	
	public static void loadBlocker() {
		
		File file = new File("plugins//RPG//Blocker.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
			config.addDefault("Blocker.1", "test");
			config.addDefault("Blocker.2", "test");
			config.addDefault("Blocker.3", "test");
			config.addDefault("Blocker.4", "test");
			config.addDefault("Blocker.5", "test");
			config.addDefault("Blocker.6", "test");
			config.addDefault("Blocker.7", "test");
			config.addDefault("Blocker.8", "test");
			config.addDefault("Blocker.9", "test");
			config.addDefault("Blocker.10", "test");
			config.addDefault("Blocker.11", "test");
			config.addDefault("Blocker.12", "test");
			config.addDefault("Blocker.13", "test");
			config.addDefault("Blocker.14", "test");
			config.addDefault("Blocker.15", "test");
			config.addDefault("Blocker.16", "test");
			config.addDefault("Blocker.17", "test");
			config.addDefault("Blocker.18", "test");
			config.addDefault("Blocker.19", "test");
			config.addDefault("Blocker.20", "test");
			config.addDefault("Blocker.21", "test");
			config.addDefault("Blocker.22", "test");
			config.addDefault("Blocker.23", "test");
			config.addDefault("Blocker.24", "test");
			config.addDefault("Blocker.25", "test");
			config.addDefault("Blocker.26", "test");
			config.addDefault("Blocker.27", "test");
			config.addDefault("Blocker.28", "test");
			config.addDefault("Blocker.29", "test");
			config.addDefault("Blocker.30", "test");
			config.addDefault("DauerBlock.1", "test");
			config.addDefault("DauerBlock.2", "test");
			config.addDefault("DauerBlock.3", "test");
			config.addDefault("DauerBlock.4", "test");
			config.addDefault("DauerBlock.5", "test");
			config.addDefault("DauerBlock.6", "test");
			config.addDefault("DauerBlock.7", "test");
			config.addDefault("DauerBlock.8", "test");
			config.addDefault("DauerBlock.9", "test");
			config.addDefault("DauerBlock.10", "test");
			config.addDefault("DauerBlock.11", "test");
			config.addDefault("DauerBlock.12", "test");
			config.addDefault("DauerBlock.13", "test");
			config.addDefault("DauerBlock.14", "test");
			config.addDefault("DauerBlock.15", "test");
			config.addDefault("DauerBlock.16", "test");
			config.addDefault("DauerBlock.17", "test");
			config.addDefault("DauerBlock.18", "test");
			config.addDefault("DauerBlock.19", "test");
			config.addDefault("DauerBlock.20", "test");
			config.addDefault("DauerBlock.21", "test");
			config.addDefault("DauerBlock.22", "test");
			config.addDefault("DauerBlock.23", "test");
			config.addDefault("DauerBlock.24", "test");
			config.addDefault("DauerBlock.25", "test");
			config.addDefault("DauerBlock.26", "test");
			config.addDefault("DauerBlock.27", "test");
			config.addDefault("DauerBlock.28", "test");
			config.addDefault("DauerBlock.29", "test");
			config.addDefault("DauerBlock.30", "test");
			config.addDefault("Tab.1", "test");
			config.addDefault("Tab.2", "test");
			config.addDefault("Tab.3", "test");
			config.addDefault("Tab.4", "test");
			config.addDefault("Tab.5", "test");
			config.addDefault("Tab.6", "test");
			config.addDefault("Tab.7", "test");
			config.addDefault("Tab.8", "test");
			config.addDefault("Tab.9", "test");
			config.addDefault("Tab.10", "test");
			config.addDefault("Tab.11", "test");
			config.addDefault("Tab.12", "test");
			config.addDefault("Tab.13", "test");
			config.addDefault("Tab.14", "test");
			config.addDefault("Tab.15", "test");
			config.addDefault("Tab.16", "test");
			config.addDefault("Tab.17", "test");
			config.addDefault("Tab.18", "test");
			config.addDefault("Tab.19", "test");
			config.addDefault("Tab.20", "test");
			config.addDefault("Tab.21", "test");
			config.addDefault("Tab.22", "test");
			config.addDefault("Tab.23", "test");
			config.addDefault("Tab.24", "test");
			config.addDefault("Tab.25", "test");
			config.addDefault("Tab.26", "test");
			config.addDefault("Tab.27", "test");
			config.addDefault("Tab.28", "test");
			config.addDefault("Tab.29", "test");
			config.addDefault("Tab.30", "test");
			
			config.options().copyDefaults(true);
		    try {
				config.save(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			}
	
}