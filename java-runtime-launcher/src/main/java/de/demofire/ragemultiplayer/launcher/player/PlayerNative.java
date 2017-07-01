package de.demofire.ragemultiplayer.launcher.player;

import de.demofire.ragemultiplayer.launcher.Entity;

/**
 * @author Noxaro
 */
public class PlayerNative extends Entity {
    public native void kick(int id, String reason);
    public native void ban(int id, String reason);
    public native void outputChatBox(int id, String message);
    public native void notify(int id, String message);
}
