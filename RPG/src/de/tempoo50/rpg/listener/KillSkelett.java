package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillSkelett implements Listener {
	
	
	private Rpg plugin;
	
	public KillSkelett(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void cowDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Skeleton)) return;
		Skeleton ske = (Skeleton) event.getEntity();
		if(!ske.getCustomName().contains(NameUtil.SKELETT)) return;
		
		event.getDrops().clear();
		ItemStack exp = new ItemStack(Material.EXP_BOTTLE, 5);
		ske.getWorld().dropItemNaturally(ske.getLocation(), exp);
		
		if(ske.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnSkelett(ske.getLocation());
					
				}
			}, (int) config.get("Respawn.Skelett")*20);
		}

		
	}

}

