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
		try {
			
			Player player = (Player) event.getWhoClicked();
			if(event.getInventory() == ShopManager.ShopInv || event.getInventory() == ShopManager.ArmorInv || event.getInventory() == ShopManager.AxeInv || event.getInventory() == ShopManager.BowInv || event.getInventory() == ShopManager.SwordInv || event.getInventory() == ShopManager.ShieldInv || event.getInventory() == ShopManager.SpezialInv) {
				
				if(event.getInventory() == ShopManager.ShopInv) {
					
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW)) {
						ShopManager.openBowInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SWORD)) {
						ShopManager.openSwordInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.AXE)) {
						ShopManager.openAxeInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.ARMOR)) {
						ShopManager.openarmorinv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SHIELD)) {
						ShopManager.openShieldInv(player);
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.SPEZIAL)) {
						ShopManager.openspezialInv(player);
					}
					
				}else if(event.getInventory() == ShopManager.BowInv) {
					
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW1)) {
						event.setCancelled(true);
						if(player.getInventory().contains(new ItemStack(Material.IRON_NUGGET, 20))) {
							
							int place = BestMaterial(player, Material.IRON_NUGGET);
							
							player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
							
							ItemStack bow = new ItemStack(Material.BOW);
							ItemMeta bowmeta = bow.getItemMeta();
							bowmeta.setDisplayName(ItemUtil.BOW1);
							bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
							bow.setItemMeta(bowmeta);
							
							player.getInventory().addItem(bow);
							player.updateInventory();
							
							
							
						}else 
							player.sendMessage("Du hast nicht genügent Geld dabei!");
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ItemUtil.BOW2)) {
							event.setCancelled(true);
							if(player.getInventory().contains(new ItemStack(Material.IRON_NUGGET, 30))) {
								
								int place = BestMaterial(player, Material.IRON_NUGGET);
								
								player.getInventory().getItem(place).setAmount(player.getInventory().getItem(place).getAmount() -1);
								
								ItemStack bow = new ItemStack(Material.BOW);
								ItemMeta bowmeta = bow.getItemMeta();
								bowmeta.setDisplayName(ItemUtil.BOW2);
								bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
								bow.setItemMeta(bowmeta);
								
								player.getInventory().addItem(bow);
								player.updateInventory();
							}
					}
					
				}
				
			}
			
		} catch (Exception e) {
			
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
