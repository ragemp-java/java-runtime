package de.demofire.ragemultiplayer.launcher.checkpoint;

import de.demofire.ragemultiplayer.api.color.RGBColor;
import de.demofire.ragemultiplayer.api.vector.Vector3;
import de.demofire.ragemultiplayer.launcher.EntityNative;

/**
 * @author Noxaro
 */
public class CheckpointNative extends EntityNative {
    public static native RGBColor GetColour(int checkpointId);
    public static native void SetColour(int checkpointId, int r, int g, int b, int a);

    public static native Vector3 GetDirection(int checkpointId);
    public static native void SetDirection(int checkpointId, Vector3 direction);

    public static native float GetRadius(int checkpointId);
    public static native void SetRadius(int checkpointId, float radius);

    public static native boolean IsVisible(int checkpointId);
    public static native void SetVisible(int checkpointId, boolean toggle);

//    public static native void ShowFor(int checkpointId, std::vector<rage::IPlayer*>& players);
//    public static native void HideFor(int checkpointId, std::vector<rage::IPlayer*>& players);
}
