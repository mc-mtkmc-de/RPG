package de.tempoo50.rpg.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.rpg.main.Rpg;

public class Broadcaster {
	
	static File file = new File("plugins//RPG//Broadcast.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	private static final String ROOT = "BroadcastMessages";
	public static boolean useBroadcaster = true;
	
	private Rpg plugin;
	
	public Broadcaster(Rpg plugin) {
		
		this.plugin = plugin;
	
		createDefaults();
		
	}
	
	public static void createDefaults() {
		
		if(config.contains(ROOT)) return;
		List<String> defaults = new ArrayList<>();
		
		for(int i = 0; i < 30; i++)
			defaults.add("&6Testnachricht Nr. " + i);
		useBroadcaster = config.getBoolean("UseBroadcaster");
		config.set("UseBroadcaster", false);
		config.set("Messages_Delay", 120);
		config.set(ROOT, defaults);
		
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String pickMessage() {
		List<String> messages = config.getStringList(ROOT);
		int random = new Random().nextInt(messages.size());
		return messages.get(random);
	}
	
	public static void reloadDefaults() {
		config.get("Messages_Delay");
		config.get(ROOT);
	}

}
