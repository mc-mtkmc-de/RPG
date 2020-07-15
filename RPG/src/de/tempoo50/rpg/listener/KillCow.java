package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Cow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillCow implements Listener {
	
	private Rpg plugin;
	
	public KillCow(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void cowDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Cow)) return;
		Cow cow = (Cow) event.getEntity();
		if(!cow.getCustomName().contains(NameUtil.COW)) return;
		
		event.getDrops().clear();
		ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
		cow.getWorld().dropItemNaturally(cow.getLocation(), food);
		
		if(cow.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnCow(cow.getLocation());
					
				}
			}, (int) config.get("Respawn.Cow")*20);
		}

		
	}

}
