package de.tempoo50.rpg.listener;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.rpg.utils.ItemUtil;
import de.tempoo50.rpg.utils.ShopManager;

public class ShopInteract implements Listener {
	
	@EventHandler
	public void openShop(InventoryClickEvent event) {
			
			Player player = (Player) event.getWhoClicked();
			if(event.getInventory().getName().equalsIgnoreCase("§aShop") || event.getInventory().getName().equalsIgnoreCase("§aBögen") || event.getInventory().getName().equalsIgnoreCase("§aSchwerter") || event.getInventory().getName().equalsIgnoreCase("§aÄxte") || event.getInventory().getName().equalsIgnoreCase("§aRüstungen") || event.getInventory().getName().equalsIgnoreCase("§aSchilde") || event.getInventory().getName().equalsIgnoreCase("§aSpezial")) {			
				if(event.getInventory().getName().equalsIgnoreCase("§aShop")) {
					event.setCancelled(true);
					
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE)) {
						ShopManager.openAxeInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR)) {
						ShopManager.openarmorinv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD)) {
						ShopManager.openShieldInv(player);
					}if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL)) {
						ShopManager.openspezialInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD)) {
						ShopManager.openSwordInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW)) {
						ShopManager.openBowInv(player);
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aBögen")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW1)) {
						
						if(player.getInventory().contains(Material.IRON_NUGGET, 20)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack bow = new ItemStack(Material.BOW);
							ItemMeta bowmeta = bow.getItemMeta();
							bowmeta.setDisplayName(ItemUtil.BOW1);
							bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
							bow.setItemMeta(bowmeta);
							
							player.getInventory().addItem(bow);
							player.getInventory().addItem(new ItemStack(Material.ARROW, 64));
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW2)) {
							event.setCancelled(true);
							if(player.getInventory().contains(Material.IRON_NUGGET, 30)) {
								
								int place = BestMaterial(player, Material.IRON_NUGGET);
								
								player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
								
								ItemStack bow = new ItemStack(Material.BOW);
								ItemMeta bowmeta = bow.getItemMeta();
								bowmeta.setDisplayName(ItemUtil.BOW2);
								bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
								bow.setItemMeta(bowmeta);
								
								player.getInventory().addItem(bow);
								player.updateInventory();
								
							}else 
								player.sendMessage("Du hast nicht genügent Geld dabei!");
							
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 40)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -40);
							
							ItemStack bow2 = new ItemStack(Material.BOW);//40 in
							ItemMeta bowmeta2 = bow2.getItemMeta();
							bowmeta2.setDisplayName(ItemUtil.BOW3);
							bowmeta2.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
							bow2.setItemMeta(bowmeta2);
							
							player.getInventory().addItem(bow2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 50)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack bow3 = new ItemStack(Material.BOW);//50 in
							ItemMeta bowmeta3 = bow3.getItemMeta();
							bowmeta3.setDisplayName(ItemUtil.BOW4);
							bowmeta3.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
							bow3.setItemMeta(bowmeta3);
							
							player.getInventory().addItem(bow3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW5)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 60)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -60);
							
							ItemStack bow4 = new ItemStack(Material.BOW);//60 in
							ItemMeta bowmeta4 = bow4.getItemMeta();
							bowmeta4.setDisplayName(ItemUtil.BOW5);
							bowmeta4.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bow4.setItemMeta(bowmeta4);
							
							player.getInventory().addItem(bow4);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW6)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 10)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -10);
							
							ItemStack bow5 = new ItemStack(Material.BOW);//10 ib
							ItemMeta bowmeta5 = bow5.getItemMeta();
							bowmeta5.setDisplayName(ItemUtil.BOW6);
							bowmeta5.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bowmeta5.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
							bow5.setItemMeta(bowmeta5);
							
							player.getInventory().addItem(bow5);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW7)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack bow6 = new ItemStack(Material.BOW);//50 ib
							ItemMeta bowmeta6 = bow6.getItemMeta();
							bowmeta6.setDisplayName(ItemUtil.BOW7);
							bowmeta6.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bowmeta6.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
							bowmeta6.addEnchant(Enchantment.ARROW_FIRE, 1, true);
							bow6.setItemMeta(bowmeta6);
							
							player.getInventory().addItem(bow6);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW8)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 1)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack bow7 = new ItemStack(Material.BOW);//1 gn
							ItemMeta bowmeta7 = bow7.getItemMeta();
							bowmeta7.setDisplayName(ItemUtil.BOW8);
							bowmeta7.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bowmeta7.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
							bowmeta7.addEnchant(Enchantment.ARROW_FIRE, 2, true);
							bow7.setItemMeta(bowmeta7);
							
							player.getInventory().addItem(bow7);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW9)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 15)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -15);
							
							ItemStack bow8 = new ItemStack(Material.BOW);//15 gn
							ItemMeta bowmeta8 = bow8.getItemMeta();
							bowmeta8.setDisplayName(ItemUtil.BOW9);
							bowmeta8.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bowmeta8.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
							bowmeta8.addEnchant(Enchantment.ARROW_FIRE, 3, true);
							bow8.setItemMeta(bowmeta8);
							
							player.getInventory().addItem(bow8);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW10)) {
						
						if(player.getInventory().contains(Material.GOLD_INGOT, 64)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack bow9 = new ItemStack(Material.BOW);//64 gb
							ItemMeta bowmeta9 = bow9.getItemMeta();
							bowmeta9.setDisplayName(ItemUtil.BOW10);
							bowmeta9.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
							bowmeta9.addEnchant(Enchantment.ARROW_FIRE, 3, true);
							bowmeta9.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
							bowmeta9.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
							bowmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
							bow9.setItemMeta(bowmeta9);
							
							player.getInventory().addItem(bow9);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARROW)) {
						
						if(player.getInventory().contains(Material.IRON_NUGGET, 5)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -5);
							
							ItemStack arrow = new ItemStack(Material.ARROW);
							ItemMeta arrowmeta = arrow.getItemMeta();
							arrowmeta.setDisplayName(ItemUtil.ARROW);
							arrow.setItemMeta(arrowmeta);
							
							player.getInventory().addItem(arrow);
							player.updateInventory();
							
						}else
							player.sendMessage("Du hast nicht genügent Geld dabei!");
					
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aSchwerter")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 20)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta = sword.getItemMeta();
							swordmeta.setDisplayName(ItemUtil.SWORD1);
							swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
							sword.setItemMeta(swordmeta);
							
							player.getInventory().addItem(sword);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD2)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 30)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
							
							ItemStack sword1 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta1 = sword1.getItemMeta();
							swordmeta1.setDisplayName(ItemUtil.SWORD2);
							swordmeta1.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
							sword1.setItemMeta(swordmeta1);
							
							player.getInventory().addItem(sword1);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 40)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -40);
							
							ItemStack sword2 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta2 = sword2.getItemMeta();
							swordmeta2.setDisplayName(ItemUtil.SWORD3);
							swordmeta2.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
							sword2.setItemMeta(swordmeta2);
							
							player.getInventory().addItem(sword2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 50)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack sword3 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta3 = sword3.getItemMeta();
							swordmeta3.setDisplayName(ItemUtil.SWORD4);
							swordmeta3.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
							sword3.setItemMeta(swordmeta3);
							
							player.getInventory().addItem(sword3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD5)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 60)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -60);
							
							ItemStack sword4 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta4 = sword4.getItemMeta();
							swordmeta4.setDisplayName(ItemUtil.SWORD5);
							swordmeta4.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							sword4.setItemMeta(swordmeta4);
							
							player.getInventory().addItem(sword4);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD6)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 10)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -10);
							
							ItemStack sword5 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta5 = sword5.getItemMeta();
							swordmeta5.setDisplayName(ItemUtil.SWORD6);
							swordmeta5.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							swordmeta5.addEnchant(Enchantment.KNOCKBACK, 1, true);
							sword5.setItemMeta(swordmeta5);
							
							player.getInventory().addItem(sword5);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD7)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack sword6 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta6 = sword6.getItemMeta();
							swordmeta6.setDisplayName(ItemUtil.SWORD7);
							swordmeta6.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							swordmeta6.addEnchant(Enchantment.KNOCKBACK, 1, true);
							swordmeta6.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
							sword6.setItemMeta(swordmeta6);
							
							player.getInventory().addItem(sword6);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD8)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 1)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack sword7 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta7 = sword7.getItemMeta();
							swordmeta7.setDisplayName(ItemUtil.SWORD8);
							swordmeta7.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							swordmeta7.addEnchant(Enchantment.KNOCKBACK, 1, true);
							swordmeta7.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
							sword7.setItemMeta(swordmeta7);
							
							player.getInventory().addItem(sword7);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD9)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 15)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -15);
							
							ItemStack sword8 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta8 = sword8.getItemMeta();
							swordmeta8.setDisplayName(ItemUtil.SWORD9);
							swordmeta8.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							swordmeta8.addEnchant(Enchantment.KNOCKBACK, 1, true);
							swordmeta8.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
							sword8.setItemMeta(swordmeta8);
							
							player.getInventory().addItem(sword8);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD10)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 64)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack sword9 = new ItemStack(Material.DIAMOND_SWORD);
							ItemMeta swordmeta9 = sword9.getItemMeta();
							swordmeta9.setDisplayName(ItemUtil.SWORD10);
							swordmeta9.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							swordmeta9.addEnchant(Enchantment.KNOCKBACK, 1, true);
							swordmeta9.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
							swordmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
							sword9.setItemMeta(swordmeta9);
							
							player.getInventory().addItem(sword9);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aÄxte")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 20)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta = axe.getItemMeta();
							axemeta.setDisplayName(ItemUtil.AXE1);
							axemeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
							axe.setItemMeta(axemeta);
							
							player.getInventory().addItem(axe);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE2)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 30)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
							
							ItemStack axe1 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta1 = axe1.getItemMeta();
							axemeta1.setDisplayName(ItemUtil.AXE2);
							axemeta1.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
							axe1.setItemMeta(axemeta1);
							
							player.getInventory().addItem(axe1);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 40)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -40);
							
							ItemStack axe2 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta2 = axe2.getItemMeta();
							axemeta2.setDisplayName(ItemUtil.AXE3);
							axemeta2.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
							axe2.setItemMeta(axemeta2);
							
							player.getInventory().addItem(axe2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 50)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack axe3 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta3 = axe3.getItemMeta();
							axemeta3.setDisplayName(ItemUtil.AXE4);
							axemeta3.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
							axe3.setItemMeta(axemeta3);
							
							player.getInventory().addItem(axe3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE5)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 60)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -60);
							
							ItemStack axe4 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta4 = axe4.getItemMeta();
							axemeta4.setDisplayName(ItemUtil.AXE5);
							axemeta4.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axe4.setItemMeta(axemeta4);
							
							player.getInventory().addItem(axe4);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE6)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 10)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -10);
							
							ItemStack axe5 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta5 = axe5.getItemMeta();
							axemeta5.setDisplayName(ItemUtil.AXE6);
							axemeta5.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axemeta5.addEnchant(Enchantment.KNOCKBACK, 1, true);
							axe5.setItemMeta(axemeta5);
							
							player.getInventory().addItem(axe5);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE7)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack axe6 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta6 = axe6.getItemMeta();
							axemeta6.setDisplayName(ItemUtil.AXE7);
							axemeta6.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axemeta6.addEnchant(Enchantment.KNOCKBACK, 1, true);
							axemeta6.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
							axe6.setItemMeta(axemeta6);
							
							player.getInventory().addItem(axe6);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE8)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 1)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack axe7 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta7 = axe7.getItemMeta();
							axemeta7.setDisplayName(ItemUtil.AXE8);
							axemeta7.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axemeta7.addEnchant(Enchantment.KNOCKBACK, 1, true);
							axemeta7.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
							axe7.setItemMeta(axemeta7);
							
							player.getInventory().addItem(axe7);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE9)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 15)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -15);
							
							ItemStack axe8 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta8 = axe8.getItemMeta();
							axemeta8.setDisplayName(ItemUtil.AXE9);
							axemeta8.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axemeta8.addEnchant(Enchantment.KNOCKBACK, 1, true);
							axemeta8.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
							axe8.setItemMeta(axemeta8);
							
							player.getInventory().addItem(axe8);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE10)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 64)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack axe9 = new ItemStack(Material.DIAMOND_AXE);
							ItemMeta axemeta9 = axe9.getItemMeta();
							axemeta9.setDisplayName(ItemUtil.AXE10);
							axemeta9.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
							axemeta9.addEnchant(Enchantment.KNOCKBACK, 1, true);
							axemeta9.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
							axemeta9.addEnchant(Enchantment.DURABILITY, 900, true);
							axe9.setItemMeta(axemeta9);
							
							player.getInventory().addItem(axe9);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aSchilde")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 20)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack shield = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta = shield.getItemMeta();
							shieldmeta.setDisplayName(ItemUtil.SHIELD1);
							shieldmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, true);
							shield.setItemMeta(shieldmeta);
							
							player.getInventory().addItem(shield);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD2)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 30)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
							
							ItemStack shield1 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta1 = shield1.getItemMeta();
							shieldmeta1.setDisplayName(ItemUtil.SHIELD2);
							shieldmeta1.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
							shield1.setItemMeta(shieldmeta1);
							
							player.getInventory().addItem(shield1);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 40)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -40);
							
							ItemStack shield2 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta2 = shield2.getItemMeta();
							shieldmeta2.setDisplayName(ItemUtil.SHIELD3);
							shieldmeta2.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3, true);
							shield2.setItemMeta(shieldmeta2);
							
							player.getInventory().addItem(shield2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 50)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack shield3 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta3 = shield3.getItemMeta();
							shieldmeta3.setDisplayName(ItemUtil.SHIELD4);
							shieldmeta3.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
							shield3.setItemMeta(shieldmeta3);
							
							player.getInventory().addItem(shield3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD5)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 60)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -60);
							
							ItemStack shield4 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta4 = shield4.getItemMeta();
							shieldmeta4.setDisplayName(ItemUtil.SHIELD5);
							shieldmeta4.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shield4.setItemMeta(shieldmeta4);
							
							player.getInventory().addItem(shield4);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD6)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 10)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -10);
							
							ItemStack shield5 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta5 = shield5.getItemMeta();
							shieldmeta5.setDisplayName(ItemUtil.SHIELD6);
							shieldmeta5.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shieldmeta5.addEnchant(Enchantment.PROTECTION_FIRE, 1, true);
							shield5.setItemMeta(shieldmeta5);
							
							player.getInventory().addItem(shield5);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD7)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack shield6 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta6 = shield6.getItemMeta();
							shieldmeta6.setDisplayName(ItemUtil.SHIELD7);
							shieldmeta6.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shieldmeta6.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
							shield6.setItemMeta(shieldmeta6);
							
							player.getInventory().addItem(shield6);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD8)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 1)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack shield7 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta7 = shield7.getItemMeta();
							shieldmeta7.setDisplayName(ItemUtil.SHIELD8);
							shieldmeta7.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shieldmeta7.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
							shield7.setItemMeta(shieldmeta7);
							
							player.getInventory().addItem(shield7);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD9)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 15)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -15);
							
							ItemStack shield8 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta8 = shield8.getItemMeta();
							shieldmeta8.setDisplayName(ItemUtil.SHIELD9);
							shieldmeta8.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shieldmeta8.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
							shieldmeta8.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
							shield8.setItemMeta(shieldmeta8);
							
							player.getInventory().addItem(shield8);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD10)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 64)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack shield9 = new ItemStack(Material.SHIELD);
							ItemMeta shieldmeta9 = shield9.getItemMeta();
							shieldmeta9.setDisplayName(ItemUtil.SHIELD10);
							shieldmeta9.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
							shieldmeta9.addEnchant(Enchantment.PROTECTION_FIRE, 3, true);
							shieldmeta9.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
							shieldmeta9.addEnchant(Enchantment.DURABILITY, 900, true);
							shield9.setItemMeta(shieldmeta9);
							
							player.getInventory().addItem(shield9);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aRüstungen")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 10)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -10);
							
							ItemStack armor = new ItemStack(Material.LEATHER_HELMET);//10 ib
							ItemMeta armormeta = armor.getItemMeta();
							armormeta.setDisplayName(ItemUtil.ARMOR1);
							armormeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
							armormeta.addEnchant(Enchantment.DURABILITY, 900, true);
							armor.setItemMeta(armormeta);
							
							player.getInventory().addItem(armor);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR2)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack armor1 = new ItemStack(Material.LEATHER_CHESTPLATE);//50 ib
							ItemMeta armormeta1 = armor1.getItemMeta();
							armormeta1.setDisplayName(ItemUtil.ARMOR2);
							armormeta1.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
							armormeta1.addEnchant(Enchantment.DURABILITY, 900, true);
							armor1.setItemMeta(armormeta1);
							
							player.getInventory().addItem(armor1);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 30)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
							
							ItemStack armor2 = new ItemStack(Material.LEATHER_LEGGINGS);// 30 ib
							ItemMeta armormeta2 = armor2.getItemMeta();
							armormeta2.setDisplayName(ItemUtil.ARMOR3);
							armormeta2.addEnchant(Enchantment.THORNS, 2, true);
							armormeta2.addEnchant(Enchantment.DURABILITY, 900, true);
							armor2.setItemMeta(armormeta2);
							
							player.getInventory().addItem(armor2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 20)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack armor3 = new ItemStack(Material.LEATHER_BOOTS);// 20 ib
							ItemMeta armormeta3 = armor3.getItemMeta();
							armormeta3.setDisplayName(ItemUtil.ARMOR4);
							armormeta3.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
							armormeta3.addEnchant(Enchantment.DURABILITY, 900, true);
							armor3.setItemMeta(armormeta3);
							
							player.getInventory().addItem(armor3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR5)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 1)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack armor4 = new ItemStack(Material.IRON_HELMET);//1 gb
							ItemMeta armormeta4 = armor4.getItemMeta();
							armormeta4.setDisplayName(ItemUtil.ARMOR5);
							armormeta4.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
							armormeta4.addEnchant(Enchantment.DURABILITY, 900, true);
							armor4.setItemMeta(armormeta4);
							
							player.getInventory().addItem(armor4);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR6)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 50)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack armor5 = new ItemStack(Material.IRON_CHESTPLATE);// 50 gb
							ItemMeta armormeta5 = armor5.getItemMeta();
							armormeta5.setDisplayName(ItemUtil.ARMOR6);
							armormeta5.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
							armormeta5.addEnchant(Enchantment.DURABILITY, 900, true);
							armor5.setItemMeta(armormeta5);
							
							player.getInventory().addItem(armor5);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR7)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 30)) {
							
							int place = BestMaterial(player, Material.GOLD_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -30);
							
							ItemStack armor6 = new ItemStack(Material.IRON_LEGGINGS); //30 gb
							ItemMeta armormeta6 = armor6.getItemMeta();
							armormeta6.setDisplayName(ItemUtil.ARMOR7);
							armormeta6.addEnchant(Enchantment.THORNS, 2, true);
							armormeta6.addEnchant(Enchantment.DURABILITY, 900, true);
							armor6.setItemMeta(armormeta6);
							
							player.getInventory().addItem(armor6);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR8)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_INGOT, 20)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -20);
							
							ItemStack armor7 = new ItemStack(Material.IRON_BOOTS);// 20 gb
							ItemMeta armormeta7 = armor7.getItemMeta();
							armormeta7.setDisplayName(ItemUtil.ARMOR8);
							armormeta7.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
							armormeta7.addEnchant(Enchantment.DURABILITY, 900, true);
							armor7.setItemMeta(armormeta7);
							
							player.getInventory().addItem(armor7);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}
					
				}else if(event.getInventory().getName().equalsIgnoreCase("§aSpezial")) {
					event.setCancelled(true);
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 50)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -50);
							
							ItemStack spezial = new ItemStack(Material.DIAMOND_HELMET);// 50 gn
							ItemMeta spezialmeta = spezial.getItemMeta();
							spezialmeta.setDisplayName(ItemUtil.SPEZIAL1);
							spezialmeta.addEnchant(Enchantment.OXYGEN, 3, true);
							spezial.setItemMeta(spezialmeta);
							
							player.getInventory().addItem(spezial);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL2)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_NUGGET, 64)) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack spezial1 = new ItemStack(Material.IRON_INGOT);//64 in
							ItemMeta spezialmeta1 = spezial1.getItemMeta();
							spezialmeta1.setDisplayName(ItemUtil.SPEZIAL2);
							spezial1.setItemMeta(spezialmeta1);
							
							player.getInventory().addItem(spezial1);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL3)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.IRON_INGOT, 64)) {
							
							int place = BestMaterial(player, Material.IRON_INGOT);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack spezial2 = new ItemStack(Material.GOLD_NUGGET);//64 ib
							ItemMeta spezialmeta2 = spezial2.getItemMeta();
							spezialmeta2.setDisplayName(ItemUtil.SPEZIAL3);
							spezial2.setItemMeta(spezialmeta2);
							
							player.getInventory().addItem(spezial2);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL4)) {
						event.setCancelled(true);
						if(player.getInventory().contains(Material.GOLD_NUGGET, 64)) {
							
							int place = BestMaterial(player, Material.GOLD_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -64);
							
							ItemStack spezial3 = new ItemStack(Material.GOLD_INGOT);//64 gn
							ItemMeta spezialmeta3 = spezial3.getItemMeta();
							spezialmeta3.setDisplayName(ItemUtil.SPEZIAL4);
							spezial3.setItemMeta(spezialmeta3);
							
							player.getInventory().addItem(spezial3);
							player.updateInventory();
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BACK)) {
						ShopManager.openShopInv(player);
					}
					
				}
			}
			
	}
	
	private int BestMaterial(Player player, Material material) {
		
		int i = 0;
		int bestMaterial = 0;
		
		for(int i2 = 0; i2<27; i2++) {
			
			if(player.getInventory().getItem(i2) != null) {
				if(player.getInventory().getItem(i2).getType() == material && player.getInventory().getItem(i2).getAmount() >= bestMaterial) {
					
					i = i2;
					
				}
			}
			
		}
		
		return i;
		
	}

}
