package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Vex;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillVex implements Listener {
	
	
	private Rpg plugin;
	
	public KillVex(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void cowDeath(EntityDeathEvent event) {

		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(event.getEntity() instanceof Vex) {
			
			Vex ve = (Vex) event.getEntity();
			event.getDrops().clear();
			
			if(ve.getCustomName().contains(NameUtil.VEX)) {
				
				if(ve.isDead()) {
					
					Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
						
						@Override
						public void run() {
							SpawnUtil.spawnPixi(ve.getLocation());
							
						}
					}, (int) config.get("Respawn.Vex")*20);
				}
				
			}
			
		}
	
	}

}