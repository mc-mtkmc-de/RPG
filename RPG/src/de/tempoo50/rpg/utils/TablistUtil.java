package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import net.md_5.bungee.api.ChatColor;

public class TablistUtil {
	
	public static Scoreboard tab;

	static File file = new File("plugins//RPG//Permission.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	static File tfile = new File("plugins//RPG//Tablist.yml");
	static YamlConfiguration pre = YamlConfiguration.loadConfiguration(tfile);
	
	public static void loadTeam() {
		
		tab = Bukkit.getScoreboardManager().getNewScoreboard();
		
		Team Admin = tab.registerNewTeam("00000Admin");
		Team Dev = tab.registerNewTeam("00001Dev");
		Team Shulker = tab.registerNewTeam("00002Shulker");
		Team Elytren = tab.registerNewTeam("00003Elytren");
		Team MBuilder = tab.registerNewTeam("00004MBuilder");
		Team Builder = tab.registerNewTeam("00005Builder");
		Team Mod = tab.registerNewTeam("00006Mod");
		Team Sup = tab.registerNewTeam("00007Sup");
		Team Krieger = tab.registerNewTeam("00008Krieger");
		Team Jager = tab.registerNewTeam("00009Jaeger");
		Team Tut = tab.registerNewTeam("00010Start");
		
		Admin.setPrefix((String) pre.get("Prefix.1"));
		Dev.setPrefix((String) pre.get("Prefix.2"));
		Shulker.setPrefix((String) pre.get("Prefix.3"));
		Elytren.setPrefix((String) pre.get("Prefix.4"));
		MBuilder.setPrefix((String) pre.get("Prefix.5"));
		Builder.setPrefix((String) pre.get("Prefix.6"));
		Mod.setPrefix((String) pre.get("Prefix.7"));
		Sup.setPrefix((String) pre.get("Prefix.8"));
		Krieger.setPrefix((String) pre.get("Prefix.9"));
		Jager.setPrefix((String) pre.get("Prefix.10"));
		Tut.setPrefix((String) pre.get("Prefix.11"));
	
	}
	
	@SuppressWarnings("deprecation")
	public static void setPrefix(Player player) {
		
		String team = "";
		
		if(player.hasPermission((String) config.get("Tab.1"))) {
			String msg = (String) pre.get("Prefix.1");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00000Admin";
		}else if(player.hasPermission((String) config.get("Tab.2"))) {
			String msg = (String) pre.get("Prefix.2");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00001Dev";
		}else if(player.hasPermission((String) config.get("Tab.3"))) {
			String msg = (String) pre.get("Prefix.3");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00002Shulker";
		}else if(player.hasPermission((String) config.get("Tab.4"))) {
			String msg = (String) pre.get("Prefix.4");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00003Elytren";
		}else if(player.hasPermission((String) config.get("Tab.5"))) {
			String msg = (String) pre.get("Prefix.5");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00004MBuilder";
		}else if(player.hasPermission((String) config.get("Tab.6"))) {
			String msg = (String) pre.get("Prefix.6");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00005Builder";
		}else if(player.hasPermission((String) config.get("Tab.7"))) {
			String msg = (String) pre.get("Prefix.7");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00006Mod";
		}else if(player.hasPermission((String) config.get("Tab.8"))) {
			String msg = (String) pre.get("Prefix.8");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00007Sup";
		}else if(player.hasPermission((String) config.get("Permnission.9"))) {
			String msg = (String) pre.get("Prefix.9");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00008Krieger";
		}else if(player.hasPermission((String) config.get("Tab.10"))) {
			String msg = (String) pre.get("Prefix.10");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00009Jaeger";
		}else {
			String msg = (String) pre.get("Prefix.11");
			msg = ChatColor.translateAlternateColorCodes('&', msg);
			team = "00010Start";
		}
		
		tab.getTeam(team).addPlayer(player);
		player.setDisplayName(tab.getTeam(team).getPrefix() + player.getName());
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			all.setScoreboard(tab);
		}
		
	}


	
	
}
