/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.vehicle;


import mp.rage.api.color.RGBColor;
import mp.rage.api.vector.Vector3;

import java.util.List;

public class VehicleNative {

    private VehicleNative() {}

    // Entity Native
    public static native int getType(int id);

    public static native void destroy(int id);

    public static native int getDimension(int id);
    public static native void setDimension(int id, int dimensionId);

    public static native Vector3 getPosition(int vehicleId);
    public static native void setPosition(int vehicleId, float x, float y, float z);

    public static native Vector3 getRotation(int vehicleId);
    public static native void setRotation(int vehicleId, float x, float y, float z);

    public static native int getModel(int vehicleId);
    public static native void setModel(int vehicleId, int modelId);

    public static native Vector3 getVelocity(int vehicleId);

    public static native int getAlpha(int vehicleId);
    public static native void setAlpha(int vehicleId, int alpha);

    // Vehicle Native
    public static native int create(int model, float x, float y, float z, float heading, String numberPlate, int alpha, boolean locked, boolean engine, int dimension);

    public static native boolean isSirenActive(int vehicleId);
    public static native boolean isHornActive(int vehicleId);
    public static native boolean areHighbeamsActive(int vehicleId);
    public static native boolean areLightsActive(int vehicleId);
    public static native boolean isEngineActive(int vehicleId);
    public static native boolean isRocketBoostActive(int vehicleId);
    public static native boolean isBrakeActive(int vehicleId);
    public static native float getSteerAngle(int vehicleId);
    public static native float getGasPedalState(int vehicleId);
    public static native float getEngineHealth(int vehicleId);

    public static native float getBodyHealth(int vehicleId);
    public static native int getOccupant(int vehicleId, int seat);
    public static native List<Integer> getOccupants(int vehicleId);
    public static native void setOccupant(int vehicleId, int seat, int playerId);

    public static native boolean isLocked(int vehicleId);
    public static native void lock(int vehicleId, boolean toggle);

    public static native boolean isDead(int vehicleId);

    public static native void explode(int vehicleId);
    public static native void spawn(int vehicleId, float x, float y, float z, float heading);

    public static native int getMod(int vehicleId, int id);
    public static native void setMod(int vehicleId, int id, int mod);

    public static native boolean areNeonsEnabled(int vehicleId);
    public static native void enableNeons(int vehicleId, boolean toggle);

    public static native void setNeonsColour(int vehicleId, int r, int g, int b);
    public static native RGBColor getNeonsColour(int vehicleId);

    public static native void repair(int vehicleId);

    public static native RGBColor getColourRGB(int vehicleId, int id);
    public static native int getColour(int vehicleId, int id);
    public static native int getPaint(int vehicleId, int id);

    public static native void setColourRGB(int vehicleId, int primaryRed, int primaryGreen, int primaryBlue, int secondaryRed, int secondaryGreen, int secondaryBlue);
    public static native void setColour(int vehicleId, int primary, int secondary);
    public static native void setPaint(int vehicleId, int primaryType, int primaryColor, int secondaryType, int secondaryColor);

    public static native int getMaterialType(int vehicleId);

    public static native String getNumberPlate(int vehicleId);
    public static native void setNumberPlate(int vehicleId, String numberPlate);
}
