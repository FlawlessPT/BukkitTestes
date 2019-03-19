package pt.flawless.Testes.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PickaxeUseListener implements Listener {

    @EventHandler
    public void onPickaxeUse(PlayerInteractEvent e) {

        Player player = e.getPlayer();
        Block clickedBlock = e.getClickedBlock();

        //&&
        if (player.getItemInHand().getType().equals(Material.WOOD_PICKAXE) &&
                player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Broken Pickaxe") &&
                e.getAction().equals(Action.LEFT_CLICK_BLOCK) &&
                (player.getGameMode().equals(GameMode.SURVIVAL) || player.getGameMode().equals(GameMode.ADVENTURE))) {
            if (clickedBlock.getType().equals(Material.BEDROCK)) {
                clickedBlock.breakNaturally();
            }
        }
    }
}
