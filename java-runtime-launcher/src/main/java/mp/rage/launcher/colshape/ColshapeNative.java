/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.colshape;

import mp.rage.api.vector.Vector3;

public class ColshapeNative {
    // Entity Native
    public static native int getType(int colshapeId);

    public static native void destroy(int colshapeId);

    public static native int getDimension(int colshapeId);
    public static native void setDimension(int colshapeId, int dimensionId);

    public static native Vector3 getPosition(int colshapeId);
    public static native void setPosition(int colshapeId, float x, float y, float z);

    public static native Vector3 getRotation(int colshapeId);
    public static native void setRotation(int colshapeId, float x, float y, float z);

    public static native int getModel(int colshapeId);
    public static native void setModel(int colshapeId, int modelId);

    public static native Vector3 getVelocity(int colshapeId);

    public static native int getAlpha(int colshapeId);
    public static native void setAlpha(int colshapeId, int alpha);

    // Colshape Native
    public static native boolean IsPointWithin(int colshapeId, Vector3 position);
    public static native int GetShapeType(int colshapeId);
}
