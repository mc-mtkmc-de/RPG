package de.tempoo50.rpg.listener;

import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.tempoo50.rpg.utils.NameUtil;

public class KillVillager implements Listener {
	
	@EventHandler
	public void onKillVillager(EntityDamageByEntityEvent event) {
		
		if(!(event.getEntity() instanceof Villager)) return;
		Villager vil = (Villager) event.getEntity();
		if(!vil.getCustomName().equals(NameUtil.VILLAGER)) return;
		
		event.setCancelled(true);
		
	}

}
