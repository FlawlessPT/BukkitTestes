package pt.flawless.Testes.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FlyCommand implements Listener, CommandExecutor
{

    @EventHandler
    public void onDamage(EntityDamageEvent e)
    {
        if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
        {
            e.setCancelled(true);
        }
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args)
    {

        Player player = (Player) commandSender;

        Boolean flyState = player.getAllowFlight();

        if (args.length == 0)
        {
            if (!flyState)
            {
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.GREEN + "Fly ativado com sucesso!");
            }
            else
            {
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.RED + "Fly desativado com sucesso!");
            }
        }

        return false;
    }
}
