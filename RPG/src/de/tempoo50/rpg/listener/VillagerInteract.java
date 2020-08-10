package de.tempoo50.rpg.listener;

import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.ShopManager;

public class VillagerInteract implements Listener {
	
	@EventHandler
	public void onhandleVillager(PlayerInteractEntityEvent event) {
		
		if(event.getRightClicked() instanceof Villager) {
			Villager vil = (Villager) event.getRightClicked();
			if(vil.getCustomName().equals(NameUtil.VILLAGER)) {
				event.setCancelled(true);
				Player player = event.getPlayer();
				ShopManager.openShopInv(player);
				
			}
			
		}
		
		
		
	}

}
