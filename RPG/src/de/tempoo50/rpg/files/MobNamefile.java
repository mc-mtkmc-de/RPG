package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class MobNamefile {
	
	public static void loadMobs() {
		
		File file = new File("plugins//RPG//MobName.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Zombie", "Zombie");
		config.addDefault("Witch", "Witch");
		config.addDefault("Pig", "Pig");
		config.addDefault("Cow", "Cow");
		config.addDefault("Skelett", "Skelett");
		config.addDefault("Spider", "Spider");
		config.addDefault("Giant", "Giant");
		config.addDefault("Villager", "Villager");
		config.addDefault("Evoker", "Evoker");
		config.addDefault("Slime", "Slime");
		config.addDefault("Creeper", "Creeper");
		config.addDefault("Illusioner", "Illusioner");
		config.addDefault("Wither", "Wither");
		config.addDefault("WitherSkelett", "WitherSkelett");
		config.addDefault("Vindicator", "Vindicator");
		config.addDefault("Vex", "Vex");
		config.addDefault("Stray", "Stray");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
