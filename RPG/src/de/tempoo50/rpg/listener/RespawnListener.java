package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {
	
	@EventHandler
	public void onRespawn(PlayerRespawnEvent event) {
		
		Player player = event.getPlayer();

		File file = new File("plugins//RPG//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		File pfile = new File("plugins//RPG//Permission.yml");
		YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);
		
		if(player.hasPermission((String) pconfig.get("Resapwn.1"))) {
			
			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X1");
			double y = config.getDouble("Respawn.Y1");
			double z = config.getDouble("Respawn.Z1");
			float yaw = (float) config.getDouble("Respawn.Yaw1");
			float pitch = (float) config.getDouble("Respawn.Pitch1");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Resapwn.2"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X2");
			double y = config.getDouble("Respawn.Y2");
			double z = config.getDouble("Respawn.Z2");
			float yaw = (float) config.getDouble("Respawn.Yaw2");
			float pitch = (float) config.getDouble("Respawn.Pitch2");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Resapwn.3"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X3");
			double y = config.getDouble("Respawn.Y3");
			double z = config.getDouble("Respawn.Z3");
			float yaw = (float) config.getDouble("Respawn.Yaw3");
			float pitch = (float) config.getDouble("Respawn.Pitch3");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Respawn.4"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X4");
			double y = config.getDouble("Respawn.Y4");
			double z = config.getDouble("Respawn.Z4");
			float yaw = (float) config.getDouble("Respawn.Yaw4");
			float pitch = (float) config.getDouble("Respawn.Pitch4");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Resapwn.5"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X5");
			double y = config.getDouble("Respawn.Y5");
			double z = config.getDouble("Respawn.Z5");
			float yaw = (float) config.getDouble("Respawn.Yaw5");
			float pitch = (float) config.getDouble("Respawn.Pitch5");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Respawn.6"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X6");
			double y = config.getDouble("Respawn.Y6");
			double z = config.getDouble("Respawn.Z6");
			float yaw = (float) config.getDouble("Respawn.Yaw6");
			float pitch = (float) config.getDouble("Respawn.Pitch6");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Respawn.7"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X7");
			double y = config.getDouble("Respawn.Y7");
			double z = config.getDouble("Respawn.Z7");
			float yaw = (float) config.getDouble("Respawn.Yaw7");
			float pitch = (float) config.getDouble("Respawn.Pitch7");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) pconfig.get("Resapwn.8"))) {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X8");
			double y = config.getDouble("Respawn.Y8");
			double z = config.getDouble("Respawn.Z8");
			float yaw = (float) config.getDouble("Respawn.Yaw8");
			float pitch = (float) config.getDouble("Respawn.Pitch8");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else {

			World world = Bukkit.getWorld(config.getString("Respawn.World"));
			double x = config.getDouble("Respawn.X9");
			double y = config.getDouble("Respawn.Y9");
			double z = config.getDouble("Respawn.Z9");
			float yaw = (float) config.getDouble("Respawn.Yaw9");
			float pitch = (float) config.getDouble("Respawn.Pitch9");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}
		
	}

}
