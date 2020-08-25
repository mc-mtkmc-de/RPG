package de.tempoo50.rpg.utils;

import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class ClanFunktionen {
	
	public static void sendMessage(OfflinePlayer player, String clan, String msg) {
		List<String> list = ClanManager.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan-Chat" + "§8] §e" + player.getName() + "§8: §7" + msg);
			}
		}
		List<String> listm = ClanManager.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan-Chat" + "§8] §e" + player.getName() + "§8: §7" + msg);
			}
		}
	}
	public static void msgisonline(OfflinePlayer p, String clan) {
		List<String> list = ClanManager.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + ClanUtil.Spielergehtonline(p.getName()));
			}
		}
		List<String> listm = ClanManager.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + ClanUtil.Spielergehtonline(p.getName()));
			}
		}
	}
	public static void msgisoffline(OfflinePlayer p, String clan) {
		List<String> list = ClanManager.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + ClanUtil.Spielergehtoffline(p.getName()));
			}
		}
		List<String> listm = ClanManager.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage("§8[§e" + "Clan" + "§8] " + ClanUtil.Spielergehtoffline(p.getName()));
			}
		}
	}
	public static void Playergejoint(OfflinePlayer player, String clan) {
		List<String> list = ClanManager.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielergejoint(player.getName()));
			}
		}
		List<String> listm = ClanManager.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Spielergejoint(player.getName()));
			}
		}
	}
	public static void Einladungabgelehnt(OfflinePlayer player, String clan) {
		List<String> list = ClanManager.getAdmins(clan);
		for(String uuid : list) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Einladungabgelehnt(player.getName()));
			}
		}
		List<String> listm = ClanManager.getMember(clan);
		for(String uuid : listm) {
			OfflinePlayer pl = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
			if(pl.isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Einladungabgelehnt(player.getName()));
			}
		}
	}
}