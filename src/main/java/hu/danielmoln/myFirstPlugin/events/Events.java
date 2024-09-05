package hu.danielmoln.myFirstPlugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener
{
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e)
    {
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "Stop moving! You are frozen!");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        e.setHatchingType(EntityType.BEE);
        e.getPlayer().sendMessage("You just threw an egg!");
    }
}
