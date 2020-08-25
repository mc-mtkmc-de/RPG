package de.tempoo50.rpg.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.entity.Player;

public class HashMapUtil {
	
	public static HashMap<Player, Player> chat = new HashMap<>();
	public static HashMap<String, String> supportChat = new HashMap<>();
	
	public static List<String> needHelp = new LinkedList<String>();
	public static List<String> onlineSupporters = new ArrayList<String>();

}
