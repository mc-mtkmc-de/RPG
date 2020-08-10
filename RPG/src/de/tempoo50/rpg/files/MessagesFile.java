package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class MessagesFile {
	
	public static void loadMessage() {	
		
		File file = new File("plugins//RPG//Message.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Prefix", "&7[§bEnderGamesMc§7] §r");
		config.addDefault("Noperm", "&cDazu hast du keine Rechte!");
		config.addDefault("NoCMD", "&c1 2 3 das war wohl nichts xD");
		config.addDefault("Block", "&cAchte auf deine Wortwahl! §aHier spielen auch kleine Kinder");
		
		config.options().copyDefaults(true);
	    try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}

}

