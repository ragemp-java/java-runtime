package de.demofire.ragemultiplayer.launcher.vehicle;

import de.demofire.ragemultiplayer.launcher.EntityNative;
import de.demofire.ragemultiplayer.launcher.RGBColor;
import de.demofire.ragemultiplayer.launcher.Vector3;

import java.util.List;

/**
 * @author Noxaro
 */
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
