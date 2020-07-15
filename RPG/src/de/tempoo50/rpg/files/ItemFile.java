package de.tempoo50.rpg.files;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

public class ItemFile {

	public static void loadShop() {
		
		File file = new File("plugins//RPG//Shop.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Main.Bow", "Bow");
		config.addDefault("Main.Sword", "Sword");
		config.addDefault("Main.Armor", "Armor");
		config.addDefault("Main.Spezial", "Spezial");
		config.addDefault("Main.Axe", "Axe");
		config.addDefault("Main.Shield", "Shield");
		config.addDefault("Bow.1", "Bow");
		config.addDefault("Bow.2", "Bow");
		config.addDefault("Bow.3", "Bow");
		config.addDefault("Bow.4", "Bow");
		config.addDefault("Bow.5", "Bow");
		config.addDefault("Bow.6", "Bow");
		config.addDefault("Bow.7", "Bow");
		config.addDefault("Bow.8", "Bow");
		config.addDefault("Bow.9", "Bow");
		config.addDefault("Bow.10", "Bow");
		config.addDefault("Sword.1", "Sword");
		config.addDefault("Sword.2", "Sword");
		config.addDefault("Sword.3", "Sword");
		config.addDefault("Sword.4", "Sword");
		config.addDefault("Sword.5", "Sword");
		config.addDefault("Sword.6", "Sword");
		config.addDefault("Sword.7", "Sword");
		config.addDefault("Sword.8", "Sword");
		config.addDefault("Sword.9", "Sword");
		config.addDefault("Sword.10", "Sword");
		config.addDefault("Axe.1", "Axe");
		config.addDefault("Axe.2", "Axe");
		config.addDefault("Axe.3", "Axe");
		config.addDefault("Axe.4", "Axe");
		config.addDefault("Axe.5", "Axe");
		config.addDefault("Axe.6", "Axe");
		config.addDefault("Axe.7", "Axe");
		config.addDefault("Axe.8", "Axe");
		config.addDefault("Axe.9", "Axe");
		config.addDefault("Axe.10", "Axe");
		config.addDefault("Shield.1", "Shield");
		config.addDefault("Shield.2", "Shield");
		config.addDefault("Shield.3", "Shield");
		config.addDefault("Shield.4", "Shield");
		config.addDefault("Shield.5", "Shield");
		config.addDefault("Shield.6", "Shield");
		config.addDefault("Shield.7", "Shield");
		config.addDefault("Shield.8", "Shield");
		config.addDefault("Shield.9", "Shield");
		config.addDefault("Shield.10", "Shield");
		config.addDefault("Armor.1,0", "Leder_Helm");
		config.addDefault("Armor.1,1", "Leder_Brust");
		config.addDefault("Armor.1,2", "Leder_Hose");
		config.addDefault("Armor.1,3", "Lede_Stiefel");
		config.addDefault("Armor.2,0", "Eisen_Helm");
		config.addDefault("Armor.2,1", "Leder_Brust");
		config.addDefault("Armor.2,2", "Eisen_Hose");
		config.addDefault("Armor.2,3", "Eisen_Stiefel");
		config.addDefault("Spezial1", "Spezial");
		config.addDefault("Spezial2", "Spezial");
		config.addDefault("Spezial3", "Spezial");
		config.addDefault("Spezial4", "Spezial");
		
	}
	
}
