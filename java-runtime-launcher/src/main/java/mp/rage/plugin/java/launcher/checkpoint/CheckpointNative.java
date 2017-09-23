/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.checkpoint;

import mp.rage.plugin.java.api.color.RGBColor;
import mp.rage.plugin.java.api.vector.Vector3;

public class CheckpointNative {
    // Entity Native
    public static native int getType(int checkpointId);

    public static native void destroy(int checkpointId);

    public static native int getDimension(int checkpointId);
    public static native void setDimension(int checkpointId, int dimensionId);

    public static native Vector3 getPosition(int checkpointId);
    public static native void setPosition(int checkpointId, float x, float y, float z);

    public static native Vector3 getRotation(int checkpointId);
    public static native void setRotation(int checkpointId, float x, float y, float z);

    public static native int getModel(int checkpointId);
    public static native void setModel(int checkpointId, int modelId);

    public static native Vector3 getVelocity(int checkpointId);

    public static native int getAlpha(int checkpointId);
    public static native void setAlpha(int checkpointId, int alpha);

    // Checkpoint Native
    public static native int create(int type, float x, float y, float z, float nextX, float nextY, float nextZ, float radius, int red, int green, int blue, int alpha, boolean visible, int dimension);

    public static native RGBColor GetColour(int checkpointId);
    public static native void SetColour(int checkpointId, int r, int g, int b, int a);

    public static native Vector3 GetDirection(int checkpointId);
    public static native void SetDirection(int checkpointId, Vector3 direction);

    public static native float GetRadius(int checkpointId);
    public static native void SetRadius(int checkpointId, float radius);

    public static native boolean IsVisible(int checkpointId);
    public static native void SetVisible(int checkpointId, boolean toggle);

//    public static native void ShowFor(int checkpointId, std::vector<rage::IPlayer*>& players);
//    public static native void HideFor(int checkpointId, std::vector<rage::IPlayer*>& players);
}
