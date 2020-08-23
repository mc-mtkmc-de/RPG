package de.tempoo50.rpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HomeManager;

public class DelHomeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			HomeManager manager = new HomeManager(player.getUniqueId());
			
			if(args.length == 0) {
				player.sendMessage("/delhome <Name>");
			}
			
			if(args.length == 1) {
				if(!manager.exist(args[0])){
					player.sendMessage("§cDieses Home existiert leider nicht");
				}
				
				manager.delHome(args[0]);
				player.sendMessage("§aDas Home §b" + args[0] + " §awurde gelöscht");
			}
			
		}
		
		return false;
	}

}
