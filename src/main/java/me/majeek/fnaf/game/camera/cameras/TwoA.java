package me.majeek.fnaf.game.camera.cameras;

import me.majeek.fnaf.files.FnafConfig;
import me.majeek.fnaf.game.camera.Camera;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class TwoA extends Camera {
    public TwoA(){
        super("CAM 2A", new Location(Bukkit.getWorld(FnafConfig.get().getString("world")), 96.5, 6.5, 17.5, 21, 29), true);
    }
}
