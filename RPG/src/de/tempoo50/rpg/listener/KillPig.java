package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillPig implements Listener {
	
	private Rpg plugin;
	
	public KillPig(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void pigDeath(EntityDeathEvent event) {
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Pig)) return;
		Pig pig = (Pig) event.getEntity();
		if(!pig.getCustomName().contains(NameUtil.PIG)) return;
		
		event.getDrops().clear();
		ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
		pig.getWorld().dropItemNaturally(pig.getLocation(), food);
		
		if(pig.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnPig(pig.getLocation());
					
				}
			}, (int) config.get("Respawn.Pig")*20);
		}
		
		
		
		
	}

}
