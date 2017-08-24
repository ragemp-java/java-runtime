package de.demofire.ragemultiplayer.launcher.colshape;

import de.demofire.ragemultiplayer.launcher.EntityNative;
import de.demofire.ragemultiplayer.launcher.Vector3;

/**
 * @author Noxaro
 */
public class ColshapeNative extends EntityNative {
    public static native boolean IsPointWithin(int colshapeId, Vector3 position);
    public static native int GetShapeType(int colshapeId);
}
