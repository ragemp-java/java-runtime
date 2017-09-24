/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.marker;

import mp.rage.api.color.RGBColor;
import mp.rage.api.vector.Vector3;

public class MarkerNative {

    private MarkerNative() {}

    // Entity Native
    public static native int getType(int markerId);

    public static native void destroy(int markerId);

    public static native int getDimension(int markerId);
    public static native void setDimension(int markerId, int dimensionId);

    public static native Vector3 getPosition(int markerId);
    public static native void setPosition(int markerId, float x, float y, float z);

    public static native Vector3 getRotation(int markerId);
    public static native void setRotation(int markerId, float x, float y, float z);

    public static native int getModel(int markerId);
    public static native void setModel(int markerId, int modelId);

    public static native Vector3 getVelocity(int markerId);

    public static native int getAlpha(int markerId);
    public static native void setAlpha(int markerId, int alpha);

    // Marker Native
    public static native RGBColor getColour(int markerId);
    public static native void setColour(int markerId, int r, int g, int b, int a);

    public static native Vector3 getDirection(int markerId);
    public static native void setDirection(int markerId, Vector3 direction);

    public static native float getScale(int markerId);
    public static native void setScale(int markerId, float scale);

    public static native boolean isVisible(int markerId);
    public static native void setVisible(int markerId, boolean toggle);

//    public static native void ShowFor(int markerId std::vector<rage::IPlayer*>& players);
//    public static native void HideFor(int markerId std::vector<rage::IPlayer*>& players);
}
