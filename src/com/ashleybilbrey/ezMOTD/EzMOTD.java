package com.ashleybilbrey.ezmotd;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class EzMOTD extends JavaPlugin {

    public static EzMOTD plugin;
    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        getCommand("motd").setExecutor(new CommandMOTD());
        getCommand("setmotd").setExecutor(new CommandSetMOTD());
        getCommand("ezmotd").setExecutor(new CommandEzMOTD());
        loadConfig();
        getLogger().info("ezMOTD Loaded.");
    }

    public void onDisable() {
        getLogger().info("ezMOTD Shutting Down...");
    }

    public void loadConfig() {
        config.options().copyDefaults(true);
        saveConfig();
    }
}
