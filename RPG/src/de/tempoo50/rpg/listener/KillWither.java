package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillWither implements Listener {

	private Rpg plugin;
	
	public KillWither(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Wither)) return;
		Wither wit = (Wither) event.getEntity();
		if(!wit.getCustomName().contains(NameUtil.WITHER)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.GOLD_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.SPEZIAL3);
		mon.setAmount(5);
		mon.setItemMeta(monmeta);
		
		wit.getWorld().dropItemNaturally(wit.getLocation(), mon);
		
		if(wit.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnZombie(wit.getLocation());
					
				}
			}, (int) config.get("Respawn.Wither")*20);
		}
		
	}

}