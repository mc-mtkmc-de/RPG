package de.tempoo50.rpg.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.file.YamlConfiguration;

public class TabCompleteClan implements TabCompleter {

	
	public TabCompleteClan() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> mm = new ArrayList<>();

		if (args.length == 1) {
			
			File perm = new File("plugins//RPG//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
			
			if (args[0].startsWith("c")) {
				if(sender.hasPermission((String) per.get("Clan.Create"))) {
					mm.add("create");
					return mm;
				}
			} else if (args[0].startsWith("p")) {
				mm.add("promote");
				return mm;
			} else if (args[0].startsWith("l")) {
				mm.add("leave");
				return mm;
			} else if (args[0].startsWith("j")) {
				mm.add("Join");
				return mm;
			} else if (args[0].startsWith("k")) {
				mm.add("kick");
				return mm;
			} else if (args[0].startsWith("d")) {
				mm.add("deny");
				mm.add("delete");
				return mm;
			} else if (args[0].startsWith("del")) {
				mm.add("delete");
				return mm;
			} else if (args[0].startsWith("den")) {
				mm.add("deny");
				return mm;
			} else if (args[0].startsWith("i")) {
				mm.add("info");
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("inf")) {
				mm.add("info");
				return mm;
			} else if (args[0].startsWith("inv")) {
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("invite")) {
				mm.add("invite");
				mm.add("invites");
				return mm;
			} else if (args[0].startsWith("invites")) {
				mm.add("invites");
				return mm;
			}
			else {
				if(sender.hasPermission("Clan.create")) {
					mm.add("create");
				}
				mm.add("delete");
				mm.add("promote");
				mm.add("leave");
				mm.add("Join");
				mm.add("kick");
				mm.add("deny");
				mm.add("info");
				mm.add("invite");
				mm.add("invites");
				return mm;
			}
		}
		return mm;
	}
}
