package com.ashleybilbrey.ezmotd;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsClass implements Listener {

    FileConfiguration config = EzMOTD.plugin.getConfig();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        String message = config.getString("motd");
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}
