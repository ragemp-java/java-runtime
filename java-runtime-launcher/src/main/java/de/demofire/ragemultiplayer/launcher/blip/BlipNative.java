package de.demofire.ragemultiplayer.launcher.blip;

import de.demofire.ragemultiplayer.launcher.EntityNative;

/**
 * @author Noxaro
 */
public class BlipNative extends EntityNative {
    public static native float GetRadius(int blipId);

    public static native int GetMode(int blipId);

//    public static native void RouteFor(int blipIdstd::vector<rage::IPlayer*>& players, int colour, float scale);
//    public static native void UnrouteFor(int blipIdstd::vector<rage::IPlayer*>& players);

    public static native int GetColour(int blipId);
    public static native void SetColour(int blipId, int colour);

    public static native int GetAlpha(int blipId);
    public static native void SetAlpha(int blipId, int alpha);

    public static native float GetScale(int blipId);
    public static native void SetScale(int blipId, float scale);

    public static native String GetName(int blipId);
    public static native void SetName(int blipId, String name);
}
