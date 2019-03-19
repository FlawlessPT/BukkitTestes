package pt.flawless.Testes;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pt.flawless.Testes.commands.CommandsCommand;
import pt.flawless.Testes.commands.FlyCommand;
import pt.flawless.Testes.commands.GiveItemCommand;
import pt.flawless.Testes.listeners.CommandsInventoryClickListener;
import pt.flawless.Testes.listeners.PickaxeUseListener;

public class Testes extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getLogger().info(ChatColor.GREEN + "[Testes] Iniciado com sucesso!");

        getCommand("giveItem").setExecutor(new GiveItemCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("comandos").setExecutor(new CommandsCommand());

        Bukkit.getPluginManager().registerEvents(new PickaxeUseListener(), this);
        Bukkit.getPluginManager().registerEvents(new FlyCommand(), this);
        Bukkit.getPluginManager().registerEvents(new CommandsInventoryClickListener(), this);
    }

    @Override
    public void onDisable()
    {
        getLogger().info(ChatColor.RED + "[Testes] Encerrado com sucesso!");
    }
}
