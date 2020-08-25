package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ClanFile {
	
	public static void loadFile() {
		
		File file = new File("plugins//RPG//Clan//ClanConfig.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("prefix", "&7[&6&lClans&7]");
		config.addDefault("max players in clan", 9);
		config.addDefault("message.Du bist in keinem Clan", "&cDu bist in keinem Clan");
		config.addDefault("message.Clan verlassen", "&cDu hast den Clan verlassen!");
		config.addDefault("message.Clan Einladung nicht angenommen", "&7Der Spieler &e%player& &7hat die &cClan &7Anfrage abgelehnt&8.");
		config.addDefault("message.Spieler war noch nie online", "&7Der &eSpieler &7war noch nie auf dem Server&8.");
		config.addDefault("message.Folgende Clans wollen einladen", "&eFolgende Clans wollen dich einladen:");
		config.addDefault("message.clan Einladung erhalten", "&7Du hast eine Einladung zum Clan &e%clan% &7erhalten&8.");
		config.addDefault("message.clan Einladung annehmen/ablehnen", "&7Nutze &e/clan join &7oder &c/clan deny&8.");
		config.addDefault("message.Spieler eingeladen", "&2Der Spieler wurde eingeladen");
		config.addDefault("message.Spieler bereits in Clan", "&cDer Spieler ist bereits in einem Clan!");
		config.addDefault("message.Spieler aus Clan gekickt", "&cDer Spieler wurde aus dem Clan gekickt!");
		config.addDefault("message.Du wurdest aus dem Clan gekickt", "&4Du wurdest aus dem Clan gekickt!");
		config.addDefault("message.Spieler promotet", "&aDer Spieler wurde zum Clanadmin gemacht!");
		config.addDefault("message.in Clan gejoint", "&aDu bist dem Clan beigetreten!");
		config.addDefault("message.Spieler in Clan beigetreten", "&7Der Spieler &e%player% &7ist dem Clan beigetreten&8.");
		config.addDefault("message.Einladung nicht angenommen", "&cDu hast die Einladung nicht angenommen!");
		config.addDefault("message.clan erstellt", "&aDer Clan wurde erstellt!");
		config.addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		config.addDefault("message.Du bist schon in einem Clan", "&4Du bist schon in einem Clan!");
		config.addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		config.addDefault("message.Clan wurde aufgelost", "&4Der Clan wurde aufgelöst!");
		config.addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		config.addDefault("message.Spieler geht online", "&aDer Spieler &e%player%&a kommt online!");
		config.addDefault("message.Spieler geht offline", "&cDer Spieler &e%player% &cgeht offline!");
		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
