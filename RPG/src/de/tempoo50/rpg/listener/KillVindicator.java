package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vindicator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.NameUtil;
import de.tempoo50.rpg.utils.SpawnUtil;

public class KillVindicator implements Listener {
	
	
	private Rpg plugin;
	
	public KillVindicator(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void vindicatorDeath(EntityDeathEvent event) {
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Vindicator)) return;
		Vindicator vin = (Vindicator) event.getEntity();
		if(!vin.getCustomName().contains(NameUtil.VINDICATOR)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.IRON_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.MONEY);
		mon.setAmount(5);
		mon.setItemMeta(monmeta);
		
		vin.getWorld().dropItemNaturally(vin.getLocation(), mon);
		
		if(vin.isDead()) {
			
			Player player = vin.getKiller();
			
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10, 2));
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnIllager(vin.getLocation());
					
				}
			}, (int) config.get("Respawn.Vindicator")*20);
		}

		
	}

}