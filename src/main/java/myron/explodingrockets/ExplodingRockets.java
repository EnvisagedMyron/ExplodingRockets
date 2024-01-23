package myron.explodingrockets;

import myron.explodingrockets.commands.GiveFirework;
import myron.explodingrockets.listeners.FireworkExplode;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExplodingRockets extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Exploding Rockets has been enabled.");
        getCommand("rocket").setExecutor(new GiveFirework());
        getServer().getPluginManager().registerEvents(new FireworkExplode(),this);





    }

    @Override
    public void onDisable() {
        System.out.println("Exploding Rockets has been disabled.");
    }
}
