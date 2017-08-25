package de.demofire.ragemultiplayer.launcher.marker;

import de.demofire.ragemultiplayer.api.color.RGBColor;
import de.demofire.ragemultiplayer.api.vector.Vector3;
import de.demofire.ragemultiplayer.launcher.EntityNative;

/**
 * @author Noxaro
 */
public class MarkerNative extends EntityNative {
    public static native RGBColor GetColour(int markerId);
    public static native void SetColour(int markerId, int r, int g, int b, int a);

    public static native Vector3 GetDirection(int markerId);
    public static native void SetDirection(int markerId, Vector3 direction);

    public static native float GetScale(int markerId);
    public static native void SetScale(int markerId, float scale);

    public static native boolean IsVisible(int markerId);
    public static native void SetVisible(int markerId, boolean toggle);

//    public static native void ShowFor(int markerId std::vector<rage::IPlayer*>& players);
//    public static native void HideFor(int markerId std::vector<rage::IPlayer*>& players);
}
