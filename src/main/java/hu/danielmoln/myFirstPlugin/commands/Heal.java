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
            System.out.printf("This command only available for players!");
            return false;
        }

        /* At this stage, the sender must be a player */
        Player player = (Player) sender;

        if (args.length == 0)
        {
            player.setHealth(20.0d);
            player.sendMessage("You health has been restored!");
        }

        if (args.length == 1)
        {
            switch (args[0].toLowerCase()) {
                case "test":
                    System.out.println("Hellouw :)");
                    break;
            }
        }

        return true;
    }
}
