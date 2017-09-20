/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.object;

import mp.rage.plugin.java.api.vector.Vector3;

public class ObjectNative {
    // Entity Native
    public static native int getType(int objectId);

    public static native void destroy(int objectId);

    public static native int getDimension(int objectId);
    public static native void setDimension(int objectId, int dimensionId);

    public static native Vector3 getPosition(int objectId);
    public static native void setPosition(int objectId, float x, float y, float z);

    public static native Vector3 getRotation(int objectId);
    public static native void setRotation(int objectId, float x, float y, float z);

    public static native int getModel(int objectId);
    public static native void setModel(int objectId, int modelId);

    public static native Vector3 getVelocity(int objectId);

    public static native int getAlpha(int objectId);
    public static native void setAlpha(int playerobjectIdId, int alpha);
}
