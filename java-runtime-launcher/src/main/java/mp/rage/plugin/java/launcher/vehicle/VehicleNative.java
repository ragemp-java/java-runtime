/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.vehicle;

import mp.rage.plugin.java.api.color.RGBColor;
import mp.rage.plugin.java.api.vector.Vector3;
import mp.rage.plugin.java.api.vehicle.VehiclePaintInfo;
import mp.rage.plugin.java.launcher.EntityNative;

import java.util.List;

public class VehicleNative extends EntityNative {
    public static native boolean IsSirenActive(int vehicleId);
    public static native boolean IsHornActive(int vehicleId);
    public static native boolean AreHighbeamsActive(int vehicleId);
    public static native boolean AreLightsActive(int vehicleId);
    public static native boolean IsEngineActive(int vehicleId);
    public static native boolean IsRocketBoostActive(int vehicleId);
    public static native boolean IsBrakeActive(int vehicleId);
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
    public static native void spawn(int vehicleId, Vector3 position, float heading);

    public static native int getMod(int vehicleId, int id);
    public static native void setMod(int vehicleId, int id, int mod);

    public static native boolean areNeonsEnabled(int vehicleId);
    public static native void enableNeons(int vehicleId, boolean toggle);

    public static native void setNeonsColour(int vehicleId, int r, int g, int b);
    public static native RGBColor GetNeonsColour(int vehicleId);

    public static native void Repair(int vehicleId);

    public static native RGBColor GetColourRGB(int vehicleId, int id);
    public static native int GetColour(int vehicleId, int id);
    public static native int GetPaint(int vehicleId, int id);

    public static native void SetColourRGB(int vehicleId, RGBColor primary, RGBColor secondary);
    public static native void SetColour(int vehicleId, int primary, int secondary);
    public static native void SetPaint(int vehicleId, VehiclePaintInfo primary, VehiclePaintInfo secondary);

    public static native int GetMaterialType(int vehicleId);

    public static native String GetNumberPlate(int vehicleId);
    public static native void SetNumberPlate(int vehicleId, String numberPlate);
}
