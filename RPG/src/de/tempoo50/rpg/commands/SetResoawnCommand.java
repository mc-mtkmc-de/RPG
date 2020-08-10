package de.tempoo50.rpg.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class SetResoawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//RPG//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			File rfile = new File("plugins//RPG//Spawn.yml");
			YamlConfiguration rconfig = YamlConfiguration.loadConfiguration(rfile);
			
			if(player.hasPermission((String) config.get("SetRespawn"))) {
				if(args.length == 0) {
					
					player.sendMessage("Bitte verwende /setrespawn <1-9>");
					
				}else {
					
					if(args[0].equalsIgnoreCase("1")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.World", player.getWorld().getName());
							rconfig.set("Respawn.X9", player.getLocation().getX());
							rconfig.set("Respawn.Y9", player.getLocation().getY());
							rconfig.set("Respawn.Z9", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw9", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch9", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das ertse Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("2")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X8", player.getLocation().getX());
							rconfig.set("Respawn.Y8", player.getLocation().getY());
							rconfig.set("Respawn.Z8", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw8", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch8", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das zweite Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("3")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X7", player.getLocation().getX());
							rconfig.set("Respawn.Y7", player.getLocation().getY());
							rconfig.set("Respawn.Z7", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw7", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch7", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das dritte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("4")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X6", player.getLocation().getX());
							rconfig.set("Respawn.Y6", player.getLocation().getY());
							rconfig.set("Respawn.Z6", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw6", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch6", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das vierte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("5")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X5", player.getLocation().getX());
							rconfig.set("Respawn.Y5", player.getLocation().getY());
							rconfig.set("Respawn.Z5", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw5", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch5", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das fünfte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("6")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X4", player.getLocation().getX());
							rconfig.set("Respawn.Y4", player.getLocation().getY());
							rconfig.set("Respawn.Z4", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw4", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch4", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das sechste Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("7")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X3", player.getLocation().getX());
							rconfig.set("Respawn.Y3", player.getLocation().getY());
							rconfig.set("Respawn.Z3", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw3", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch3", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das siebte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("8")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X2", player.getLocation().getX());
							rconfig.set("Respawn.Y2", player.getLocation().getY());
							rconfig.set("Respawn.Z2", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw2", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch2", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das achte Kapitel erstellt");
							
						}
						
					}else if(args[0].equalsIgnoreCase("9")) {
						if(args.length == 1) {
							
							rconfig.set("Respawn.X1", player.getLocation().getX());
							rconfig.set("Respawn.Y1", player.getLocation().getY());
							rconfig.set("Respawn.Z1", player.getLocation().getZ());
							rconfig.set("Respawn.Yaw1", player.getLocation().getYaw());
							rconfig.set("Respawn.Pitch1", player.getLocation().getPitch());
							
							try {
								rconfig.save(rfile);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							player.sendMessage("Du hast den Respawnpunkt für das neunte Kapitel erstellt");
							
						}
					}
					
				}
			}
			
		}
		
		return false;
	}

}
