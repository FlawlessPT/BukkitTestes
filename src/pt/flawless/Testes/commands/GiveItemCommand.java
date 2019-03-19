package pt.flawless.Testes.commands;

import mcmacau.barberianscore.ItemStack.BItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class GiveItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player player = (Player) sender;

        if (args.length == 0) {

            player.sendMessage(ChatColor.RED + "Sintaxe: /gi [item]");

            return true;
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("bp")) {

            BItemStack bItemStack = new BItemStack(Material.WOOD_PICKAXE, 1)
                    .setDisplaName(ChatColor.YELLOW + "Broken Pickaxe")
                    .addLoreLine(ChatColor.DARK_AQUA + "- Picareta usada para funções de teste!");
            bItemStack.getItemMeta().addEnchant(Enchantment.DURABILITY, 10, false);
            bItemStack.getItemMeta().spigot().setUnbreakable(true);
            player.getInventory().addItem(bItemStack.create());
            player.updateInventory();
            player.sendMessage(ChatColor.GREEN + "Item recebido com sucesso!");

            return true;
        }

        return false;
    }
}
