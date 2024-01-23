package myron.explodingrockets.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class GiveFirework implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){
            Player p = (Player) commandSender;

            int quantity = 1;

            if (strings.length > 0){
                quantity = Integer.parseInt(strings[0]);

                ItemStack firework = new ItemStack(Material.FIREWORK_ROCKET,quantity);
                ItemMeta firework_meta = firework.getItemMeta();
                firework_meta.setDisplayName(ChatColor.GOLD + "Explosive Firework");
                firework.setItemMeta(firework_meta);

                p.getInventory().addItem(new ItemStack(firework));

                }
            else if (strings.length <= 0){
                ItemStack firework = new ItemStack(Material.FIREWORK_ROCKET,quantity);
                ItemMeta firework_meta = firework.getItemMeta();
                firework_meta.setDisplayName(ChatColor.GOLD + "Explosive Firework");
                firework.setItemMeta(firework_meta);

                p.getInventory().addItem(new ItemStack(firework));

            } else {
                System.out.println("this can only be used by players");
            }
        }
        return false;
    }
}
