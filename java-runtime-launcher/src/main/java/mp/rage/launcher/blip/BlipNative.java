/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.blip;

import mp.rage.api.vector.Vector3;

public class BlipNative {

    private BlipNative() {}

    // Entity Native
    public static native int getType(int blipId);

    public static native void destroy(int blipId);

    public static native int getDimension(int blipId);
    public static native void setDimension(int blipId, int dimensionId);

    public static native Vector3 getPosition(int blipId);
    public static native void setPosition(int blipId, float x, float y, float z);

    public static native Vector3 getRotation(int blipId);
    public static native void setRotation(int blipId, float x, float y, float z);

    public static native int getModel(int blipId);
    public static native void setModel(int blipId, int modelId);

    public static native Vector3 getVelocity(int blipId);

    public static native int getAlpha(int blipId);
    public static native void setAlpha(int blipId, int alpha);

    // Blip Native
    public static native float getRadius(int blipId);

    public static native int getMode(int blipId);

//    public static native void RouteFor(int blipIdstd::vector<rage::IPlayer*>& players, int colour, float scale);
//    public static native void UnrouteFor(int blipIdstd::vector<rage::IPlayer*>& players);

    public static native int getColour(int blipId);
    public static native void setColour(int blipId, int colour);

    public static native float getScale(int blipId);
    public static native void setScale(int blipId, float scale);

    public static native String getName(int blipId);
    public static native void setName(int blipId, String name);
}
