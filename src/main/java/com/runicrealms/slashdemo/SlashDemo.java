package com.runicrealms.slashdemo;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlashDemo extends JavaPlugin {
    public static SlashDemo getPlugin() {
        return plugin;
    }

    private static SlashDemo plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.registerEvents(new LeftClickListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerEvents(Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, this);
        }
    }

}
