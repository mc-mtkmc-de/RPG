package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.rpg.utils.MessagesUtil;

public class ChatBlockListener implements Listener {
	
	public static boolean chatblock = true;
	
	@EventHandler
	public void onchatblock(AsyncPlayerChatEvent event) {
		
		File file = new File("plugins//RPG//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		Player player = event.getPlayer();
		if(player.hasPermission((String) config.get("Chat.Block"))) return;
		
		if(chatblock == false) {
			
			event.setCancelled(true);
			player.sendMessage(MessagesUtil.PREFIX + "§aDu kannst hier nicht schreiben!");
			return;
			
		}
		
	}

}
