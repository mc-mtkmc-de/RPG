package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.utils.MessagesUtil;

public class ChatClearCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//RPG//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
			
			
			if(player.hasPermission((String) per.get("Chat.Clear"))) {
				if(args.length == 0) {
					
					for(int i = 0; i <= 150; i++)
						Bukkit.broadcastMessage(" ");
					Bukkit.broadcastMessage(MessagesUtil.PREFIX + "§aDer Chat wurde von §6" + player.getName() + " §ageleert!");
					
				}else
					player.sendMessage("§cBitte benutze §6/cc §c!");
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
