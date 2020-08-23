package de.tempoo50.rpg.commands;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.rpg.utils.MessagesUtil;

public class BlacklistCommand implements CommandExecutor, Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File perm = new File("plugins//RPG//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(player.hasPermission((String) per.get("Chat.Block"))) {
				if(args.length == 2) {

					File file = new File("plugins//RPG//Chat//Blacklist.yml");
					YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
					
					if(args[0].equalsIgnoreCase("remove")) {
						
						List<String> words = (List<String>) config.getStringList("VerboteneWörter");
						if(words.contains(args[1])) {
							words.remove(args[1]);
							config.set("VerboteneWörter", words);
							player.sendMessage(MessagesUtil.PREFIX + "§aDu hast das Wort §c" + args[1] + " §avon der Blacklist entfernt!");
							
							try {
								config.save(file);
							}catch(IOException e) {
								e.printStackTrace();
								
							}
							
						}else
							player.sendMessage(MessagesUtil.PREFIX + "§aDieses Wort befindet sich nicht auf der Blacklist");
						
					}else if(args[0].equalsIgnoreCase("add")) {
						List<String> words = config.getStringList("VerboteneWörter");
						words.add(args[1]);
						config.set("VerboteneWörter", words);
						player.sendMessage(MessagesUtil.PREFIX + "§aDu hast das Wort §c" + args[1] + " §azur Blacklist hinzugefügt!");
						try {
							config.save(file);
						} catch (IOException e) {
							
							e.printStackTrace();
						}
					}
					
				}
			}else
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}
	
	@EventHandler
	public void ChatBlock(AsyncPlayerChatEvent event) {
		
		Player player = event.getPlayer();
		String msg = event.getMessage().toLowerCase().trim();

		File file = new File("plugins//RPG//Chat//Blacklist.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		for(String words : config.getStringList("VerboteneWörter")) {
			if(msg.contains(words)) {
				event.setCancelled(true);
				player.sendMessage(MessagesUtil.BLOCK);
			}
		}
		
	}

}
