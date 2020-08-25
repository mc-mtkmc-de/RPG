package de.tempoo50.rpg.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;

import de.tempoo50.rpg.files.ClanData;

public class ClanManager {
	
private static FileConfiguration data = ClanData.Clan;
	
	public static void createClan(OfflinePlayer p, String clan, String kurz) {
		data.set("Clan." + clan + ".prefix", kurz);
		ClanPlayer.setClan(p, clan);
		ClanManager.promotePlayer(p, clan);
		ClanData.saveClanFile();
	}
	public static void deleteClan(String clan) {
		for(String uuid : getMember(clan)) {
			ClanPlayer.leaveClan(Bukkit.getOfflinePlayer(UUID.fromString(uuid)), clan);
			if(Bukkit.getOfflinePlayer(UUID.fromString(uuid)).isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanaufgelost());
			}
		}
		for(String uuid : getAdmins(clan)) {
			ClanPlayer.leaveClan(Bukkit.getOfflinePlayer(UUID.fromString(uuid)), clan);
			if(Bukkit.getOfflinePlayer(UUID.fromString(uuid)).isOnline()) {
				Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanaufgelost());
			}
		}
		data.set("Clan." + clan, null);
		data.set("Clan." + clan, " ");
		ClanData.saveClanFile();
	}
	public static List<String> getMember(String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			return member;
		}
		catch(Exception k) {
			return new ArrayList<String>();
		}
	}
	public static List<String> getAdmins(String clan) {
		try {
			List<String> admins = data.getStringList("Clan." + clan + ".admins");
			return admins;
		}
		catch(Exception k) {
			return new ArrayList<String>();
		}
	}
	public static void addMember(OfflinePlayer p, String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			member.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			ClanData.saveClanFile();
		} catch(Exception k) {
			List<String> member = new ArrayList<String>();
			member.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			ClanData.saveClanFile();
		}
	}
	public static void removeMember(OfflinePlayer p, String clan) {
		try {
			List<String> member = data.getStringList("Clan." + clan + ".members");
			member.remove(p.getUniqueId().toString());
			data.set("Clan." + clan + ".members", member);
			ClanData.saveClanFile();
		} catch(Exception k) {
			k.printStackTrace();
		}
	}
	public static void addAdmin(OfflinePlayer p, String clan) {
		try {
			List<String> admins = data.getStringList("Clan." + clan + ".admins");
			admins.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admins);
			ClanData.saveClanFile();
		} catch(Exception k) {
			List<String> admins = new ArrayList<String>();
			admins.add(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admins);
			ClanData.saveClanFile();
		}
	}
	public static void removeAdmin(OfflinePlayer p, String clan) {
		try {
			List<String> admin = data.getStringList("Clan." + clan + ".admins");
			admin.remove(p.getUniqueId().toString());
			data.set("Clan." + clan + ".admins", admin);
			ClanData.saveClanFile();
		} catch(Exception k) {
			k.printStackTrace();
		}
	}
	public static void editPrefix(String clan, String prefix) {
		data.set("Clan." + clan + "prefix", prefix);
		ClanData.saveClanFile();
	}
	public static String getPrefix(String clan) {
		try{
			return data.getString("Clan." + clan + ".prefix");
		}catch(Exception f) {
			return null;
		}
	}
	public static void promotePlayer(OfflinePlayer p, String clan) {
		removeMember(p, clan);
		addAdmin(p, clan);
	}
}