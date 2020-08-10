package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Player;
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

public class KillEvoker implements Listener {
	
	
	private Rpg plugin;
	
	public KillEvoker(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void evokerDeath(EntityDeathEvent event) {
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if(!(event.getEntity() instanceof Evoker)) return;
		Evoker evo = (Evoker) event.getEntity();
		if(!evo.getCustomName().contains(NameUtil.EVOKER)) return;
		
		event.getDrops().clear();
		
		ItemStack mon = new ItemStack(Material.IRON_NUGGET);
		ItemMeta monmeta = mon.getItemMeta();
		monmeta.setDisplayName(ItemUtil.MONEY);
		mon.setAmount(10);
		mon.setItemMeta(monmeta);
		
		ItemStack heal = new ItemStack(Material.IRON_CHESTPLATE);
		
		evo.getWorld().dropItemNaturally(evo.getLocation(), mon);
		evo.getWorld().dropItemNaturally(evo.getLocation(), heal);
		
		if(evo.isDead()) {
			
			Player player = evo.getKiller();
			
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10, 2));
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					SpawnUtil.spawnMage(evo.getLocation());
					
				}
			}, (int) config.get("Respawn.Evoker")*20);
		}

		
	}

}