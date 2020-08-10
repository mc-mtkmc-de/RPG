package de.tempoo50.rpg.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
	
	@EventHandler
	
	public void handlePlayerDeath(PlayerDeathEvent event) {
		
		@SuppressWarnings("unused")
		Player player = event.getEntity();
		event.setDeathMessage("");
		event.setKeepInventory(true);
		event.setKeepLevel(true);
		
	}

}
