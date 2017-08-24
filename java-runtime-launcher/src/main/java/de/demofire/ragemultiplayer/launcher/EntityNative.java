package de.demofire.ragemultiplayer.launcher;

/**
 * @author Noxaro
 */
public class EntityNative {

    public static native int getType(int id);

    public static native void destroy(int id);

    public static native int getDimension(int id);

    public static native void setDimension(int id, int dimensionId);

    public static native Vector3 getRotation(int playerId);

    public static native void setRotation(int playerId, Vector3 vector3);

    public static native int getModel(int playerId);

    public static native void setModel(int playerId, int modelId);

    public static native Vector3 getVelocity(int playerId);

    public static native int getAlpha(int playerId);

    public static native void setAlpha(int playerId, int alpha);

}
