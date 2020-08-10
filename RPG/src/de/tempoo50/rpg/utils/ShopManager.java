package de.tempoo50.rpg.utils;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopManager {
	
	public static Inventory ShopInv;//fertig
	public static Inventory BowInv;//fertig
	public static Inventory SwordInv;//fertig
	public static Inventory ArmorInv;//fertig
	public static Inventory SpezialInv;//fertig
	public static Inventory AxeInv;//fertig
	public static Inventory ShieldInv;//fertig
	
	public static void openShopInv(Player player) {
		
		Inventory shop = ShopInv;
		
		ItemStack bow = new ItemStack(Material.BOW);
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName(ItemUtil.BOW);
		bow.setItemMeta(bowmeta);
		
		ItemStack sword = new ItemStack(Material.WOOD_SWORD);
		ItemMeta swordmeta = sword.getItemMeta();
		swordmeta.setDisplayName(ItemUtil.SWORD);
		sword.setItemMeta(swordmeta);
		
		ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta armormeta = armor.getItemMeta();
		armormeta.setDisplayName(ItemUtil.ARMOR);
		armor.setItemMeta(armormeta);
		
		ItemStack spezial = new ItemStack(Material.MOB_SPAWNER);
		ItemMeta spezialmeta = spezial.getItemMeta();
		spezialmeta.setDisplayName(ItemUtil.SPEZIAL);
		spezial.setItemMeta(spezialmeta);
		
		ItemStack axe = new ItemStack(Material.WOOD_AXE);
		ItemMeta axemeta = axe.getItemMeta();
		axemeta.setDisplayName(ItemUtil.AXE);
		axe.setItemMeta(axemeta);
		
		ItemStack shield = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta = shield.getItemMeta();
		shieldmeta.setDisplayName(ItemUtil.SHIELD);
		shield.setItemMeta(shieldmeta);
		
		shop.setItem(0, bow);
		shop.setItem(2, sword);
		shop.setItem(4, axe);
		shop.setItem(6, armor);
		shop.setItem(8, shield);
		shop.setItem(10, spezial);
		
		player.openInventory(ShopInv);
		
	}
	
	public static void openBowInv(Player player) {
		
		
		Inventory bowinv = BowInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack arrow = new ItemStack(Material.ARROW);
		ItemMeta arrowmeta = arrow.getItemMeta();
		arrowmeta.setDisplayName(ItemUtil.ARROW);
		ArrayList<String> lorearrow = new ArrayList<String>();
		lorearrow.add("Das Item kostet §b5 " + ItemUtil.MONEY);
		arrowmeta.setLore(lorearrow);
		arrow.setItemMeta(arrowmeta);
		
		ItemStack bow = new ItemStack(Material.BOW);//20 in
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName(ItemUtil.BOW1);
		bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b20 " + ItemUtil.MONEY);
		bowmeta.setLore(lore);
		bow.setItemMeta(bowmeta);
		
		ItemStack bow1 = new ItemStack(Material.BOW);//30 in
		ItemMeta bowmeta1 = bow1.getItemMeta();
		bowmeta1.setDisplayName(ItemUtil.BOW2);
		bowmeta1.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b30 " + ItemUtil.MONEY);
		bowmeta1.setLore(lore1);
		bow1.setItemMeta(bowmeta1);
		
		ItemStack bow2 = new ItemStack(Material.BOW);//40 in
		ItemMeta bowmeta2 = bow2.getItemMeta();
		bowmeta2.setDisplayName(ItemUtil.BOW3);
		bowmeta2.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b40 " + ItemUtil.MONEY);
		bowmeta2.setLore(lore2);
		bow2.setItemMeta(bowmeta2);
		
		ItemStack bow3 = new ItemStack(Material.BOW);//50 in
		ItemMeta bowmeta3 = bow3.getItemMeta();
		bowmeta3.setDisplayName(ItemUtil.BOW4);
		bowmeta3.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b50 " + ItemUtil.MONEY);
		bowmeta3.setLore(lore3);
		bow3.setItemMeta(bowmeta3);
		
		ItemStack bow4 = new ItemStack(Material.BOW);//60 in
		ItemMeta bowmeta4 = bow4.getItemMeta();
		bowmeta4.setDisplayName(ItemUtil.BOW5);
		bowmeta4.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add("Das Item kostet §b60 " + ItemUtil.MONEY);
		bowmeta4.setLore(lore4);
		bow4.setItemMeta(bowmeta4);
		
		ItemStack bow5 = new ItemStack(Material.BOW);//10 ib
		ItemMeta bowmeta5 = bow5.getItemMeta();
		bowmeta5.setDisplayName(ItemUtil.BOW6);
		bowmeta5.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		bowmeta5.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		ArrayList<String> lore5 = new ArrayList<String>();
		lore5.add("Das Item kostet §b10 " + ItemUtil.SPEZIAL2);
		bowmeta5.setLore(lore5);
		bow5.setItemMeta(bowmeta5);
		
		ItemStack bow6 = new ItemStack(Material.BOW);//50 ib
		ItemMeta bowmeta6 = bow6.getItemMeta();
		bowmeta6.setDisplayName(ItemUtil.BOW7);
		bowmeta6.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		bowmeta6.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bowmeta6.addEnchant(Enchantment.ARROW_FIRE, 1, true);
		ArrayList<String> lore6 = new ArrayList<String>();
		lore6.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL2);
		bowmeta6.setLore(lore6);
		bow6.setItemMeta(bowmeta6);
		
		ItemStack bow7 = new ItemStack(Material.BOW);//1 gn
		ItemMeta bowmeta7 = bow7.getItemMeta();
		bowmeta7.setDisplayName(ItemUtil.BOW8);
		bowmeta7.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		bowmeta7.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bowmeta7.addEnchant(Enchantment.ARROW_FIRE, 2, true);
		ArrayList<String> lore7 = new ArrayList<String>();
		lore7.add("Das Item kostet §b1 " + ItemUtil.SPEZIAL3);
		bowmeta7.setLore(lore7);
		bow7.setItemMeta(bowmeta7);
		
		ItemStack bow8 = new ItemStack(Material.BOW);//15 gn
		ItemMeta bowmeta8 = bow8.getItemMeta();
		bowmeta8.setDisplayName(ItemUtil.BOW9);
		bowmeta8.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		bowmeta8.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bowmeta8.addEnchant(Enchantment.ARROW_FIRE, 3, true);
		ArrayList<String> lore8 = new ArrayList<String>();
		lore8.add("Das Item kostet §b15 " + ItemUtil.SPEZIAL3);
		bowmeta8.setLore(lore8);
		bow8.setItemMeta(bowmeta8);
		
		ItemStack bow9 = new ItemStack(Material.BOW);//64 gb
		ItemMeta bowmeta9 = bow9.getItemMeta();
		bowmeta9.setDisplayName(ItemUtil.BOW10);
		bowmeta9.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		bowmeta9.addEnchant(Enchantment.ARROW_FIRE, 3, true);
		bowmeta9.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bowmeta9.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bowmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore9 = new ArrayList<String>();
		lore9.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL4);
		bowmeta9.setLore(lore9);
		bow9.setItemMeta(bowmeta9);
		
		bowinv.setItem(0, bow);
		bowinv.setItem(2, bow1);
		bowinv.setItem(4, bow2);
		bowinv.setItem(6, bow3);
		bowinv.setItem(8, bow4);
		bowinv.setItem(10, bow5);
		bowinv.setItem(12, bow6);
		bowinv.setItem(14, bow7);
		bowinv.setItem(16, bow8);
		bowinv.setItem(18, bow9);
		bowinv.setItem(26, back);
		bowinv.setItem(20, arrow);
		
		player.openInventory(BowInv);
		
	}
	
	public static void openSwordInv(Player player) {
		
		Inventory swordInv = SwordInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta = sword.getItemMeta();
		swordmeta.setDisplayName(ItemUtil.SWORD1);
		swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b20 " + ItemUtil.MONEY);
		swordmeta.setLore(lore);
		sword.setItemMeta(swordmeta);
		
		ItemStack sword1 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta1 = sword1.getItemMeta();
		swordmeta1.setDisplayName(ItemUtil.SWORD2);
		swordmeta1.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b30 " + ItemUtil.MONEY);
		swordmeta1.setLore(lore1);
		sword1.setItemMeta(swordmeta1);
		
		ItemStack sword2 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta2 = sword2.getItemMeta();
		swordmeta2.setDisplayName(ItemUtil.SWORD3);
		swordmeta2.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b40 " + ItemUtil.MONEY);
		swordmeta2.setLore(lore2);
		sword2.setItemMeta(swordmeta2);
		
		ItemStack sword3 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta3 = sword3.getItemMeta();
		swordmeta3.setDisplayName(ItemUtil.SWORD4);
		swordmeta3.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b50 " + ItemUtil.MONEY);
		swordmeta3.setLore(lore3);
		sword3.setItemMeta(swordmeta3);
		
		ItemStack sword4 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta4 = sword4.getItemMeta();
		swordmeta4.setDisplayName(ItemUtil.SWORD5);
		swordmeta4.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add("Das Item kostet §b60 " + ItemUtil.MONEY);
		swordmeta4.setLore(lore4);
		sword4.setItemMeta(swordmeta4);
		
		ItemStack sword5 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta5 = sword5.getItemMeta();
		swordmeta5.setDisplayName(ItemUtil.SWORD6);
		swordmeta5.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		swordmeta5.addEnchant(Enchantment.KNOCKBACK, 1, true);
		ArrayList<String> lore5 = new ArrayList<String>();
		lore5.add("Das Item kostet §b10 " + ItemUtil.SPEZIAL2);
		swordmeta5.setLore(lore5);
		sword5.setItemMeta(swordmeta5);
		
		ItemStack sword6 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta6 = sword6.getItemMeta();
		swordmeta6.setDisplayName(ItemUtil.SWORD7);
		swordmeta6.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		swordmeta6.addEnchant(Enchantment.KNOCKBACK, 1, true);
		swordmeta6.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		ArrayList<String> lore6 = new ArrayList<String>();
		lore6.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL2);
		swordmeta6.setLore(lore6);
		sword6.setItemMeta(swordmeta6);
		
		ItemStack sword7 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta7 = sword7.getItemMeta();
		swordmeta7.setDisplayName(ItemUtil.SWORD8);
		swordmeta7.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		swordmeta7.addEnchant(Enchantment.KNOCKBACK, 1, true);
		swordmeta7.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		ArrayList<String> lore7 = new ArrayList<String>();
		lore7.add("Das Item kostet §b1 " + ItemUtil.SPEZIAL3);
		swordmeta7.setLore(lore7);
		sword7.setItemMeta(swordmeta7);
		
		ItemStack sword8 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta8 = sword8.getItemMeta();
		swordmeta8.setDisplayName(ItemUtil.SWORD9);
		swordmeta8.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		swordmeta8.addEnchant(Enchantment.KNOCKBACK, 1, true);
		swordmeta8.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		ArrayList<String> lore8 = new ArrayList<String>();
		lore8.add("Das Item kostet §b15 " + ItemUtil.SPEZIAL3);
		swordmeta8.setLore(lore8);
		sword8.setItemMeta(swordmeta8);
		
		ItemStack sword9 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordmeta9 = sword9.getItemMeta();
		swordmeta9.setDisplayName(ItemUtil.SWORD10);
		swordmeta9.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		swordmeta9.addEnchant(Enchantment.KNOCKBACK, 1, true);
		swordmeta9.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		swordmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore9 = new ArrayList<String>();
		lore9.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL4);
		swordmeta9.setLore(lore9);
		sword9.setItemMeta(swordmeta9);
		
		swordInv.setItem(0, sword);
		swordInv.setItem(2, sword1);
		swordInv.setItem(4, sword2);
		swordInv.setItem(6, sword3);
		swordInv.setItem(8, sword4);
		swordInv.setItem(10, sword5);
		swordInv.setItem(12, sword6);
		swordInv.setItem(14, sword7);
		swordInv.setItem(16, sword8);
		swordInv.setItem(18, sword9);
		swordInv.setItem(26, back);
		
		player.openInventory(SwordInv);
		
	}
	
	public static void openAxeInv(Player player) {
		
		Inventory axeInv = AxeInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta = axe.getItemMeta();
		axemeta.setDisplayName(ItemUtil.AXE1);
		axemeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b20 " + ItemUtil.MONEY);
		axemeta.setLore(lore);
		axe.setItemMeta(axemeta);
		
		ItemStack axe1 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta1 = axe1.getItemMeta();
		axemeta1.setDisplayName(ItemUtil.AXE2);
		axemeta1.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b30 " + ItemUtil.MONEY);
		axemeta1.setLore(lore1);
		axe1.setItemMeta(axemeta1);
		
		ItemStack axe2 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta2 = axe2.getItemMeta();
		axemeta2.setDisplayName(ItemUtil.AXE3);
		axemeta2.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b40 " + ItemUtil.MONEY);
		axemeta2.setLore(lore2);
		axe2.setItemMeta(axemeta2);
		
		ItemStack axe3 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta3 = axe3.getItemMeta();
		axemeta3.setDisplayName(ItemUtil.AXE4);
		axemeta3.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b50 " + ItemUtil.MONEY);
		axemeta3.setLore(lore3);
		axe3.setItemMeta(axemeta3);
		
		ItemStack axe4 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta4 = axe4.getItemMeta();
		axemeta4.setDisplayName(ItemUtil.AXE5);
		axemeta4.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add("Das Item kostet §b60 " + ItemUtil.MONEY);
		axemeta4.setLore(lore4);
		axe4.setItemMeta(axemeta4);
		
		ItemStack axe5 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta5 = axe5.getItemMeta();
		axemeta5.setDisplayName(ItemUtil.AXE6);
		axemeta5.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		axemeta5.addEnchant(Enchantment.KNOCKBACK, 1, true);
		ArrayList<String> lore5 = new ArrayList<String>();
		lore5.add("Das Item kostet §b10 " + ItemUtil.SPEZIAL2);
		axemeta5.setLore(lore5);
		axe5.setItemMeta(axemeta5);
		
		ItemStack axe6 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta6 = axe6.getItemMeta();
		axemeta6.setDisplayName(ItemUtil.AXE7);
		axemeta6.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		axemeta6.addEnchant(Enchantment.KNOCKBACK, 1, true);
		axemeta6.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		ArrayList<String> lore6 = new ArrayList<String>();
		lore6.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL2);
		axemeta6.setLore(lore6);
		axe6.setItemMeta(axemeta6);
		
		ItemStack axe7 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta7 = axe7.getItemMeta();
		axemeta7.setDisplayName(ItemUtil.AXE8);
		axemeta7.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		axemeta7.addEnchant(Enchantment.KNOCKBACK, 1, true);
		axemeta7.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		ArrayList<String> lore7 = new ArrayList<String>();
		lore7.add("Das Item kostet §b1 " + ItemUtil.SPEZIAL3);
		axemeta7.setLore(lore7);
		axe7.setItemMeta(axemeta7);
		
		ItemStack axe8 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta8 = axe8.getItemMeta();
		axemeta8.setDisplayName(ItemUtil.AXE9);
		axemeta8.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		axemeta8.addEnchant(Enchantment.KNOCKBACK, 1, true);
		axemeta8.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		ArrayList<String> lore8 = new ArrayList<String>();
		lore8.add("Das Item kostet §b15 " + ItemUtil.SPEZIAL3);
		axemeta8.setLore(lore8);
		axe8.setItemMeta(axemeta8);
		
		ItemStack axe9 = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta axemeta9 = axe9.getItemMeta();
		axemeta9.setDisplayName(ItemUtil.AXE10);
		axemeta9.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		axemeta9.addEnchant(Enchantment.KNOCKBACK, 1, true);
		axemeta9.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		axemeta9.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore9 = new ArrayList<String>();
		lore9.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL4);
		axemeta9.setLore(lore9);
		axe9.setItemMeta(axemeta9);
		
		axeInv.setItem(0, axe);
		axeInv.setItem(2, axe1);
		axeInv.setItem(4, axe2);
		axeInv.setItem(6, axe3);
		axeInv.setItem(8, axe4);
		axeInv.setItem(10, axe5);
		axeInv.setItem(12, axe6);
		axeInv.setItem(14, axe7);
		axeInv.setItem(16, axe8);
		axeInv.setItem(18, axe9);
		axeInv.setItem(26, back);
		
		player.openInventory(AxeInv);
		
	}
	
	public static void openShieldInv(Player player) {
		
		Inventory shieldInv = ShieldInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack shield = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta = shield.getItemMeta();
		shieldmeta.setDisplayName(ItemUtil.SHIELD1);
		shieldmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b20 " + ItemUtil.MONEY);
		shieldmeta.setLore(lore);
		shield.setItemMeta(shieldmeta);
		
		ItemStack shield1 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta1 = shield1.getItemMeta();
		shieldmeta1.setDisplayName(ItemUtil.SHIELD2);
		shieldmeta1.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b30 " + ItemUtil.MONEY);
		shieldmeta1.setLore(lore1);
		shield1.setItemMeta(shieldmeta1);
		
		ItemStack shield2 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta2 = shield2.getItemMeta();
		shieldmeta2.setDisplayName(ItemUtil.SHIELD3);
		shieldmeta2.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3, true);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b40 " + ItemUtil.MONEY);
		shieldmeta2.setLore(lore2);
		shield2.setItemMeta(shieldmeta2);
		
		ItemStack shield3 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta3 = shield3.getItemMeta();
		shieldmeta3.setDisplayName(ItemUtil.SHIELD4);
		shieldmeta3.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b50 " + ItemUtil.MONEY);
		shieldmeta3.setLore(lore3);
		shield3.setItemMeta(shieldmeta3);
		
		ItemStack shield4 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta4 = shield4.getItemMeta();
		shieldmeta4.setDisplayName(ItemUtil.SHIELD5);
		shieldmeta4.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add("Das Item kostet §b60 " + ItemUtil.MONEY);
		shieldmeta4.setLore(lore4);
		shield4.setItemMeta(shieldmeta4);
		
		ItemStack shield5 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta5 = shield5.getItemMeta();
		shieldmeta5.setDisplayName(ItemUtil.SHIELD6);
		shieldmeta5.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		shieldmeta5.addEnchant(Enchantment.PROTECTION_FIRE, 1, true);
		ArrayList<String> lore5 = new ArrayList<String>();
		lore5.add("Das Item kostet §b10 " + ItemUtil.SPEZIAL2);
		shieldmeta5.setLore(lore5);
		shield5.setItemMeta(shieldmeta5);
		
		ItemStack shield6 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta6 = shield6.getItemMeta();
		shieldmeta6.setDisplayName(ItemUtil.SHIELD7);
		shieldmeta6.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		shieldmeta6.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		ArrayList<String> lore6 = new ArrayList<String>();
		lore6.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL2);
		shieldmeta6.setLore(lore6);
		shield6.setItemMeta(shieldmeta6);
		
		ItemStack shield7 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta7 = shield7.getItemMeta();
		shieldmeta7.setDisplayName(ItemUtil.SHIELD8);
		shieldmeta7.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		shieldmeta7.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
		ArrayList<String> lore7 = new ArrayList<String>();
		lore7.add("Das Item kostet §b1 " + ItemUtil.SPEZIAL3);
		shieldmeta7.setLore(lore7);
		shield7.setItemMeta(shieldmeta7);
		
		ItemStack shield8 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta8 = shield8.getItemMeta();
		shieldmeta8.setDisplayName(ItemUtil.SHIELD9);
		shieldmeta8.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		shieldmeta8.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
		shieldmeta8.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		ArrayList<String> lore8 = new ArrayList<String>();
		lore8.add("Das Item kostet §b15 " + ItemUtil.SPEZIAL3);
		shieldmeta8.setLore(lore8);
		shield8.setItemMeta(shieldmeta8);
		
		ItemStack shield9 = new ItemStack(Material.SHIELD);
		ItemMeta shieldmeta9 = shield9.getItemMeta();
		shieldmeta9.setDisplayName(ItemUtil.SHIELD10);
		shieldmeta9.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
		shieldmeta9.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
		shieldmeta9.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		shieldmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore9 = new ArrayList<String>();
		lore9.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL4);
		shieldmeta9.setLore(lore9);
		shield9.setItemMeta(shieldmeta9);
		
		shieldInv.setItem(0, shield);
		shieldInv.setItem(2, shield1);
		shieldInv.setItem(4, shield2);
		shieldInv.setItem(6, shield3);
		shieldInv.setItem(8, shield4);
		shieldInv.setItem(10, shield5);
		shieldInv.setItem(12, shield6);
		shieldInv.setItem(14, shield7);
		shieldInv.setItem(16, shield8);
		shieldInv.setItem(18, shield9);
		shieldInv.setItem(26, back);
		
		player.openInventory(ShieldInv);
		
	}
	
	public static void openarmorinv(Player player) {
	
		Inventory armorinv = ArmorInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack armor = new ItemStack(Material.LEATHER_HELMET);//10 ib
		ItemMeta armormeta = armor.getItemMeta();
		armormeta.setDisplayName(ItemUtil.ARMOR1);
		armormeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		armormeta.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b10 " + ItemUtil.SPEZIAL2);
		armormeta.setLore(lore);
		armor.setItemMeta(armormeta);
		
		ItemStack armor1 = new ItemStack(Material.LEATHER_CHESTPLATE);//50 ib
		ItemMeta armormeta1 = armor1.getItemMeta();
		armormeta1.setDisplayName(ItemUtil.ARMOR2);
		armormeta1.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		armormeta1.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL2);
		armormeta1.setLore(lore1);
		armor1.setItemMeta(armormeta1);
		
		ItemStack armor2 = new ItemStack(Material.LEATHER_LEGGINGS);// 30 ib
		ItemMeta armormeta2 = armor2.getItemMeta();
		armormeta2.setDisplayName(ItemUtil.ARMOR3);
		armormeta2.addEnchant(Enchantment.THORNS, 2, true);
		armormeta2.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b30 " + ItemUtil.SPEZIAL2);
		armormeta2.setLore(lore2);
		armor2.setItemMeta(armormeta2);
		
		ItemStack armor3 = new ItemStack(Material.LEATHER_BOOTS);// 20 ib
		ItemMeta armormeta3 = armor3.getItemMeta();
		armormeta3.setDisplayName(ItemUtil.ARMOR4);
		armormeta3.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
		armormeta3.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b20 " + ItemUtil.SPEZIAL2);
		armormeta3.setLore(lore3);
		armor3.setItemMeta(armormeta3);
		
		ItemStack armor4 = new ItemStack(Material.IRON_HELMET);//1 gb
		ItemMeta armormeta4 = armor4.getItemMeta();
		armormeta4.setDisplayName(ItemUtil.ARMOR5);
		armormeta4.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		armormeta4.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add("Das Item kostet §b1 " + ItemUtil.SPEZIAL4);
		armormeta4.setLore(lore4);
		armor4.setItemMeta(armormeta4);
		
		ItemStack armor5 = new ItemStack(Material.IRON_CHESTPLATE);// 50 gb
		ItemMeta armormeta5 = armor5.getItemMeta();
		armormeta5.setDisplayName(ItemUtil.ARMOR6);
		armormeta5.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		armormeta5.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore5 = new ArrayList<String>();
		lore5.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL4);
		armormeta5.setLore(lore5);
		armor5.setItemMeta(armormeta5);
		
		ItemStack armor6 = new ItemStack(Material.IRON_LEGGINGS); //30 gb
		ItemMeta armormeta6 = armor6.getItemMeta();
		armormeta6.setDisplayName(ItemUtil.ARMOR7);
		armormeta6.addEnchant(Enchantment.THORNS, 2, true);
		armormeta6.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore6 = new ArrayList<String>();
		lore6.add("Das Item kostet §b30 " + ItemUtil.SPEZIAL4);
		armormeta6.setLore(lore6);
		armor6.setItemMeta(armormeta6);
		
		ItemStack armor7 = new ItemStack(Material.IRON_BOOTS);// 20 gb
		ItemMeta armormeta7 = armor7.getItemMeta();
		armormeta7.setDisplayName(ItemUtil.ARMOR8);
		armormeta7.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
		armormeta7.addEnchant(Enchantment.DURABILITY, 900, true);
		ArrayList<String> lore7 = new ArrayList<String>();
		lore7.add("Das Item kostet §b20 " + ItemUtil.SPEZIAL4);
		armormeta7.setLore(lore7);
		armor7.setItemMeta(armormeta7);
		
		armorinv.setItem(0, armor);
		armorinv.setItem(2, armor1);
		armorinv.setItem(4, armor2);
		armorinv.setItem(6, armor3);
		armorinv.setItem(8, armor4);
		armorinv.setItem(10, armor5);
		armorinv.setItem(12, armor6);
		armorinv.setItem(14, armor7);
		armorinv.setItem(26, back);
		
		player.openInventory(ArmorInv);
		
	}
	
	public static void openspezialInv(Player player) {
		
		Inventory spezialInv = SpezialInv;
		
		ItemStack back = new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA);
		ItemMeta backmeta = back.getItemMeta();
		backmeta.setDisplayName(ItemUtil.BACK);
		back.setItemMeta(backmeta);
		
		ItemStack spezial = new ItemStack(Material.DIAMOND_HELMET);// 50 gn
		ItemMeta spezialmeta = spezial.getItemMeta();
		spezialmeta.setDisplayName(ItemUtil.SPEZIAL1);
		spezialmeta.addEnchant(Enchantment.OXYGEN, 3, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Das Item kostet §b50 " + ItemUtil.SPEZIAL3);
		spezialmeta.setLore(lore);
		spezial.setItemMeta(spezialmeta);
		
		ItemStack spezial1 = new ItemStack(Material.IRON_INGOT);//64 in
		ItemMeta spezialmeta1 = spezial1.getItemMeta();
		spezialmeta1.setDisplayName(ItemUtil.SPEZIAL2);
		ArrayList<String> lore1 = new ArrayList<String>();
		lore1.add("Das Item kostet §b64 " + ItemUtil.MONEY);
		spezialmeta1.setLore(lore1);
		spezial1.setItemMeta(spezialmeta1);
		
		ItemStack spezial2 = new ItemStack(Material.GOLD_NUGGET);//64 ib
		ItemMeta spezialmeta2 = spezial2.getItemMeta();
		spezialmeta2.setDisplayName(ItemUtil.SPEZIAL3);
		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL2);
		spezialmeta2.setLore(lore2);
		spezial2.setItemMeta(spezialmeta2);
		
		ItemStack spezial3 = new ItemStack(Material.GOLD_INGOT);//64 gn
		ItemMeta spezialmeta3 = spezial3.getItemMeta();
		spezialmeta3.setDisplayName(ItemUtil.SPEZIAL4);
		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add("Das Item kostet §b64 " + ItemUtil.SPEZIAL3);
		spezialmeta3.setLore(lore3);
		spezial3.setItemMeta(spezialmeta3);
		
		spezialInv.setItem(0, spezial1);
		spezialInv.setItem(2, spezial2);
		spezialInv.setItem(4, spezial3);
		spezialInv.setItem(6, spezial);
		spezialInv.setItem(26, back);
		
		player.openInventory(SpezialInv);
		
	}

}