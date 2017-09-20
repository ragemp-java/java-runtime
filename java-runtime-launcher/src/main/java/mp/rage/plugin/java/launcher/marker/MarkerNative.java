/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.marker;

import mp.rage.plugin.java.api.color.RGBColor;
import mp.rage.plugin.java.api.vector.Vector3;

public class MarkerNative {
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
