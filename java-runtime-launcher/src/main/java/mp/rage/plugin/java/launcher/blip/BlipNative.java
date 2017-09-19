/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.blip;

import mp.rage.plugin.java.api.vector.Vector3;

public class BlipNative {
    // Entity Native
    public static native int getType(int id);

    public static native void destroy(int id);

    public static native int getDimension(int id);
    public static native void setDimension(int id, int dimensionId);

    public static native Vector3 getRotation(int playerId);
    public static native void setRotation(int playerId, float x, float y, float z);

    public static native int getModel(int playerId);
    public static native void setModel(int playerId, int modelId);

    public static native Vector3 getVelocity(int playerId);

    public static native int getAlpha(int playerId);
    public static native void setAlpha(int playerId, int alpha);

    // Blip Native
    public static native float GetRadius(int blipId);

    public static native int GetMode(int blipId);

//    public static native void RouteFor(int blipIdstd::vector<rage::IPlayer*>& players, int colour, float scale);
//    public static native void UnrouteFor(int blipIdstd::vector<rage::IPlayer*>& players);

    public static native int GetColour(int blipId);
    public static native void SetColour(int blipId, int colour);

    public static native int GetAlpha(int blipId);
    public static native void SetAlpha(int blipId, int alpha);

    public static native float GetScale(int blipId);
    public static native void SetScale(int blipId, float scale);

    public static native String GetName(int blipId);
    public static native void SetName(int blipId, String name);
}
