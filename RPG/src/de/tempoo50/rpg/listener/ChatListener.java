package de.tempoo50.rpg.listener;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.MessagesUtil;
import net.md_5.bungee.api.ChatColor;


public class ChatListener implements Listener {
	
	private ArrayList<String> chatspam = new ArrayList<>();
	
	private Rpg plugin;

	public ChatListener(Rpg plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onChat(final AsyncPlayerChatEvent event) {
			
		File perm = new File("plugins//RPG//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
		
		File file = new File("plugins//RPG//Chat//ChatSystem.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		final Player player = event.getPlayer();
	    String msg = event.getMessage().replaceAll("%", "%%").trim();
	    float uppercaseLetter = 0;
	    
	    for(int i = 0; i < msg.length(); i++) {
	    	if(Character.isUpperCase(msg.charAt(i)) && Character.isLetter(msg.charAt(i))) {
	    		uppercaseLetter++;
	    	}
	    }
	    
	    if(player.hasPermission((String) per.get("Chat.1"))) {
			String ms = (String) config.get("Chat.1");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.1"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.2"))) {
			String ms = (String) config.get("Chat.2");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.2"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.3"))) {
			String ms = (String) config.get("Chat.3");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.3"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.4"))) {
			String ms = (String) config.get("Chat.4");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.4"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.5"))) {
			String ms = (String) config.get("Chat.5");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.5"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	   
	    }else if(player.hasPermission((String) per.get("Chat.6"))) {
			String ms = (String) config.get("Chat.6");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.6"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.7"))) {
			String ms = (String) config.get("Chat.7");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.7"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.8"))) {
			String ms = (String) config.get("Chat.8");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.8"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.9"))) {
			String ms = (String) config.get("Chat.9");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.9"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.10"))) {
			String ms = (String) config.get("Chat.10");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.10"));
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
	    
	    }else if(player.hasPermission((String) per.get("Chat.Color"))) {
			String ms = (String) config.get("Chat.11");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.11")); 
            event.setFormat(ChatColor.translateAlternateColorCodes('&' , ms));
        
	    }else {
			String ms = (String) config.get("Chat.12");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.11"));
			event.setFormat(ms);
	    }
	     
	        
	        if(!chatspam.contains(player.getName())) {
	        	event.setCancelled(false);
				chatspam.add(player.getName());
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
					
					@Override
					public void run() {
						chatspam.remove(player.getName());
						
					}
				}, 100);
				
			} else if(chatspam.contains(player.getName())) {
				event.setCancelled(true);
				player.sendMessage(MessagesUtil.PREFIX + "ßcBitte unterlasse das Spammen!!");
			}
	        
	        if(uppercaseLetter / (float) msg.length() > 0.3F) {
	        	event.setCancelled(true);
	        	player.sendMessage(MessagesUtil.PREFIX + "ßcBitte benutze weniger Groﬂbuchstaben!");
	        }
		
	}

}
