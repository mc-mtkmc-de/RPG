package de.tempoo50.rpg.utils;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_12_R1.IScoreboardCriteria;
import net.minecraft.server.v1_12_R1.Packet;
import net.minecraft.server.v1_12_R1.PacketPlayOutScoreboardDisplayObjective;
import net.minecraft.server.v1_12_R1.PacketPlayOutScoreboardObjective;
import net.minecraft.server.v1_12_R1.PacketPlayOutScoreboardScore;
import net.minecraft.server.v1_12_R1.Scoreboard;
import net.minecraft.server.v1_12_R1.ScoreboardObjective;
import net.minecraft.server.v1_12_R1.ScoreboardScore;

public class ScoreBoardUtil {

	static File file = new File("plugins//RPG//Scoreboard.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static void loadScoreBoard(Player player) {
		
		Scoreboard board = new Scoreboard();
		
		ScoreboardObjective obj = board.registerObjective((String) config.get("Scoreboard.Header"), IScoreboardCriteria.b);
		
		PacketPlayOutScoreboardObjective createPacket = new PacketPlayOutScoreboardObjective(obj, 0);
		PacketPlayOutScoreboardObjective removePacket = new PacketPlayOutScoreboardObjective(obj, 1);
		PacketPlayOutScoreboardDisplayObjective display = new PacketPlayOutScoreboardDisplayObjective(1, obj);
		
		ScoreboardScore s01 = new ScoreboardScore(board, obj, "§c");
		ScoreboardScore s02 = new ScoreboardScore(board, obj, "§6Server");
		ScoreboardScore s03 = new ScoreboardScore(board, obj, "§b" + Bukkit.getServerName());
		ScoreboardScore s04 = new ScoreboardScore(board, obj, "§4");
		ScoreboardScore s05 = new ScoreboardScore(board, obj, "§6Klasse");
		ScoreboardScore s06 = new ScoreboardScore(board, obj, "§b" + player.getDisplayName());
		ScoreboardScore s07 = new ScoreboardScore(board, obj, "§1");
		ScoreboardScore s08 = new ScoreboardScore(board, obj, "§6Online");
		ScoreboardScore s09 = new ScoreboardScore(board, obj, "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers());
		ScoreboardScore s10 = new ScoreboardScore(board, obj, "§0");
		ScoreboardScore s11	= new ScoreboardScore(board, obj, "§6Level-UP");
		ScoreboardScore s12 = new ScoreboardScore(board, obj, "§b" + player.getExpToLevel());
		
		s01.setScore(12);
		s02.setScore(11);
		s03.setScore(10);
		s04.setScore(9);
		s05.setScore(8);
		s06.setScore(7);
		s07.setScore(6);
		s08.setScore(5);
		s09.setScore(4);
		s10.setScore(3);
		s11.setScore(2);
		s12.setScore(1);
		
		PacketPlayOutScoreboardScore ps01 = new PacketPlayOutScoreboardScore(s01);
		PacketPlayOutScoreboardScore ps02 = new PacketPlayOutScoreboardScore(s02);
		PacketPlayOutScoreboardScore ps03 = new PacketPlayOutScoreboardScore(s03);
		PacketPlayOutScoreboardScore ps04 = new PacketPlayOutScoreboardScore(s04);
		PacketPlayOutScoreboardScore ps05 = new PacketPlayOutScoreboardScore(s05);
		PacketPlayOutScoreboardScore ps06 = new PacketPlayOutScoreboardScore(s06);
		PacketPlayOutScoreboardScore ps07 = new PacketPlayOutScoreboardScore(s07);
		PacketPlayOutScoreboardScore ps08 = new PacketPlayOutScoreboardScore(s08);
		PacketPlayOutScoreboardScore ps09 = new PacketPlayOutScoreboardScore(s09);
		PacketPlayOutScoreboardScore ps10 = new PacketPlayOutScoreboardScore(s10);
		PacketPlayOutScoreboardScore ps11 = new PacketPlayOutScoreboardScore(s11);
		PacketPlayOutScoreboardScore ps12 = new PacketPlayOutScoreboardScore(s12);
		
		sendPacket(player, removePacket);
		sendPacket(player, createPacket);
		sendPacket(player, display);
		sendPacket(player, ps01);
		sendPacket(player, ps02);
		sendPacket(player, ps03);
		sendPacket(player, ps04);
		sendPacket(player, ps05);
		sendPacket(player, ps06);
		sendPacket(player, ps07);
		sendPacket(player, ps08);
		sendPacket(player, ps09);
		sendPacket(player, ps10);
		sendPacket(player, ps11);
		sendPacket(player, ps12);
		
	}
	
	public static void updateScoreboard(Player player) {
		
		Scoreboard board = new Scoreboard();
		
		ScoreboardObjective obj = board.registerObjective((String) config.get("Scoreboard.Header"), IScoreboardCriteria.b);
		
		PacketPlayOutScoreboardObjective createPacket = new PacketPlayOutScoreboardObjective(obj, 0);
		PacketPlayOutScoreboardObjective removePacket = new PacketPlayOutScoreboardObjective(obj, 1);
		PacketPlayOutScoreboardDisplayObjective display = new PacketPlayOutScoreboardDisplayObjective(1, obj);
		
		ScoreboardScore s01 = new ScoreboardScore(board, obj, "§c");
		ScoreboardScore s02 = new ScoreboardScore(board, obj, "§6Server");
		ScoreboardScore s03 = new ScoreboardScore(board, obj, "§b" + Bukkit.getServerName());
		ScoreboardScore s04 = new ScoreboardScore(board, obj, "§4");
		ScoreboardScore s05 = new ScoreboardScore(board, obj, "§6Klasse");
		ScoreboardScore s06 = new ScoreboardScore(board, obj, "§b" + player.getDisplayName());
		ScoreboardScore s07 = new ScoreboardScore(board, obj, "§1");
		ScoreboardScore s08 = new ScoreboardScore(board, obj, "§6Online");
		ScoreboardScore s09 = new ScoreboardScore(board, obj, "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers());
		ScoreboardScore s10 = new ScoreboardScore(board, obj, "§0");
		ScoreboardScore s11	= new ScoreboardScore(board, obj, "§6Level-UP");
		ScoreboardScore s12 = new ScoreboardScore(board, obj, "§b" + player.getExpToLevel());
		
		s01.setScore(12);
		s02.setScore(11);
		s03.setScore(10);
		s04.setScore(9);
		s05.setScore(8);
		s06.setScore(7);
		s07.setScore(6);
		s08.setScore(5);
		s09.setScore(4);
		s10.setScore(3);
		s11.setScore(2);
		s12.setScore(1);
		
		PacketPlayOutScoreboardScore ps01 = new PacketPlayOutScoreboardScore(s01);
		PacketPlayOutScoreboardScore ps02 = new PacketPlayOutScoreboardScore(s02);
		PacketPlayOutScoreboardScore ps03 = new PacketPlayOutScoreboardScore(s03);
		PacketPlayOutScoreboardScore ps04 = new PacketPlayOutScoreboardScore(s04);
		PacketPlayOutScoreboardScore ps05 = new PacketPlayOutScoreboardScore(s05);
		PacketPlayOutScoreboardScore ps06 = new PacketPlayOutScoreboardScore(s06);
		PacketPlayOutScoreboardScore ps07 = new PacketPlayOutScoreboardScore(s07);
		PacketPlayOutScoreboardScore ps08 = new PacketPlayOutScoreboardScore(s08);
		PacketPlayOutScoreboardScore ps09 = new PacketPlayOutScoreboardScore(s09);
		PacketPlayOutScoreboardScore ps10 = new PacketPlayOutScoreboardScore(s10);
		PacketPlayOutScoreboardScore ps11 = new PacketPlayOutScoreboardScore(s11);
		PacketPlayOutScoreboardScore ps12 = new PacketPlayOutScoreboardScore(s12);
		
		sendPacket(player, removePacket);
		sendPacket(player, createPacket);
		sendPacket(player, display);
		sendPacket(player, ps01);
		sendPacket(player, ps02);
		sendPacket(player, ps03);
		sendPacket(player, ps04);
		sendPacket(player, ps05);
		sendPacket(player, ps06);
		sendPacket(player, ps07);
		sendPacket(player, ps08);
		sendPacket(player, ps09);
		sendPacket(player, ps10);
		sendPacket(player, ps11);
		sendPacket(player, ps12);
		
	}
	
	public static void sendPacket(Player player, Packet<?> packet) {
		((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
	}

}
