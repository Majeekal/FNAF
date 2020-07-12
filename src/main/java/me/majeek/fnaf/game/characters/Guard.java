package me.majeek.fnaf.game.characters;

import me.majeek.fnaf.Fnaf;
import me.majeek.fnaf.files.FnafConfig;
import me.majeek.fnaf.game.item.items.CameraItem;
import me.majeek.fnaf.game.item.items.RightDoorItem;
import me.majeek.fnaf.game.item.items.LeftDoorItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Guard {
    private Player player;

    public Guard(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void toSpawn(){
        Fnaf.getInstance().getCameraManager().getCamera("OFFICE").useCamera(player);
    }

    public void getItems(){
        ItemStack leftDoor = new LeftDoorItem().getItem();
        ItemStack rightDoor = new RightDoorItem().getItem();
        ItemStack camera = new CameraItem().getItem();

        player.getInventory().setItem(0, leftDoor);
        player.getInventory().setItem(8, rightDoor);
        player.getInventory().setItem(4, camera);
    }
}
