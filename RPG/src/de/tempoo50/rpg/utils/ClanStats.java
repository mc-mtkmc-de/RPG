package de.tempoo50.rpg.utils;

import org.bukkit.OfflinePlayer;

import de.tempoo50.rpg.files.ClanData;

public class ClanStats {

	public static void addKill(OfflinePlayer p) {
		String clan = ClanPlayer.getClan(p);
		try{
			int newkills = ClanData.Clan.getInt("Clan." + clan + ".kills")+1;
			ClanData.Clan.set("Clan." + clan + ".kills", newkills);
		}
		catch(Exception k) {
			int newkills = 1;
			ClanData.Clan.set("Clan." + clan + ".kills", newkills);
		}
		ClanData.saveClanFile();
	}
	public static void addDeath(OfflinePlayer p) {
		String clan = ClanPlayer.getClan(p);
		try{
			int newdeaths = ClanData.Clan.getInt("Clan." + clan + ".deaths")+1;
			ClanData.Clan.set("Clan." + clan + ".deaths", newdeaths);
		}
		catch(Exception k) {
			int newdeaths = 1;
			ClanData.Clan.set("Clan." + clan + ".kills", newdeaths);
		}
		ClanData.saveClanFile();
	}
	public static int getkills(String clan) {
		try{
			return ClanData.Clan.getInt("Clan." + clan + ".kills");
		}
		catch(Exception k) {
			return 0;
		}
	}
	public static int getdeaths(String clan) {
		try{
			return ClanData.Clan.getInt("Clan." + clan + ".deaths");
		}
		catch(Exception k) {
			return 0;
		}
	}
}
