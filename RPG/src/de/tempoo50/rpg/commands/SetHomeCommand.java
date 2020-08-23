package de.tempoo50.rpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HomeManager;
import de.tempoo50.rpg.utils.MessagesUtil;

public class SetHomeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length == 0) {
				player.sendMessage("§b/sethome <Name>");
			}
			
			if(args.length == 1) {
				HomeManager manager = new HomeManager(player.getUniqueId());
				
				if(!(manager.getHomes().size() <1)) {
					player.sendMessage("§aDu kannst nur Maximal ein Home setzen!");
					return true;
				}
				
				manager.addHome(player.getLocation(), args[0]);
				player.sendMessage(MessagesUtil.PREFIX + "§aDu hast erfolgreich dein §bHome §agesetzt!");
				
			}
			
		}
		
		return false;
	}

}
