package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ScoreboardFile {
	
	public static void loadFile() {

		File file = new File("plugins//RPG//Scoreboard.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Scoreboard.Header", "EnderGamesRPG");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
