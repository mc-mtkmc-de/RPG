package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ClanData {
	
	public static File ClanFile = new File("plugins//RPG//Clan", "Clan.yml");
	public static FileConfiguration Clan = YamlConfiguration.loadConfiguration(ClanFile);
	public static void saveClanFile() {
		try {
			Clan.save(ClanFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
