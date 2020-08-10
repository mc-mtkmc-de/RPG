package de.tempoo50.rpg.listener;

import org.bukkit.entity.Chicken;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class KillChicken implements Listener {
	
	@EventHandler
	public void cowDeath(EntityDeathEvent event) {

		if(!(event.getEntity() instanceof Chicken)) return;
		@SuppressWarnings("unused")
		Chicken chi = (Chicken) event.getEntity();
		
		event.getDrops().clear();


		
	}

}
