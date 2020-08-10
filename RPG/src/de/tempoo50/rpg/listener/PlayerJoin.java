package de.tempoo50.rpg.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.rpg.utils.ScoreBoardUtil;

public class PlayerJoin implements Listener {
	
	@EventHandler
	
	public void playerJoin(PlayerJoinEvent event) {
		
		ScoreBoardUtil.loadScoreBoard(event.getPlayer());
		
		File file = new File("plugins//RPG//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File sfile = new File("plugins//RPG//Spawn.yml");
		YamlConfiguration sconfig = YamlConfiguration.loadConfiguration(sfile);
		
		Player player = event.getPlayer();
		
		if(player.hasPermission((String) config.get("PlayerSpawn.Admin"))) {
			
			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.CREATIVE);
			player.setFoodLevel(20);
			player.setHealth(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X9");
			double y = sconfig.getDouble("Spawn.Y9");
			double z = sconfig.getDouble("Spawn.Z9");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw9");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch9");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
			
		}else if(player.hasPermission((String) config.get("PlayerSpawn.1"))) {
			
			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X1");
			double y = sconfig.getDouble("Spawn.Y1");
			double z = sconfig.getDouble("Spawn.Z1");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw1");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch1");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.2"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X2");
			double y = sconfig.getDouble("Spawn.Y2");
			double z = sconfig.getDouble("Spawn.Z2");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw2");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch2");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.3"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X3");
			double y = sconfig.getDouble("Spawn.Y3");
			double z = sconfig.getDouble("Spawn.Z3");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw3");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch3");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.4"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X4");
			double y = sconfig.getDouble("Spawn.Y4");
			double z = sconfig.getDouble("Spawn.Z4");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw4");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch4");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.5"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X5");
			double y = sconfig.getDouble("Spawn.Y5");
			double z = sconfig.getDouble("Spawn.Z5");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw5");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch5");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.6"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X6");
			double y = sconfig.getDouble("Spawn.Y6");
			double z = sconfig.getDouble("Spawn.Z6");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw6");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch6");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.7"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X7");
			double y = sconfig.getDouble("Spawn.Y7");
			double z = sconfig.getDouble("Spawn.Z7");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw7");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch7");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else if(player.hasPermission((String) config.get("PlayerSpawn.8"))) {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X8");
			double y = sconfig.getDouble("Spawn.Y8");
			double z = sconfig.getDouble("Spawn.Z8");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw8");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch8");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}else {

			event.setJoinMessage((String) sconfig.get("Message.Join"));
			
			player.setGameMode(GameMode.ADVENTURE);
			player.setHealth(20);
			player.setFoodLevel(20);
			
			World world = Bukkit.getWorld(sconfig.getString("Spawn.World"));
			double x = sconfig.getDouble("Spawn.X9");
			double y = sconfig.getDouble("Spawn.Y9");
			double z = sconfig.getDouble("Spawn.Z9");
			float yaw = (float) sconfig.getDouble("Spawn.Yaw9");
			float pitch = (float) sconfig.getDouble("Spawn.Pitch9");
			Location location = new Location(world, x, y, z, yaw, pitch);
			
			player.teleport(location);
		
		}
		
	}

}
