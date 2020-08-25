package de.tempoo50.rpg.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.rpg.main.Rpg;

public class FileManagerBelohnung {
	
	public static File getConfigFile() {
		
		return new File(Rpg.getInctance().getDataFolder(), "Belohnung//config.yml");
		
	}
	
	public static void setDefault() {
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(getConfigFile());
		config.options().copyDefaults(true);
		config.addDefault("prefix", "TagesBelohnung");
		List<String> commands = new ArrayList<String>();
		commands.add("give player LEATHER_CHESTPLATE 1");
		commands.add("give player COOKED_BEEF 64");
		config.addDefault("belohnungsCommand", commands);
		try {
			config.save(getConfigFile());
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
