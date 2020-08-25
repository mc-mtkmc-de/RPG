package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ClanPlayerData {

	public static File Playerfile = new File("plugins//RPG//Clan", "Player.yml");
	public static FileConfiguration Player = YamlConfiguration.loadConfiguration(Playerfile);
	public static void savePlayerFile() {
		try {
			Player.save(Playerfile);
		}catch(IOException f) {
			f.printStackTrace();
		}
	}
}