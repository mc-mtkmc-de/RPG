package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

public class ItemUtil {
	
	static File file = new File("plugins//RPG//Shop.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static final String BOW = (String) config.get("Main.Bow");
	public static final String SWORD = (String) config.get("Main.Sword");
	public static final String AXE = (String) config.get("Main.AXE");
	public static final String ARMOR = (String) config.get("Main.Armor");
	public static final String SPEZIAL = (String) config.get("Main.Spezial");
	public static final String SHIELD = (String) config.get("Main.Shield");
	public static final String BOW1 = (String) config.get("Bow.1");
	public static final String BOW2 = (String) config.get("Bow.2");
	public static final String BOW3 = (String) config.get("Bow.3");
	public static final String BOW4 = (String) config.get("Bow.4");
	public static final String BOW5 = (String) config.get("Bow.5");
	public static final String BOW6 = (String) config.get("Bow.6");
	public static final String BOW7 = (String) config.get("Bow.7");
	public static final String BOW8 = (String) config.get("Bow.8");
	public static final String BOW9 = (String) config.get("Bow.9");
	public static final String BOW10 = (String) config.get("Bow.10");
	public static final String SWORD1 = (String) config.get("Sword.1");
	public static final String SWORD2 = (String) config.get("Sword.2");
	public static final String SWORD3 = (String) config.get("Sword.3");
	public static final String SWORD4 = (String) config.get("Sword.4");
	public static final String SWORD5 = (String) config.get("Sword.5");
	public static final String SWORD6 = (String) config.get("Sword.6");
	public static final String SWORD7 = (String) config.get("Sword.7");
	public static final String SWORD8 = (String) config.get("Sword.8");
	public static final String SWORD9 = (String) config.get("Sword.9");
	public static final String SWORD10 = (String) config.get("Sword.10");
	public static final String AXE1 = (String) config.get("Axe.1");
	public static final String AXE2 = (String) config.get("Axe.2");
	public static final String AXE3 = (String) config.get("Axe.3");
	public static final String AXE4 = (String) config.get("Axe.4");
	public static final String AXE5 = (String) config.get("Axe.5");
	public static final String AXE6 = (String) config.get("Axe.6");
	public static final String AXE7 = (String) config.get("Axe.7");
	public static final String AXE8 = (String) config.get("Axe.8");
	public static final String AXE9 = (String) config.get("Axe.9");
	public static final String AXE10 = (String) config.get("Axe.10");
	public static final String SHIELD1 = (String) config.get("Shield.1");
	public static final String SHIELD2 = (String) config.get("Shield.2");
	public static final String SHIELD3 = (String) config.get("Shield.3");
	public static final String SHIELD4 = (String) config.get("Shield.4");
	public static final String SHIELD5 = (String) config.get("Shield.5");
	public static final String SHIELD6 = (String) config.get("Shield.6");
	public static final String SHIELD7 = (String) config.get("Shield.7");
	public static final String SHIELD8 = (String) config.get("Shield.8");
	public static final String SHIELD9 = (String) config.get("Shield.9");
	public static final String SHIELD10 = (String) config.get("Shield.10");
	public static final String ARMOR1 = (String) config.get("Armor1,0");
	public static final String ARMOR2 = (String) config.get("Armor1,1");
	public static final String ARMOR3 = (String) config.get("Armor1,2");
	public static final String ARMOR4 = (String) config.get("Armor1,3");
	public static final String ARMOR5 = (String) config.get("Armor2,0");
	public static final String ARMOR6 = (String) config.get("Armor2,1");
	public static final String ARMOR7 = (String) config.get("Armor2,2");
	public static final String ARMOR8 = (String) config.get("Armor2,3");
	public static final String SPEZIAL1 = (String) config.get("Spezial1");
	public static final String SPEZIAL2 = (String) config.get("Spezial2");
	public static final String SPEZIAL3 = (String) config.get("Spezial3");
	public static final String SPEZIAL4 = (String) config.get("Spezial4");

}