/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.pickup;

import mp.rage.api.vector.Vector3;

public class PickupNative {

    private PickupNative() {}

    // Entity Native
    public static native int getType(int pickupId);

    public static native void destroy(int pickupId);

    public static native int getDimension(int pickupId);
    public static native void setDimension(int pickupId, int dimensionId);

    public static native Vector3 getPosition(int pickupId);
    public static native void setPosition(int pickupId, float x, float y, float z);

    public static native Vector3 getRotation(int pickupId);
    public static native void setRotation(int pickupId, float x, float y, float z);

    public static native int getModel(int pickupId);
    public static native void setModel(int pickupId, int modelId);

    public static native Vector3 getVelocity(int pickupId);

    public static native int getAlpha(int pickupId);
    public static native void setAlpha(int pickupId, int alpha);
}
