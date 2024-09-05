package hu.danielmoln.myFirstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args)
    {
        if (!(sender instanceof Player)) {
            /* Sender might be a console or command block */
            return false;
        }

        /* At this stage, the sender must be a player */
        Player player = (Player) sender;

        player.setHealth(20.0d);
        player.sendMessage("You health has been restored!");

        return true;
    }
}
