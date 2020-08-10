package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

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
		config.addDefault("Bow.1", "Bow1");
		config.addDefault("Bow.2", "Bow2");
		config.addDefault("Bow.3", "Bow3");
		config.addDefault("Bow.4", "Bow4");
		config.addDefault("Bow.5", "Bow5");
		config.addDefault("Bow.6", "Bow6");
		config.addDefault("Bow.7", "Bow7");
		config.addDefault("Bow.8", "Bow8");
		config.addDefault("Bow.9", "Bow9");
		config.addDefault("Bow.10", "Bow10");
		config.addDefault("Bow.Arrow", "Arrow");
		config.addDefault("Sword.1", "Sword1");
		config.addDefault("Sword.2", "Sword2");
		config.addDefault("Sword.3", "Sword3");
		config.addDefault("Sword.4", "Sword4");
		config.addDefault("Sword.5", "Sword5");
		config.addDefault("Sword.6", "Sword6");
		config.addDefault("Sword.7", "Sword7");
		config.addDefault("Sword.8", "Sword8");
		config.addDefault("Sword.9", "Sword9");
		config.addDefault("Sword.10", "Sword10");
		config.addDefault("Axe.1", "Axe1");
		config.addDefault("Axe.2", "Axe2");
		config.addDefault("Axe.3", "Axe3");
		config.addDefault("Axe.4", "Axe4");
		config.addDefault("Axe.5", "Axe5");
		config.addDefault("Axe.6", "Axe6");
		config.addDefault("Axe.7", "Axe7");
		config.addDefault("Axe.8", "Axe8");
		config.addDefault("Axe.9", "Axe9");
		config.addDefault("Axe.10", "Axe10");
		config.addDefault("Shield.1", "Shield1");
		config.addDefault("Shield.2", "Shield2");
		config.addDefault("Shield.3", "Shield3");
		config.addDefault("Shield.4", "Shield4");
		config.addDefault("Shield.5", "Shield5");
		config.addDefault("Shield.6", "Shield6");
		config.addDefault("Shield.7", "Shield7");
		config.addDefault("Shield.8", "Shield8");
		config.addDefault("Shield.9", "Shield9");
		config.addDefault("Shield.10", "Shield10");
		config.addDefault("Armor.1,0", "Leder_Helm");
		config.addDefault("Armor.1,1", "Leder_Brust");
		config.addDefault("Armor.1,2", "Leder_Hose");
		config.addDefault("Armor.1,3", "Lede_Stiefel");
		config.addDefault("Armor.2,0", "Eisen_Helm");
		config.addDefault("Armor.2,1", "Eisen_Brust");
		config.addDefault("Armor.2,2", "Eisen_Hose");
		config.addDefault("Armor.2,3", "Eisen_Stiefel");
		config.addDefault("Spezial.1", "Spezial");
		config.addDefault("Spezial.2", "Spezial2");
		config.addDefault("Spezial.3", "Spezial3");
		config.addDefault("Spezial.4", "Spezial4");
		config.addDefault("Money", "Money");
		config.addDefault("Back", "Back");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
