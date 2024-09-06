package hu.danielmoln.myFirstPlugin.commands;

import hu.danielmoln.myFirstPlugin.MyFirstPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConfigCommand implements CommandExecutor
{
    private MyFirstPlugin main;

    public ConfigCommand(MyFirstPlugin main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args)
    {
        if(!(sender instanceof Player))
        {
            return false;
        }

        if(((Player) sender).hasPermission("test"))
        {
            // do something
        }

        Player player = (Player) sender;

        player.sendMessage(main.getConfig().getString("Word"));
        player.sendMessage(main.getConfig().getInt("Number") + "");
        player.sendMessage(main.getConfig().getBoolean("Boolean") + "");

        for (String str : main.getConfig().getStringList("String-list"))
        {
            player.sendMessage(str);
        }

        return true;
    }
}
