package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillSpider implements Listener {
	
	
	private Rpg plugin;
	
	public KillSpider(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void cowDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Spider)) return;
		Spider spi = (Spider) event.getEntity();
		if(!spi.getCustomName().contains(NameUtil.SPIDER)) return;
		
		event.getDrops().clear();
		ItemStack boot = new ItemStack(Material.LEATHER_BOOTS);
		spi.getWorld().dropItemNaturally(spi.getLocation(), boot);
		
		if(spi.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnSpider(spi.getLocation());
					
				}
			}, (int) config.get("Respawn.Spider")*20);
		}

		
	}

}
