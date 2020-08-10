package de.tempoo50.rpg.listener;

import org.bukkit.entity.WitherSkeleton;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.NameUtil;

public class KillWitherSkelett implements Listener {

	
	@EventHandler
	public void onDeath(EntityDeathEvent event) {

		if(!(event.getEntity() instanceof WitherSkeleton)) return;
		WitherSkeleton wit = (WitherSkeleton) event.getEntity();
		if(!wit.getCustomName().contains(NameUtil.WITHERSKELTON)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.GOLD_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.SPEZIAL3);
		mon.setAmount(5);
		mon.setItemMeta(monmeta);
		
		wit.getWorld().dropItemNaturally(wit.getLocation(), mon);
		
	}

}