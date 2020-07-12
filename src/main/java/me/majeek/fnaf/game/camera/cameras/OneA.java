package me.majeek.fnaf.game.camera.cameras;

import me.majeek.fnaf.files.FnafConfig;
import me.majeek.fnaf.game.camera.Camera;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class OneA extends Camera {
    public OneA() {
        super("CAM 1A", new Location(Bukkit.getWorld(FnafConfig.get().getString("world")), 104.5, 5.5, 45.5, 64, 13), true);
    }
}
