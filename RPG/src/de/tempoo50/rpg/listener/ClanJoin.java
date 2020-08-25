package de.tempoo50.rpg.listener;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.rpg.utils.ClanFunktionen;
import de.tempoo50.rpg.utils.ClanPlayer;
import de.tempoo50.rpg.utils.ClanUtil;

public class ClanJoin implements Listener {
	
	@EventHandler
	public void onClanJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(!(ClanPlayer.getClan(player) == null)) {
			ClanFunktionen.msgisonline(player, ClanPlayer.getClan(player));
		}
		
		List<String> invites = ClanPlayer.getInvites(player);
		if(!invites.isEmpty()) {
			player.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanseinladen());
			for(String clan : invites) {
				player.sendMessage("§e-§x§l " + clan);
			}
		}
		
	}

}
