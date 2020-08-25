package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

public class ClanUtil {
	
	static File file = new File("plugins//RPG//Clan//ClanConfig.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static String prefix() {
		return config.getString("prefix").replaceAll("&", "§");
	}
	public static Integer maxperclan() {
		return config.getInt("max players in clan");
	}
	public static String DubistinkeinemClan() {
		return config.getString("message.Du bist in keinem Clan").replaceAll("&", "§");
	}
	public static String Clanverlassen() {
		return config.getString("message.Clan verlassen").replaceAll("&", "§");
	}
	public static String Clanseinladen() {
		return config.getString("message.Folgende Clans wollen einladen").replaceAll("&", "§");
	}
	public static String Spielereingeladen() {
		return config.getString("message.Spieler eingeladen").replaceAll("&", "§");
	}
	public static String SpielerbereitsinClan() {
		return config.getString("message.Spieler bereits in Clan").replaceAll("&", "§");
	}
	public static String Spielergekickt() {
		return config.getString("message.Spieler aus Clan gekickt").replaceAll("&", "§");
	}
	public static String Dugekickt() {
		return config.getString("message.Du wurdest aus dem Clan gekickt").replaceAll("&", "§");
	}
	public static String Spielerpromotet() {
		return config.getString("message.Spieler promotet").replaceAll("&", "§");
	}
	public static String gejoint() {
		return config.getString("message.in Clan gejoint").replaceAll("&", "§");
	}
	public static String Spielergejoint(String name) {
		return config.getString("message.Spieler in Clan beigetreten").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String einladungnichtangenommen() {
		return config.getString("message.Einladung nicht angenommen").replaceAll("&", "§");
	}
	public static String Clanerstellt() {
		return config.getString("message.clan erstellt").replaceAll("&", "§");
	}
	public static String Clangibtsschon() {
		return config.getString("message.Clan gibt es schon").replaceAll("&", "§");
	}
	public static String Dubistbereitsineinemclan() {
		return config.getString("message.Du bist schon in einem Clan").replaceAll("&", "§");
	}
	public static String Clanaufgelost() {
		return config.getString("message.Clan wurde aufgelost").replaceAll("&", "§");
	}
	public static String Spielergehtonline(String name) {
		return config.getString("message.Spieler geht online").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String Spielergehtoffline(String name) {
		return config.getString("message.Spieler geht offline").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String joinoderdeny() {
		return config.getString("message.clan Einladung annehmen/ablehnen").replaceAll("&", "§");
	}
	public static String Einladungerhalten(String name) {
		return config.getString("message.clan Einladung erhalten").replaceAll("&", "§").replaceAll("%clan%", name);
	}
	public static String Einladungabgelehnt(String name) {
		return config.getString("message.Clan Einladung nicht angenommen").replaceAll("&", "§").replaceAll("%player%", name);
	}
	public static String Spielernochnieonline() {
		return config.getString("message.Spieler war noch nie online").replaceAll("&", "§");
	}
}
