package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.main.Rpg;

public class RunUtil {
	
	private Rpg plugin;
	private Player player;
	
	public RunUtil(Rpg plugin) {
		this.plugin = plugin;
	}
	
	public void startScoreboard() {
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			
			@Override
			public void run() {
				ScoreBoardUtil.updateScoreboard(player);
				
			}
		}, 0, 120*20);
		
	}
	
	public void startBroadcaster() {

		File file = new File("plugins//RPG//Broadcast.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		if((boolean) config.get("UseBroadcaster") == true) {
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Broadcaster.pickMessage()));
					
				}
			}, 0, (int) config.get("Messages_Delay")*20); 
		}
	}
	
	

}
