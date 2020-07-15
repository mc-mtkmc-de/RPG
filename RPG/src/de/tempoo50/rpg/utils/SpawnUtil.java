package de.tempoo50.rpg.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class SpawnUtil {
	
	public static void spawnZombie(Location location) {
		
		Zombie zom = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
		zom.setCustomName(NameUtil.ZOMBIE);
		zom.setCustomNameVisible(true);
		
	}
	
	public static void spawnwhitch(Location location) {
		
		Witch wit = (Witch) location.getWorld().spawnEntity(location, EntityType.WITCH);
		wit.setCustomName(NameUtil.WITCH);
		wit.setCustomNameVisible(true);
	
	}
	
	public static void spawnPig(Location location) {
		
		Pig pig = (Pig) location.getWorld().spawnEntity(location, EntityType.PIG);
		pig.setCustomName(NameUtil.PIG);
		pig.setCustomNameVisible(true);
		
	}
	
	public static void spawnCow(Location location) {
		
		Cow cow = (Cow) location.getWorld().spawnEntity(location, EntityType.COW);
		cow.setCustomName(NameUtil.COW);
		cow.setCustomNameVisible(true);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void spawnSkelett(Location location) {
		
		Skeleton ske = (Skeleton) location.getWorld().spawnEntity(location, EntityType.SKELETON);
		Chicken chi = (Chicken) location.getWorld().spawnEntity(location, EntityType.CHICKEN);
		chi.setPassenger(ske);
		ske.setCustomName(NameUtil.SKELETT);
		ske.setCustomNameVisible(true);
		ske.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		ske.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_AXE));

	}
	
	public static void spawnSpider(Location location) {
		
		Spider spi = (Spider) location.getWorld().spawnEntity(location, EntityType.SPIDER);
		spi.setCustomName(NameUtil.SPIDER);
		spi.setCustomNameVisible(true);
		
	}
	
	public static void spawnGiant(Location location) {
		
		Giant gia = (Giant) location.getWorld().spawnEntity(location, EntityType.GIANT);
		gia.setCustomName(NameUtil.GIANT);
		gia.setCustomNameVisible(true);
		gia.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
		gia.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
		
	}

}
