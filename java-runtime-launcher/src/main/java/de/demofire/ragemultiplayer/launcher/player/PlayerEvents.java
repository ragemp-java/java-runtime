package de.demofire.ragemultiplayer.launcher.player;

/**
 * @author Noxaro
 */
@SuppressWarnings("unused")
public class PlayerEvents {

    static void onPlayerCommand(int playerId, String command ) {
        System.out.println("incoming event: " + playerId);
        new PlayerNative().outputChatBox(0, "ok");
    }

}
