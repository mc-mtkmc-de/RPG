package de.tempoo50.rpg.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.rpg.listener.ChatBlockListener;
import de.tempoo50.rpg.utils.MessagesUtil;

public class ChatBlockCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			File file = new File("plugins//RPG//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			if(player.hasPermission((String) config.get("Chat.Block"))) {
				if(args.length == 0) {
					if(ChatBlockListener.chatblock == true) {
						Bukkit.broadcastMessage(MessagesUtil.PREFIX + "§aDer Chat wurde von §b" + player.getName() + " §adeaktiviert!");
						ChatBlockListener.chatblock = false;
					}else {
						Bukkit.broadcastMessage(MessagesUtil.PREFIX + "§aDer Chat wurde von §b" + player.getName() + "§aaktiviert!");
						ChatBlockListener.chatblock = true;
					}
				}
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
