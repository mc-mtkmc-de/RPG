package de.tempoo50.rpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HomeManager;

public class HomeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			HomeManager manager = new HomeManager(player.getUniqueId());
			
			if(args.length == 0) {
				if(manager.getHomes().size() == 0) {
					player.sendMessage("§6Du besitzt noch keine Homes!");
				}
				
				String out = "";
				for(String s : manager.getHomes()) {
					out = out +"§7, §e" + s;
				}
				
				out = out.trim();
				
				player.sendMessage("Deine Homes: " + out);
				
			}
			
			if(args.length == 1) {
				
				if(!manager.exist(args[0])) {
					player.sendMessage("§cDieses Home exestiert nicht!");
				}
				
				player.teleport(manager.getLocation(args[0]));
				player.sendMessage("§aDu wurdest zu deinem Home §b" + args[0] + " §ateleportiert!");
			}
			
		}
		
		return false;
	}

}