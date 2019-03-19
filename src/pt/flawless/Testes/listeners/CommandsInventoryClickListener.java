package pt.flawless.Testes.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CommandsInventoryClickListener implements Listener
{
    @EventHandler
    public void onCommmandsInventoryClick(InventoryClickEvent e)
    {
        if (e.getInventory().getTitle().equalsIgnoreCase("Comandos: "))
        {
            e.setCancelled(true);
        }

    }
}
