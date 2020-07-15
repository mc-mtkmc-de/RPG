package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

public class NameUtil {
	
	static File file = new File("plugins//RPG//MobName.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static final String ZOMBIE = (String) config.get("Zombie");
	public static final String WITCH = (String) config.get("Witch");
	public static final String PIG = (String) config.get("Pig");
	public static final String COW = (String) config.get("Cow");
	public static final String SKELETT = (String) config.get("Skelett");
	public static final String SPIDER = (String) config.get("Spider");
	public static final String GIANT = (String) config.get("Giant");
	
}
