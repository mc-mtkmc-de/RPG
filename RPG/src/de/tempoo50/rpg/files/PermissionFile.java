package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionFile {
	
	public static void loadPermission() {
		
		File file = new File("plugins//RPG//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		//MobSpawn
		config.addDefault("Spawn.Zombie", "rpg.zombie");
		config.addDefault("Spawn.Witch", "rpg.witch");
		config.addDefault("Spawn.Pig", "rpg.pig");
		config.addDefault("Spawn.Cow", "rpg.cow");
		config.addDefault("Spawn.Skelett", "rpg.skelett");
		config.addDefault("Spawn.Spider", "rpg.spider");
		config.addDefault("Spawn.Giant", "rpg.giant");
		config.addDefault("Spawn.Villager", "rpg.villager");
		config.addDefault("Spawn.Evoker", "rpg.evoker");
		config.addDefault("Spawn.Slime", "rpg.slime");
		config.addDefault("Spawn.Illusioner", "rpg.illusioner");
		config.addDefault("Spawn.Wither", "rpg.wither");
		config.addDefault("Spawn.Vindicator", "rpg.vindicator");
		config.addDefault("Spawn.Creeper", "rpg.creeper");
		config.addDefault("Spawn.Blaze", "rpg.blaze");
		config.addDefault("Spawn.Vex", "rpg.vex");
		config.addDefault("Spawn.Stray", "rpg.stray");
		//Tablist
		config.addDefault("Tab.1", "tab.admin");
		config.addDefault("Tab.2", "tab.dev");
		config.addDefault("Tab.3", "tab.shulker");
		config.addDefault("Tab.4", "tab.elytren");
		config.addDefault("Tab.5", "tab.mbuilder");
		config.addDefault("Tab.6", "tab.builder");
		config.addDefault("Tab.7", "tab.mod");
		config.addDefault("Tab.8", "tab.sup");
		config.addDefault("Tab.9", "tab.krieger");
		config.addDefault("Tab.10", "tab.jager");
		//Respawn
		config.addDefault("SetRespawn", "spawn.admin");
		config.addDefault("Resapwn.1", "respawn.1");
		config.addDefault("Resapwn.2", "respawn.2");
		config.addDefault("Resapwn.3", "respawn.3");
		config.addDefault("Resapwn.4", "respawn.4");
		config.addDefault("Resapwn.5", "respawn.5");
		config.addDefault("Resapwn.6", "respawn.6");
		config.addDefault("Resapwn.7", "respawn.7");
		config.addDefault("Resapwn.8", "respawn.8");
		//Spawn
		config.addDefault("PlayerSpawn.Admin", "spawn.admin");
		config.addDefault("PlayerSpawn.1", "spawn.1");
		config.addDefault("PlayerSpawn.2", "spawn.2");
		config.addDefault("PlayerSpawn.3", "spawn.3");
		config.addDefault("PlayerSpawn.4", "spawn.4");
		config.addDefault("PlayerSpawn.5", "spawn.5");
		config.addDefault("PlayerSpawn.6", "spawn.6");
		config.addDefault("PlayerSpawn.7", "spawn.7");
		config.addDefault("PlayerSpawn.8", "spawn.8");
		//Blocker
		config.addDefault("Blocker.1", "blocker.1");
		config.addDefault("Blocker.2", "blocker.2");
		config.addDefault("Blocker.3", "blocker.3");
		config.addDefault("Blocker.4", "blocker.4");
		config.addDefault("Blocker.5", "blocker.5");
		config.addDefault("Blocker.6", "blocker.6");
		config.addDefault("Blocker.7", "blocker.7");
		config.addDefault("Blocker.8", "blocker.8");
		config.addDefault("Blocker.9", "blocker.9");
		config.addDefault("Blocker.10", "blocker.10");
		config.addDefault("Blocker.11", "blocker.11");
		config.addDefault("Blocker.12", "blocker.12");
		config.addDefault("Blocker.13", "blocker.13");
		config.addDefault("Blocker.14", "blocker.14");
		config.addDefault("Blocker.15", "blocker.15");
		config.addDefault("Blocker.16", "blocker.16");
		config.addDefault("Blocker.17", "blocker.17");
		config.addDefault("Blocker.18", "blocker.18");
		config.addDefault("Blocker.19", "blocker.19");
		config.addDefault("Blocker.20", "blocker.20");
		config.addDefault("Blocker.21", "blocker.21");
		config.addDefault("Blocker.22", "blocker.22");
		config.addDefault("Blocker.23", "blocker.23");
		config.addDefault("Blocker.24", "blocker.24");
		config.addDefault("Blocker.25", "blocker.25");
		config.addDefault("Blocker.26", "blocker.26");
		config.addDefault("Blocker.27", "blocker.27");
		config.addDefault("Blocker.28", "blocker.28");
		config.addDefault("Blocker.29", "blocker.29");
		config.addDefault("Blocker.30", "blocker.30");
		//Chat
		config.addDefault("Chat.1", "tab.admin");
		config.addDefault("Chat.2", "tab.dev");
		config.addDefault("Chat.3", "tab.shulker");
		config.addDefault("Chat.4", "tab.elytren");
		config.addDefault("Chat.5", "tab.mbuilder");
		config.addDefault("Chat.6", "tab.builder");
		config.addDefault("Chat.7", "tab.mod");
		config.addDefault("Chat.8", "tab.sup");
		config.addDefault("Chat.9", "tab.krieger");
		config.addDefault("Chat.10", "tab.jager");
		config.addDefault("Chat.ChatColor", "chat.color");
		config.addDefault("Chat.Block", "chat.block");
		config.addDefault("Chat.Clear", "chat.clear");
		//Clan
		
		//Krieger
		
		//Jäger
		
		//Team
		config.addDefault("Tp.Player", "rpg.tp");
		config.addDefault("Sign.Color", "rpg.color");
		config.addDefault("Time.Day", "rpg.day");
		config.addDefault("Time.Night", "rpg.night");
		config.addDefault("Rundruf", "rpg.rundruf");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
