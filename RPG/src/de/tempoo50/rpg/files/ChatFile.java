package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ChatFile {
public static void loadChatSystem() {
		
		File file = new File("plugins//ServerSystem//Chat//ChatSystem.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.options().header("Here you can set up your chat system");
		config.addDefault("Chat.1", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.2", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.3", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.4", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.5", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.6", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.7", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.8", "/n[Prefix][Player]§7: §amessage /n ");
		config.addDefault("Chat.9", "[Prefix][Player]§7: §6message");
		config.addDefault("Chat.10", "[Prefix][Player]§7: §6message");
		config.addDefault("Chat.11", "[Prefix][Player]§7: &6message");
		config.addDefault("Chat.12", "[Prefix][Player]§7: message");

		config.addDefault("Prefix.1", "&a[Admin]");
		config.addDefault("Prefix.2", "§b[Dev]");
		config.addDefault("Prefix.3", "§f[Shulker]");
		config.addDefault("Prefix.4", "§4[Elytren]");
		config.addDefault("Prefix.5", "§2[MBuilder]");
		config.addDefault("Prefix.6", "§a[Builder]");
		config.addDefault("Prefix.7", "§3[Mod]");
		config.addDefault("Prefix.8", "§2[Sup]");
		config.addDefault("Prefix.9", "&6[Krieger]");
		config.addDefault("Prefix.10", "&6[Jäger]");
		config.addDefault("Prefix.11", "[Tut]");
		
		config.options().copyDefaults(true);
	    try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}

	}

