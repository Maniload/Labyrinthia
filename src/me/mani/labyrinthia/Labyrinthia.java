package me.mani.labyrinthia;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.google.gson.Gson;

public class Labyrinthia extends JavaPlugin {

	private static Labyrinthia instance;
	private static Gson gson = new Gson();
	
	@Override
	public void onEnable() {
		
		instance = this;
		
		for (Player onlinePlayer : Bukkit.getOnlinePlayers())
			onlinePlayer.sendMessage("Damit das Plugin fehlerfrei funktionieren kann, bitte einmal reloggen.");
		
	}
	
	public static Labyrinthia getInstance() {
		return instance;
	}
	
	public static Gson getGson() {
		return gson;
	}
	
}
