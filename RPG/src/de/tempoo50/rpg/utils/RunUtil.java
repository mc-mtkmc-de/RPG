package de.tempoo50.rpg.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.main.Rpg;

public class RunUtil {
	
	private Rpg plugin;
	private Player player;
	
	public RunUtil(Rpg plugin) {
		this.plugin = plugin;
	}
	
	public void startBroadcaster() {
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			
			@Override
			public void run() {
				ScoreBoardUtil.updateScoreboard(player);
				
			}
		}, 0, 120*20);
		
	}
	
	

}
