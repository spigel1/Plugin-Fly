package me.eranspigel.fly;


import me.eranspigel.fly.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("fly").setExecutor(new FlyCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}