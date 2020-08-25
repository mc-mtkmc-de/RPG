package de.tempoo50.rpg.utils;

import java.util.List;

import org.bukkit.OfflinePlayer;

import de.tempoo50.rpg.files.ClanData;

public class Invitemet {

	public static boolean PlayerJoin(OfflinePlayer p, String clan) {
		List<String> invites = ClanPlayer.getInvites(p);
		if(invites.contains(clan)) {
			int players = ClanManager.getAdmins(clan).size() + ClanManager.getMember(clan).size();
			if(players < ClanUtil.maxperclan()) {
				if(!(ClanData.Clan.getString("Clan." + clan) == null)) {
					ClanPlayer.setClan(p, clan);
					ClanPlayer.removeInvite(p, clan);
					ClanFunktionen.Playergejoint(p, clan);
					return true;
				}else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public static void PlayerDeny(OfflinePlayer p, String clan) {
		List<String> invites = ClanPlayer.getInvites(p);
		if(invites.contains(clan)) {
			ClanPlayer.removeInvite(p, clan);
			ClanFunktionen.Einladungabgelehnt(p, clan);
		}
	}
}
