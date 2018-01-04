/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.checkpoint;

import mp.rage.api.color.RGBAColor;
import mp.rage.api.vector.Vector3;

import java.util.List;

public class CheckpointNative {

    private CheckpointNative() {}

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
    public static native RGBAColor getColour(int checkpointId);
    public static native void setColour(int checkpointId, int r, int g, int b, int a);

    public static native Vector3 getDirection(int checkpointId);
    public static native void setDirection(int checkpointId, float x, float y, float z);

    public static native float getRadius(int checkpointId);
    public static native void setRadius(int checkpointId, float radius);

    public static native boolean isVisible(int checkpointId);
    public static native void setVisible(int checkpointId, boolean toggle);

    public static native void showFor(int checkpointId, int[] players);
    public static native void hideFor(int checkpointId, int[] players);

    // Entity Pool
    public static native int length();
    public static native int count();

    public static native List<Integer> getInRange(float x, float y, float z, float range, int dimensionId);
    public static native List<Integer> getInDimension(int dimensionId);

    // Checkpoint Pool
    public static native int create(int type, float x, float y, float z, float nextX, float nextY, float nextZ, float radius, int red, int green, int blue, int alpha, boolean visible, int dimension);
}
