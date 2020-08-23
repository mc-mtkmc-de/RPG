package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ServerLinkFile {
	
	public static void loadFile() {
		
		File file = new File("plugins//RPG//ServerLinks.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("ServerLinks.TS", "Deine Ts IP");
		config.addDefault("ServerLinks.Web", "Deine Webseite");
		config.addDefault("ServerLinks.Discord", "Dein Einladungs Link für Discord");
		config.addDefault("ServerLinks.Forum", "Dein Forum");
		config.addDefault("ServerLinks.Shop", "Dein Shop");
		config.addDefault("ServerLinks.YT", "YT Kanäle von deinem Server Server");
		config.addDefault("ServerLinks.Twitter", "Deine Twitterseite");
		config.addDefault("ServerLinks.Insta", "Deine Instaseite");
		config.addDefault("ServerLinks.Fb", "Deine Facebooksite");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
