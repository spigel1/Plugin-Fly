package me.eranspigel.fly.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission("permissions.fly")) { // Check for permission
                if (p.getAllowFlight()) {
                    p.setFlying(false);
                    p.setAllowFlight(false);
                    p.sendMessage("Flight mode disabled.");
                } else {
                    p.setAllowFlight(true);
                    p.sendMessage("Flight mode enabled.");
                }
            } else {
                p.sendMessage("You don't have permission to use this command.");
            }
        }
        return true;
    }
}