package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Spawn.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			File pfile = new File("plugins//RPG//Permission.yml");
			YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);
			
			if(args.length == 0) {

				player.sendMessage("Bitte benutze /spawn <Kapitel>");
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.1"))) {
				if(args[0].equalsIgnoreCase("9")) {
					if(args.length == 1) {
						
						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X1");
						double y = config.getDouble("Spawn.Y1");
						double z = config.getDouble("Spawn.Z1");
						float yaw = (float) config.getDouble("Spawn.Yaw1");
						float pitch = (float) config.getDouble("Spawn.Pitch1");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel neun teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.2"))) {
				if(args[0].equalsIgnoreCase("8")) {
					if(args.length == 1) {
						
						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X2");
						double y = config.getDouble("Spawn.Y2");
						double z = config.getDouble("Spawn.Z2");
						float yaw = (float) config.getDouble("Spawn.Yaw2");
						float pitch = (float) config.getDouble("Spawn.Pitch2");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel acht teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.3"))) {
				if(args[0].equalsIgnoreCase("7")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X3");
						double y = config.getDouble("Spawn.Y3");
						double z = config.getDouble("Spawn.Z3");
						float yaw = (float) config.getDouble("Spawn.Yaw3");
						float pitch = (float) config.getDouble("Spawn.Pitch3");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel siebte teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.4"))) {
				if(args[0].equalsIgnoreCase("6")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X4");
						double y = config.getDouble("Spawn.Y4");
						double z = config.getDouble("Spawn.Z4");
						float yaw = (float) config.getDouble("Spawn.Yaw4");
						float pitch = (float) config.getDouble("Spawn.Pitch4");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel sechs teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.5"))) {
				if(args[0].equalsIgnoreCase("5")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X5");
						double y = config.getDouble("Spawn.Y5");
						double z = config.getDouble("Spawn.Z5");
						float yaw = (float) config.getDouble("Spawn.Yaw5");
						float pitch = (float) config.getDouble("Spawn.Pitch5");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel fünf teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.6"))) {
				if(args[0].equalsIgnoreCase("4")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X6");
						double y = config.getDouble("Spawn.Y6");
						double z = config.getDouble("Spawn.Z6");
						float yaw = (float) config.getDouble("Spawn.Yaw6");
						float pitch = (float) config.getDouble("Spawn.Pitch6");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel vier teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.7"))) {
				if(args[0].equalsIgnoreCase("3")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X7");
						double y = config.getDouble("Spawn.Y7");
						double z = config.getDouble("Spawn.Z7");
						float yaw = (float) config.getDouble("Spawn.Yaw7");
						float pitch = (float) config.getDouble("Spawn.Pitch7");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel drei teleportiert!");
						
					}
				}
				
			}else if(player.hasPermission((String) pconfig.get("PlayerSpawn.8"))) {
				if(args[0].equalsIgnoreCase("2")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X8");
						double y = config.getDouble("Spawn.Y8");
						double z = config.getDouble("Spawn.Z8");
						float yaw = (float) config.getDouble("Spawn.Yaw8");
						float pitch = (float) config.getDouble("Spawn.Pitch8");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel zwei teleportiert!");
						
					}
				}
				
			}else {
				if(args[0].equalsIgnoreCase("9")) {
					if(args.length == 1) {

						World world = Bukkit.getWorld(config.getString("Spawn.World"));
						double x = config.getDouble("Spawn.X9");
						double y = config.getDouble("Spawn.Y9");
						double z = config.getDouble("Spawn.Z9");
						float yaw = (float) config.getDouble("Spawn.Yaw9");
						float pitch = (float) config.getDouble("Spawn.Pitch9");
						Location location = new Location(world, x, y, z, yaw, pitch);

						player.teleport(location);
						player.sendMessage("Du wurdest zum Spawn von Kapitel eins teleportiert!");
						
					}
				}
			}
		}
		
		return false;
	}

}
