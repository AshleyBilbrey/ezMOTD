package com.ashleybilbrey.ezmotd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class CommandMOTD implements CommandExecutor {

    FileConfiguration config = EzMOTD.plugin.getConfig();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', config.getString("motd")));
        return true;
    }
}
