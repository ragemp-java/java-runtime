package de.demofire.ragemultiplayer.launcher.player;

/**
 * @author Noxaro
 */
public class PlayerEvents {

    static void OnPlayerCommand(PlayerNative player, String command ) {
        System.out.println(player.getId() + " " + command);
    }

}
