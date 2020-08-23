package de.tempoo50.rpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.main.Rpg;
import de.tempoo50.rpg.utils.MessagesUtil;

public class BelohnungsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(args.length == 0) {
				if(!Rpg.belohnungsmanager.getAllowBelohnung(player)) {
					player.sendMessage(MessagesUtil.PREFIX + "§aDu hast deine §btägliche Belohnung §aschon erhalten");
					long current = System.currentTimeMillis();
					long release = Rpg.belohnungsmanager.getTime(player);
					long millis = release - current;
					player.sendMessage(MessagesUtil.PREFIX + Rpg.belohnungsmanager.getRemainingTime(millis));
					return true;
					
				}
				
				player.sendMessage(MessagesUtil.PREFIX + "§aDu hast deine §btägliche BLelohnung §aerhalten!");
				Rpg.belohnungsmanager.setBelohnung(player);
				
				return true;
				
			}
			
			player.sendMessage(MessagesUtil.PREFIX + "§aBitte verwende §b/belohnung");
			return true;
		}
			
			
		return false;
	}

}
