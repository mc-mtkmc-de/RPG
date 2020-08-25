package de.tempoo50.rpg.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.tempoo50.rpg.utils.ClanStats;

public class ClanDeath implements Listener {
	
	@EventHandler
	public void onClanDeath(PlayerDeathEvent event) {
		Player gestorben = event.getEntity();
		ClanStats.addDeath(gestorben);
		try {
			Player killer = gestorben.getKiller();
			ClanStats.addKill(killer);
		}catch(Exception k) {
			
		}
	}

}
