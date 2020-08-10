package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Illusioner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillIllusioner implements Listener {
	
	
	private Rpg plugin;
	
	public KillIllusioner(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void evokerDeath(EntityDeathEvent event) {
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Illusioner)) return;
		Illusioner ill = (Illusioner) event.getEntity();
		if(!ill.getCustomName().contains(NameUtil.ILLUSIONER)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.IRON_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.MONEY);
		mon.setAmount(10);
		mon.setItemMeta(monmeta);
		
		ill.getWorld().dropItemNaturally(ill.getLocation(), mon);
		
		if(ill.isDead()) {

			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnIllusioner(ill.getLocation());
					
				}
			}, (int) config.get("Respawn.Illusioner")*20);
		}

		
	}

}