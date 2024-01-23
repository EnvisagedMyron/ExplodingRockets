package myron.explodingrockets.listeners;

import myron.explodingrockets.utils.FireworkExplosionUtil;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FireworkExplodeEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkExplode implements Listener {
    @EventHandler
    public void fireworkExplodeEvent(FireworkExplodeEvent e){
        Firework firework = e.getEntity();
        FireworkMeta fireworkMeta = firework.getFireworkMeta();
        if (fireworkMeta.getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Explosive Firework")){
            if (firework.getShooter() instanceof Player){
                Player p = (Player) firework.getShooter();
                Location explosion_location = e.getEntity().getLocation();
                FireworkExplosionUtil.triggerExplosion(explosion_location,3,false);

            }
        }
    }
}
