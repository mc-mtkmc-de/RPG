package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillSlime implements Listener {
	
	
	private Rpg plugin;
	
	public KillSlime(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void slimeDeath(EntityDeathEvent event) {
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Slime)) return;
		Slime sli = (Slime) event.getEntity();
		if(!sli.getCustomName().contains(NameUtil.SLIME)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.IRON_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.MONEY);
		mon.setAmount(5);
		mon.setItemMeta(monmeta);

		
		sli.getWorld().dropItemNaturally(sli.getLocation(), mon);

		
		if(sli.isDead()) {
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnSlime(sli.getLocation());
					
				}
			}, (int) config.get("Respawn.Slime")*20);
		}

		
	}
	
	@EventHandler
	public void slimeSplit(SlimeSplitEvent event) {
		
		event.setCancelled(true);
		
	}

}