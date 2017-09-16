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
import mp.rage.plugin.java.launcher.EntityNative;

public class MarkerNative extends EntityNative {
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
