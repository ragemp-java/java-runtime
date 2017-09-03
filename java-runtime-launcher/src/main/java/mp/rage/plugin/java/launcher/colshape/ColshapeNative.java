package mp.rage.plugin.java.launcher.colshape;

import mp.rage.plugin.java.api.vector.Vector3;
import mp.rage.plugin.java.launcher.EntityNative;

/**
 * @author Noxaro
 */
public class ColshapeNative extends EntityNative {
    public static native boolean IsPointWithin(int colshapeId, Vector3 position);
    public static native int GetShapeType(int colshapeId);
}
