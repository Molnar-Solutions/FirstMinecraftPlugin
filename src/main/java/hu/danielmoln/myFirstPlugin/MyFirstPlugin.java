package hu.danielmoln.myFirstPlugin;

import hu.danielmoln.myFirstPlugin.commands.Heal;
import hu.danielmoln.myFirstPlugin.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    public void registerCommands() {
        getCommand("heal").setExecutor(new Heal());
    }
}
