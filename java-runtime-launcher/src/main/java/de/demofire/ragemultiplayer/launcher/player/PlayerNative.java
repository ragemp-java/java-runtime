package de.demofire.ragemultiplayer.launcher.player;

import de.demofire.ragemultiplayer.launcher.Entity;

/**
 * @author Noxaro
 */
public class PlayerNative extends Entity {
    public native void kick(String reason);
    public native void ban(String reason);
    public native void outputChatBox(String message);
    public native void notify(String message);
}
