package pt.flawless.Testes.inventories;

import mcmacau.barberianscore.Inventory.BInventory;
import mcmacau.barberianscore.ItemStack.BItemStack;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandsMenu
{
    public static void load(Player p)
    {
        BInventory bInventory = new BInventory(BInventory.BInventorySize.SIZE_36, "Comandos: ");
        //BItemStack flyState = null;
        ItemStack item = null;

        BItemStack fly = new BItemStack(Material.FEATHER, 1).setDisplaName(ChatColor.GREEN + "Fly:").addLoreLine("§7Clica para alterar o estado do Fly.");

        if (p.getAllowFlight())
        {
            //flyState = new BItemStack(Material.THIN_GLASS, 1).setDisplaName(ChatColor.GREEN + "Ativado");
            item = new ItemStack(Material.THIN_GLASS, 1, DyeColor.GREEN.getWoolData());
        }
        else
        {
            //flyState = new BItemStack(Material.THIN_GLASS, 1).setDisplaName(ChatColor.RED + "Desativado");
            item = new ItemStack(Material.THIN_GLASS, 1, DyeColor.RED.getWoolData());
        }

        bInventory.setItem(10, fly);
        bInventory.setItem(19, item);

        p.openInventory(bInventory.getInventory());
    }
}
