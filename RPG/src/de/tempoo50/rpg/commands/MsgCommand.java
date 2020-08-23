package de.tempoo50.rpg.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.HashMapUtil;
import de.tempoo50.rpg.utils.MessagesUtil;

public class MsgCommand implements CommandExecutor {

	String msg = "";
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(args.length >= 2) {
				Player target = Bukkit.getPlayer(args[0]);
				
				if(target != null) {
					for(int i = 1; i < args.length; i++) {
						msg = msg + args[i] + " ";
					}
					
					player.sendMessage("§c§lDu§f» §a" + target.getName() + "§f» " + msg);
					target.sendMessage("§c" + player.getName() + "§f» §c§lDir§f» " + msg);
					
					msg = "";
					
					HashMapUtil.chat.put(target, player);
					HashMapUtil.chat.put(player, target);
					
				}else
					player.sendMessage(MessagesUtil.PREFIX + "§cDer Spieler ist gerade nicht Online");
			}
		}
		
		return false;
	}

}
