package de.tempoo50.rpg.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;

import de.tempoo50.rpg.files.ClanData;
import de.tempoo50.rpg.files.ClanPlayerData;

public class ClanPlayer {
	
	private static FileConfiguration data = ClanPlayerData.Player;
	
	public static String getClan(OfflinePlayer p) {
		try {
			return data.getString("Player." + p.getUniqueId() + ".Clan");
		} catch(Exception k) {
			return null;
		}
	}
	public static void setClan(OfflinePlayer p, String clan) {
		ClanManager.addMember(p, clan);
		data.set("Player." + p.getUniqueId() + ".Clan", clan);
		ClanPlayerData.savePlayerFile();
	}
	public static void leaveClan(OfflinePlayer p, String clan) {
		data.set("Player." + p.getUniqueId() + ".Clan", null);
		ClanPlayerData.savePlayerFile();
		if(isadmin(p, clan)) {
			ClanManager.removeAdmin(p, clan);
		} else {
			ClanManager.removeMember(p, clan);
		}
	}
	public static void invitePlayer(OfflinePlayer invited, String clan) {
		try {
			List<String> invite = data.getStringList("Player." + invited.getUniqueId() + ".invite");
			if(!invite.contains(clan)) {
				invite.add(clan);
			}
			data.set("Player." + invited.getUniqueId() + ".invite", invite);
			ClanPlayerData.savePlayerFile();
		} catch(Exception k) {
			List<String> invite = new ArrayList<String>();
			invite.add(clan);
			data.set("Player." + invited.getUniqueId() + ".invite", invite);
			ClanPlayerData.savePlayerFile();
		}
	}
	public static List<String> getInvites(OfflinePlayer p) {
		return data.getStringList("Player." + p.getUniqueId() + ".invite");
	}
	public static void removeInvite(OfflinePlayer p, String clan) {
		try {
			List<String> invite = data.getStringList("Player." + p.getUniqueId() + ".invite");
			invite.remove(clan);
			data.set("Player." + p.getUniqueId() + ".invite", invite);
			ClanPlayerData.savePlayerFile();
		} catch(Exception f) {
			f.printStackTrace();
		}
	}
	public static boolean isadmin(OfflinePlayer p, String clan) {
		List<String> admins = ClanData.Clan.getStringList("Clan." + clan + ".admins");
		if(admins.contains(p.getUniqueId().toString())) {
			return true;
		} else {
			return false;
		}
	}
}
