package de.tempoo50.rpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HashMapUtil;
import de.tempoo50.rpg.utils.MessagesUtil;

public class RCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(args.length >= 1) {
				if(HashMapUtil.chat.containsKey(player)) {
					
					Player target = HashMapUtil.chat.get(player);
					
					if(target != null) {
						
						String msg = "";
						
						for(int i = 0; i < args.length; i++) {
							msg += args[i] + " ";
						}
						
						msg.trim();
						
						player.sendMessage("§c§lDu§f» §a" + target.getName() + "§f» " + msg);
						target.sendMessage("§c" + player.getName() + "§f» §c§lDir§f» " + msg);
						
					}else
						player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler ist gerade nicht online!");
					
				}
			}
		}
		
		return false;
	}

}
