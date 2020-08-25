package de.tempoo50.rpg.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.tempoo50.rpg.utils.ClanFunktionen;
import de.tempoo50.rpg.utils.ClanPlayer;

public class ClanQuit implements Listener {
	
	@EventHandler
	public void onClanQuit(PlayerQuitEvent event) {
		
		Player player = event.getPlayer();
		
		if(!(ClanPlayer.getClan(player) == null)) {
			ClanFunktionen.msgisoffline(player, ClanPlayer.getClan(player));
		}
		
	}

}
