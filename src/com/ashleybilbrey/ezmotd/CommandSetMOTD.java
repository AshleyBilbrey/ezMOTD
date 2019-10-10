package com.ashleybilbrey.ezmotd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class CommandSetMOTD implements CommandExecutor {

    FileConfiguration config = EzMOTD.plugin.getConfig();

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args){
        if (commandSender.hasPermission("setmotd")){
            String argString = "";
            String chatString;
            if (args.length > 0) {
                for (String ss : args) {
                    if (! argString.equals("")){
                        argString = argString + " ";
                    }
                    argString = argString + ss;
                }
                config.set("motd", argString);
                EzMOTD.plugin.saveConfig();
                commandSender.sendMessage(ChatColor.GREEN + "Set MOTD to:");
                commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', config.getString("motd")));
                return true;
            } else {
                return false;
            }
        } else {
            commandSender.sendMessage(ChatColor.RED + "You do not have the permission to set the MOTD.");
            return true;
        }
    }
}