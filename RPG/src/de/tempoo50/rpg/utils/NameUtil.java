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
	public static final String VILLAGER = (String) config.get("Villager");
	public static final String EVOKER = (String) config.get("Evoker");
	public static final String SLIME = (String) config.get("Slime");
	public static final String CREEPER = (String) config.get("Creeper");
	public static final String ILLUSIONER = (String) config.get("Illusioner");
	public static final String WITHER = (String) config.get("Wither");
	public static final String WITHERSKELTON = (String) config.get("WitherSkelett");
	public static final String VINDICATOR = (String) config.get("Vindicator");
	public static final String BLAZE = (String) config.get("Blaze");
	public static final String VEX = (String) config.get("Vex");
	public static final String STRAY = (String) config.get("Stray");
	
}
