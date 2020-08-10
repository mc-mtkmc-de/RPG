package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import de.tempoo50.rpg.utils.MessagesUtil;

public class CommandBlocker implements Listener {

	File perm = new File("plugins//RPG//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		
		File file = new File("plugins//RPG//Blocker.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		String block1 = (String) config.get("Blocker.1");
		String block2 = (String) config.get("Blocker.2");
		String block3 = (String) config.get("Blocker.3");
		String block4 = (String) config.get("Blocker.4");
		String block5 = (String) config.get("Blocker.5");
		String block6 = (String) config.get("Blocker.6");
		String block7 = (String) config.get("Blocker.7");
		String block8 = (String) config.get("Blocker.8");
		String block9 = (String) config.get("Blocker.9");
		String block10 = (String) config.get("Blocker.10");
		String block11 = (String) config.get("Blocker.11");
		String block12 = (String) config.get("Blocker.12");
		String block13 = (String) config.get("Blocker.13");
		String block14 = (String) config.get("Blocker.14");
		String block15 = (String) config.get("Blocker.15");
		String block16 = (String) config.get("Blocker.16");
		String block17 = (String) config.get("Blocker.17");
		String block18 = (String) config.get("Blocker.18");
		String block19 = (String) config.get("Blocker.19");
		String block20 = (String) config.get("Blocker.20");
		String block21 = (String) config.get("Blocker.21");
		String block22 = (String) config.get("Blocker.22");
		String block23 = (String) config.get("Blocker.23");
		String block24 = (String) config.get("Blocker.24");
		String block25 = (String) config.get("Blocker.25");
		String block26 = (String) config.get("Blocker.26");
		String block27 = (String) config.get("Blocker.27");
		String block28 = (String) config.get("Blocker.28");
		String block29 = (String) config.get("Blocker.29");
		String block30 = (String) config.get("Blocker.30");
		String dblock1 = (String) config.get("DauerBlock.1");
		String dblock2 = (String) config.get("DauerBlock.2");
		String dblock3 = (String) config.get("DauerBlock.3");
		String dblock4 = (String) config.get("DauerBlock.4");
		String dblock5 = (String) config.get("DauerBlock.5");
		String dblock6 = (String) config.get("DauerBlock.6");
		String dblock7 = (String) config.get("DauerBlock.7");
		String dblock8 = (String) config.get("DauerBlock.8");
		String dblock9 = (String) config.get("DauerBlock.9");
		String dblock10 = (String) config.get("DauerBlock.10");
		String dblock11 = (String) config.get("DauerBlock.11");
		String dblock12 = (String) config.get("DauerBlock.12");
		String dblock13 = (String) config.get("DauerBlock.13");
		String dblock14 = (String) config.get("DauerBlock.14");
		String dblock15 = (String) config.get("DauerBlock.15");
		String dblock16 = (String) config.get("DauerBlock.16");
		String dblock17 = (String) config.get("DauerBlock.17");
		String dblock18 = (String) config.get("DauerBlock.18");
		String dblock19 = (String) config.get("DauerBlock.19");
		String dblock20 = (String) config.get("DauerBlock.20");
		String dblock21 = (String) config.get("DauerBlock.21");
		String dblock22 = (String) config.get("DauerBlock.22");
		String dblock23 = (String) config.get("DauerBlock.23");
		String dblock24 = (String) config.get("DauerBlock.24");
		String dblock25 = (String) config.get("DauerBlock.25");
		String dblock26 = (String) config.get("DauerBlock.26");
		String dblock27 = (String) config.get("DauerBlock.27");
		String dblock28 = (String) config.get("DauerBlock.28");
		String dblock29 = (String) config.get("DauerBlock.29");
		String dblock30 = (String) config.get("DauerBlock.30");
		
		Player player = event.getPlayer();
		
		String[] cmd = event.getMessage().substring(1).split(" ");
		
		if(player.hasPermission((String) per.get("Blocker.1"))) {
			if(cmd[0].startsWith(block1)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block1)) {
				player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.2"))) {
			if(cmd[0].startsWith(block2)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block2)) {
				player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.3"))) {
			if(cmd[0].startsWith(block3)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block3)) {
				player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.4"))) {
			if(cmd[0].startsWith(block4)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block4)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		} 
		
		if(player.hasPermission((String) per.get("Blocker.5"))) {
			if(cmd[0].startsWith(block5)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block5)) {
				player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.6"))) {
			if(cmd[0].startsWith(block6)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block6)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.7"))) {
			if(cmd[0].startsWith(block7)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block7)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.7"))) {
			if(cmd[0].startsWith(block7)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block7)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.8"))) {
			if(cmd[0].startsWith(block8)) {
				event.setCancelled(false);
			}
		} else if(cmd[0].startsWith(block8)) {
				player.sendMessage(MessagesUtil.NOCMD);
				event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.9"))) {
			if(cmd[0].startsWith(block9)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block9)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.10"))) {
			if(cmd[0].startsWith(block10)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block10)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.11"))) {
			if(cmd[0].startsWith(block11)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block11)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.12"))) {
			if(cmd[0].startsWith(block12)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block12)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
				
		if(player.hasPermission((String) per.get("Blocker.13"))) {
			if(cmd[0].startsWith(block13)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block13)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.14"))) {
			if(cmd[0].startsWith(block14)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block14)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.15"))) {
			if(cmd[0].startsWith(block15)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block15)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.16"))) {
			if(cmd[0].startsWith(block16)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block16)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		 if(player.hasPermission((String) per.get("Blocker.17"))) {
			if(cmd[0].startsWith(block17)) {
				event.setCancelled(false);
				}
			} else if(cmd[0].startsWith(block17)) {
					player.sendMessage(MessagesUtil.NOCMD);
					event.setCancelled(true);
				
			}
		
		 if(player.hasPermission((String) per.get("Blocker.18"))) {
				if(cmd[0].startsWith(block18)) {
					event.setCancelled(false);
				}
			}else if(cmd[0].startsWith(block18)) {
				player.sendMessage(MessagesUtil.NOCMD);
				event.setCancelled(true);
				
			}
		 
		 if(player.hasPermission((String) per.get("Blocker.19"))) {
				if(cmd[0].startsWith(block19)) {
					event.setCancelled(false);
				}
			}else if(cmd[0].startsWith(block19)) {
				player.sendMessage(MessagesUtil.NOCMD);
				event.setCancelled(true);
				
			}
		
		if(player.hasPermission((String) per.get("Blocker.20"))) {
			if(cmd[0].startsWith(block20)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block20)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.21"))) {
			if(cmd[0].startsWith(block21)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block21)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.22"))) {
			if(cmd[0].startsWith(block22)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block22)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.23"))) {
			if(cmd[0].startsWith(block23)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block23)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(player.hasPermission((String) per.get("Blocker.24"))) {
			if(cmd[0].startsWith(block24)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block24)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.25"))) {
			if(cmd[0].startsWith(block25)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block25)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.26"))) {
			if(cmd[0].startsWith(block26)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block26)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.27"))) {
			if(cmd[0].startsWith(block27)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block27)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.28"))) {
			if(cmd[0].startsWith(block28)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block28)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.29"))) {
			if(cmd[0].startsWith(block29)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block29)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}

		if(player.hasPermission((String) per.get("Blocker.30"))) {
			if(cmd[0].startsWith(block30)) {
				event.setCancelled(false);
			}
		}else if(cmd[0].startsWith(block30)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
		if(cmd[0].equalsIgnoreCase(dblock1) ||
				cmd[0].equalsIgnoreCase(dblock2) ||
				cmd[0].equalsIgnoreCase(dblock3) ||
				cmd[0].equalsIgnoreCase(dblock4) ||
				cmd[0].equalsIgnoreCase(dblock5) ||
				cmd[0].equalsIgnoreCase(dblock6) ||
				cmd[0].equalsIgnoreCase(dblock7) ||
				cmd[0].equalsIgnoreCase(dblock8) ||
				cmd[0].equalsIgnoreCase(dblock9) ||
				cmd[0].equalsIgnoreCase(dblock10) ||
				cmd[0].equalsIgnoreCase(dblock11) ||
				cmd[0].equalsIgnoreCase(dblock12) ||
				cmd[0].equalsIgnoreCase(dblock13) ||
				cmd[0].equalsIgnoreCase(dblock14) ||
				cmd[0].equalsIgnoreCase(dblock15) ||
				cmd[0].equalsIgnoreCase(dblock16) ||
				cmd[0].equalsIgnoreCase(dblock17) ||
				cmd[0].equalsIgnoreCase(dblock18) ||
				cmd[0].equalsIgnoreCase(dblock19) ||
				cmd[0].equalsIgnoreCase(dblock20) ||
				cmd[0].equalsIgnoreCase(dblock21) ||
				cmd[0].equalsIgnoreCase(dblock22) ||
				cmd[0].equalsIgnoreCase(dblock23) ||
				cmd[0].equalsIgnoreCase(dblock24) ||
				cmd[0].equalsIgnoreCase(dblock25) ||
				cmd[0].equalsIgnoreCase(dblock26) ||
				cmd[0].equalsIgnoreCase(dblock27) ||
				cmd[0].equalsIgnoreCase(dblock28) ||
				cmd[0].equalsIgnoreCase(dblock29) ||
				cmd[0].equalsIgnoreCase(dblock30)) {
			player.sendMessage(MessagesUtil.NOCMD);
			event.setCancelled(true);
			
		}
		
	}

}