package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillZombie implements Listener {

	private Rpg plugin;
	
	public KillZombie(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Zombie)) return;
		Zombie zom = (Zombie) event.getEntity();
		if(!zom.getCustomName().contains(NameUtil.ZOMBIE)) return;
		
		event.getDrops().clear();
		ItemStack sworddrop = new ItemStack(Material.WOOD_SWORD);
		zom.getWorld().dropItemNaturally(zom.getLocation(), sworddrop);

		if(zom.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnZombie(zom.getLocation());
					
				}
			}, (int) config.get("Respawn.Zombie")*20);
		}
		
	}

}
