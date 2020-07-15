package de.tempoo50.rpg.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.tempoo50.rpg.commands.*;
import de.tempoo50.rpg.files.*;
import de.tempoo50.rpg.listener.*;

public class Rpg extends JavaPlugin {
	
	private static Rpg plugin;
	
	public void onEnable() {
		
		plugin = this;
		
		try {
            loadFile();
            loadCommands();
            loadListener(Bukkit.getPluginManager());
           
        }catch (Exception e1){
            e1.printStackTrace();
            log("§4Fehler: §cPlugin konnte nicht geladen werden.");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }finally{
            log("§aPlugin geladen.");
            log("§agecodet von Tempoo50.");
       }
		
	}
	
	private void loadFile() {
		MobNamefile.loadMobs();
		PermissionFile.loadPermission();
		RespawnFile.loadrespwn();
		
	}
	
	private void loadCommands() {
		
		getCommand("cow").setExecutor(new CowCommand());
		getCommand("zombie").setExecutor(new ZombieCommand());
		getCommand("witch").setExecutor(new WitchCommand());
		getCommand("pig").setExecutor(new PigCommand());
		getCommand("skelett").setExecutor(new SkelettCommand());
		getCommand("spider").setExecutor(new SpiderCommand());
		getCommand("giant").setExecutor(new GiantCommand());
		
	}
	
	private void loadListener(PluginManager pm) {
		
		pm.registerEvents(new KillZombie(this), this);
		pm.registerEvents(new KillWitch(this), this);
		pm.registerEvents(new KillPig(this), this);
		pm.registerEvents(new KillCow(this), this);
		pm.registerEvents(new KillSkelett(this), this);
		pm.registerEvents(new KillChicken(), this);
		pm.registerEvents(new KillSpider(this), this);
		pm.registerEvents(new KillGiant(this), this);
		
	}
	
	
	public static Rpg getPlugin() {
		return plugin;
		
    }
	
	   public static void log(String msg){
	        Bukkit.getConsoleSender().sendMessage(msg);
	    }
	    
	    public static void logs(final String message){
	        Bukkit.getConsoleSender().sendMessage(message);
	    }

}
