package de.tempoo50.rpg.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.rpg.utils.HashMapUtil;

public class ChatSupportListener implements Listener {
	
	@EventHandler
	
	public void onChat(AsyncPlayerChatEvent event) {
		
		Player player = event.getPlayer();
		if(HashMapUtil.needHelp.contains(player.getName())) {
			event.setCancelled(true);
			Bukkit.broadcastMessage("§c[§4!§c] §f<" + player.getName() + "> " + event.getMessage());
		}
		
		if(HashMapUtil.supportChat.containsKey(player.getName())) {
			Player target = Bukkit.getPlayer(HashMapUtil.supportChat.get(player.getName()));
			event.setCancelled(true);
			player.sendMessage("§b§lSUPPORT §8» §a" + "Ich" + " §7-> §c" + target.getName() + "§r: " + event.getMessage());
			target.sendMessage("§b§lSUPPORT §8» §a" + player.getName() + " §7-> §c" + "Ich" + "§r: " + event.getMessage());
		}
		
	}

}
