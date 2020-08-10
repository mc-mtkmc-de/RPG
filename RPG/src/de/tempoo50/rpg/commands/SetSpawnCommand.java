package de.tempoo50.rpg.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Spawn.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			File pfile = new File("plugins//RPG//Permission.yml");
			YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);
			
			if(player.hasPermission((String) pconfig.get("PlayerSpawn.Admin"))) {
				if(args.length == 0) {
					
					player.sendMessage("Bitte verwende /spawn <1-9>");
					
				}else {
					
					if(args[0].equalsIgnoreCase("1")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X9", player.getLocation().getX());
							config.set("Spawn.Y9", player.getLocation().getY());
							config.set("Spawn.Z9", player.getLocation().getZ());
							config.set("Spawn.Yaw9", player.getLocation().getYaw());
							config.set("Spawn.Pitch9", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das ertse Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("2")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X8", player.getLocation().getX());
							config.set("Spawn.Y8", player.getLocation().getY());
							config.set("Spawn.Z8", player.getLocation().getZ());
							config.set("Spawn.Yaw8", player.getLocation().getYaw());
							config.set("Spawn.Pitch8", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das zweite Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("3")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X7", player.getLocation().getX());
							config.set("Spawn.Y7", player.getLocation().getY());
							config.set("Spawn.Z7", player.getLocation().getZ());
							config.set("Spawn.Yaw7", player.getLocation().getYaw());
							config.set("Spawn.Pitch7", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das dritte Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("4")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X6", player.getLocation().getX());
							config.set("Spawn.Y6", player.getLocation().getY());
							config.set("Spawn.Z6", player.getLocation().getZ());
							config.set("Spawn.Yaw6", player.getLocation().getYaw());
							config.set("Spawn.Pitch6", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das vierte Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("5")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X5", player.getLocation().getX());
							config.set("Spawn.Y5", player.getLocation().getY());
							config.set("Spawn.Z5", player.getLocation().getZ());
							config.set("Spawn.Yaw5", player.getLocation().getYaw());
							config.set("Spawn.Pitch5", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das fünfte Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("6")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X4", player.getLocation().getX());
							config.set("Spawn.Y4", player.getLocation().getY());
							config.set("Spawn.Z4", player.getLocation().getZ());
							config.set("Spawn.Yaw4", player.getLocation().getYaw());
							config.set("Spawn.Pitch4", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das sechste Kapitel Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("7")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X3", player.getLocation().getX());
							config.set("Spawn.Y3", player.getLocation().getY());
							config.set("Spawn.Z3", player.getLocation().getZ());
							config.set("Spawn.Yaw3", player.getLocation().getYaw());
							config.set("Spawn.Pitch3", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das siebte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("8")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X2", player.getLocation().getX());
							config.set("Spawn.Y2", player.getLocation().getY());
							config.set("Spawn.Z2", player.getLocation().getZ());
							config.set("Spawn.Yaw2", player.getLocation().getYaw());
							config.set("Spawn.Pitch2", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das achte Kapitel erstellt");
						}
						
					}else if(args[0].equalsIgnoreCase("9")) {
						if(args.length == 1) {
							
							config.set("Spawn.World", player.getWorld().getName());
							config.set("Spawn.X1", player.getLocation().getX());
							config.set("Spawn.Y1", player.getLocation().getY());
							config.set("Spawn.Z1", player.getLocation().getZ());
							config.set("Spawn.Yaw1", player.getLocation().getYaw());
							config.set("Spawn.Pitch1", player.getLocation().getPitch());
							
							try {
								config.save(file);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Spawnpunkt für das neunte Kapitel erstellt");
						}
					}
				}
			}
			
		}
		
		return false;
	}

}
