package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Giant;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillGiant implements Listener {
	
	private Rpg plugin;
	
	public KillGiant(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void giantDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Giant)) return;
		Giant gia = (Giant) event.getEntity();
		if(!gia.getCustomName().contains(NameUtil.GIANT)) return;
		
		event.getDrops().clear();
		ItemStack sword = new ItemStack(Material.IRON_SWORD);
		gia.getWorld().dropItemNaturally(gia.getLocation(), sword);
		
		if(gia.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnGiant(gia.getLocation());
					
				}
			}, (int) config.get("Respawn.Giant")*20);
		}

		
	}

}
