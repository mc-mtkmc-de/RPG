package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Witch;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillWitch implements Listener {
	
	private Rpg plugin;
	
	public KillWitch(Rpg plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void killWitch(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Witch)) return;
		Witch wit = (Witch) event.getEntity();
		if(!wit.getCustomName().contains(NameUtil.WITCH)) return;
		
		event.getDrops().clear();
		ItemStack totem = new ItemStack(Material.TOTEM);
		wit.getWorld().dropItemNaturally(wit.getLocation(), totem);
		
		if(wit.isDead()) {
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnwhitch(wit.getLocation());
					
				}
			}, (int) config.get("Respawn.Witch")*20);
		}
		
		
	}

}
