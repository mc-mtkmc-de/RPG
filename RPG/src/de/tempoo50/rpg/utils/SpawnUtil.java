package de.tempoo50.rpg.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
	
	public static void spawnVillager(Location location) {
		
		Villager vil = (Villager) location.getWorld().spawnEntity(location, EntityType.VILLAGER);
		vil.setCustomName(NameUtil.VILLAGER);
		vil.setCustomNameVisible(true);
		
	}
	
	public static void spawnMage(Location location) {
		
		Evoker evo = (Evoker) location.getWorld().spawnEntity(location, EntityType.EVOKER);
		evo.setCustomName(NameUtil.EVOKER);
		evo.setCustomNameVisible(true);
		evo.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 360000, 1));
		evo.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 360000, 1));
		
	}
	
	public static void spawnSlime(Location location) {
		
		Slime sli = (Slime) location.getWorld().spawnEntity(location, EntityType.SLIME);
		sli.setCustomName(NameUtil.SLIME);
		sli.setCustomNameVisible(true);
		sli.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 360000, 10));
		sli.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
		
	}
	
	public static void spawnCreeper(Location location) {
		
		Creeper cre = (Creeper) location.getWorld().spawnEntity(location, EntityType.CREEPER);
		cre.setCustomName(NameUtil.CREEPER);
		cre.setCustomNameVisible(true);
		cre.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 360000, 3));
		cre.setExplosionRadius(10);
		cre.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 360000, 1));
		
	}
	
	public static void spawnIllusioner(Location location) {
		
			Illusioner ill = (Illusioner) location.getWorld().spawnEntity(location, EntityType.ILLUSIONER);
			ill.setCustomName(NameUtil.ILLUSIONER);
			ill.setCustomNameVisible(true);
		
	}
	
	public static void spawnWither(Location location) {
		
		Wither wit = (Wither) location.getWorld().spawnEntity(location, EntityType.WITHER);
		WitherSkeleton wis = (WitherSkeleton) location.getWorld().spawnEntity(location, EntityType.WITHER_SKELETON);
		wis.setCustomName(NameUtil.WITHERSKELTON);
		wis.setCustomNameVisible(true);
		wis.getEquipment().setItemInMainHand(new ItemStack(Material.BOW));
		wis.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
		wis.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
		wit.setCustomName(NameUtil.WITHER);
		wit.setCustomNameVisible(true);
		wit.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
		wit.addPassenger(wis);
		
	}
	
	public static void spawnIllager(Location location) {
		
		Vindicator vin = (Vindicator) location.getWorld().spawnEntity(location, EntityType.VINDICATOR);
		vin.setCustomName(NameUtil.VINDICATOR);
		vin.setCustomNameVisible(true);
		vin.getEquipment().setItemInMainHand(new ItemStack(Material.BOW));
		
	}
	
	public static void spawnBlaze(Location location) {
		
		Blaze bla = (Blaze) location.getWorld().spawnEntity(location, EntityType.BLAZE);
		bla.setCustomName(NameUtil.BLAZE);
		bla.setCustomNameVisible(true);
		
	}

	public static void spawnPixi(Location location) {
		
		Vex ve = (Vex) location.getWorld().spawnEntity(location, EntityType.VEX);
		ve.setCustomName(NameUtil.VEX);
		ve.setCustomNameVisible(true);
		
	}
	
	public static void spawnWanderer(Location location) {
		
		Stray str = (Stray) location.getWorld().spawnEntity(location, EntityType.STRAY);
		str.setCustomName(NameUtil.STRAY);
		str.setCustomNameVisible(true);
		
	}
	
}
