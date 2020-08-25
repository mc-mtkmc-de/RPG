package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class LiveFile {

	public static void loadFile() {
		
		File file = new File("plugins//RPG//Live.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Live.1", "Spielername1");
		config.addDefault("Live.2", "Spielername2");
		config.addDefault("Live.3", "Spielername3");
		config.addDefault("Live.4", "Spielername4");
		config.addDefault("Live.5", "Spielername5");
		config.addDefault("Live.6", "Spielername6");
		config.addDefault("Live.7", "Spielername7");
		config.addDefault("Live.8", "Spielername8");
		config.addDefault("Live.9", "Spielername9");
		config.addDefault("Live.10", "Spielername10");
		
		config.addDefault("LiveMessage.1", "StreamKanal1");
		config.addDefault("LiveMessage.2", "StreamKanal2");
		config.addDefault("LiveMessage.3", "StreamKanal3");
		config.addDefault("LiveMessage.4", "StreamKanal4");
		config.addDefault("LiveMessage.5", "StreamKanal5");
		config.addDefault("LiveMessage.6", "StreamKanal6");
		config.addDefault("LiveMessage.7", "StreamKanal7");
		config.addDefault("LiveMessage.8", "StreamKanal8");
		config.addDefault("LiveMessage.9", "StreamKanal9");
		config.addDefault("LiveMessage.10", "StreamKanal10");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
