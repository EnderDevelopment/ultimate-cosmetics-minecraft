package com.ultimatescosmetics;

import org.bukkit.plugin.java.JavaPlugin;

public class UltimateCosmetics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("UltimateCosmetics has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("UltimateCosmetics has been disabled!");
    }
}