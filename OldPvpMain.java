package fr.hybridetv.oldpvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.hybridetv.oldpvp.events.OffHandEvent;

public class OldPvpMain  extends JavaPlugin {
	

	@Override
	public void onEnable() {
		getLogger().info("============ OFFHAND ===========");
		getLogger().info("Plugin has been start !");
		getLogger().info("Plugin by HybrideTV");
		getLogger().info("======================================");
		saveDefaultConfig();
		registerEvents();
		getServer().getPluginManager().registerEvents(new OffHandEvent(this), this);
    }
	
	@Override
	public void onDisable() {
		getLogger().info("============ OFFHAND ===========");
		getLogger().info("Plugin has been stop !");
		getLogger().info("Plugin by HybrideTV");
		getLogger().info("======================================");
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
	}
	
}

