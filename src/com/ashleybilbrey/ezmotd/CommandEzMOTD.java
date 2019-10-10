package com.ashleybilbrey.ezmotd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandEzMOTD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){
        commandSender.sendMessage(ChatColor.AQUA + "ezMOTD " + ChatColor.RESET + "by " + ChatColor.AQUA + "Ashley Bilbrey " + ChatColor.RESET + "- version " + ChatColor.AQUA + "1.0.1");
        commandSender.sendMessage("An easy pluign for server owners to show a message when players join the server.");
        commandSender.sendMessage("Complete with " + ChatColor.RED + "& " + ChatColor.RESET + "codes!");
        return true;
    }

}
