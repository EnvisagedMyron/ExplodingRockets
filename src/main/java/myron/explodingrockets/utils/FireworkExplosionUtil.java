package myron.explodingrockets.utils;

import org.bukkit.Location;
import org.bukkit.World;

public class FireworkExplosionUtil {
    public static void triggerExplosion(Location location, float power, boolean setFire){
        World world = location.getWorld();
        world.createExplosion(location.getX(),location.getY(),location.getZ(),power,setFire);

    }
}
