package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

public class TabCompleteListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(final TabCompleteEvent event) {
		
		File file = new File("plugins//ServerSystem//Blocker.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		String cmd = event.getBuffer();
		
		String tab1 = (String) config.get("Tab.1");
		String tab2 = (String) config.get("Tab.2");
		String tab3 = (String) config.get("Tab.3");
		String tab4 = (String) config.get("Tab.4");
		String tab5 = (String) config.get("Tab.5");
		String tab6 = (String) config.get("Tab.6");
		String tab7 = (String) config.get("Tab.7");
		String tab8 = (String) config.get("Tab.8");
		String tab9 = (String) config.get("Tab.9");
		String tab10 = (String) config.get("Tab.10");
		String tab11 = (String) config.get("Tab.11");
		String tab12 = (String) config.get("Tab.12");
		String tab13 = (String) config.get("Tab.13");
		String tab14 = (String) config.get("Tab.14");
		String tab15 = (String) config.get("Tab.15");
		String tab16 = (String) config.get("Tab.16");
		String tab17 = (String) config.get("Tab.17");
		String tab18 = (String) config.get("Tab.18");
		String tab19 = (String) config.get("Tab.19");
		String tab20 = (String) config.get("Tab.20");
		String tab21 = (String) config.get("Tab.21");
		String tab22 = (String) config.get("Tab.22");
		String tab23 = (String) config.get("Tab.23");
		String tab24 = (String) config.get("Tab.24");
		String tab25 = (String) config.get("Tab.25");
		String tab26 = (String) config.get("Tab.26");
		String tab27 = (String) config.get("Tab.27");
		String tab28 = (String) config.get("Tab.28");
		String tab29 = (String) config.get("Tab.29");
		String tab30 = (String) config.get("Tab.30");
		
		if(cmd.startsWith("/")) {
			event.setCancelled(true);
		}
		
		if(cmd.startsWith("/" + tab1)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab2)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab3)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab4)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab5)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab6)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab7)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab8)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab9)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab10)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab11)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab12)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab13)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab14)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab15)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab16)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab17)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab18)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab19)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab20)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab21)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab22)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab23)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab24)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab25)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab26)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab27)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab28)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab29)) {
			event.setCancelled(false);
		}
		
		if(cmd.startsWith("/" + tab30)) {
			event.setCancelled(false);
		}
	}

}

