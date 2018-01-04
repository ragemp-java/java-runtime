/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.player;


import mp.rage.api.player.PlayerClothes;
import mp.rage.api.player.PlayerHeadBlend;
import mp.rage.api.player.PlayerProperty;
import mp.rage.api.player.event.PlayerHeadOverlay;
import mp.rage.api.vector.Vector3;

import java.util.List;
import java.util.Map;

public class PlayerNative {

    private PlayerNative() {}

    // Entity Native
    public static native int getType(int id);

    public static native void destroy(int id);

    public static native int getDimension(int id);
    public static native void setDimension(int id, int dimensionId);

    public static native Vector3 getPosition(int playerId);
    public static native void setPosition(int playerId, float x, float y, float z);

    public static native Vector3 getRotation(int playerId);
    public static native void setRotation(int playerId, float x, float y, float z);

    public static native int getModel(int playerId);
    public static native void setModel(int playerId, int modelId);

    public static native Vector3 getVelocity(int playerId);

    public static native int getAlpha(int playerId);
    public static native void setAlpha(int playerId, int alpha);

    // Player Native
    public static native void kick(int playerId, String reason);

    public static native void ban(int playerId, String reason);

    public static native void outputChatBox(int playerId, String message);

    public static native void notify(int playerId, String message);

    public static native void spawn(int playerId, float x, float y, float z, float heading);

    public static native void playAnimation(int playerId, String dict, String name, float speed, int flags);
    public static native void playScenario(int playerId, String scenario);
    public static native void stopAnimation(int playerId);

    public static native PlayerClothes getClothes(int playerId, int componentNumber);
    public static native void setClothes(int playerId, int componentNumber, PlayerClothes playerCloth);

    public static native PlayerProperty getProp(int playerId, int propId);
    public static native void setProp(int playerId, int propId, PlayerProperty propData);

    public static native void eval(int playerId, String code);

    public static native String getName(int playerId);
    public static native void setName(int playerId, String name);

    public static native boolean isAiming(int playerId);

    public static native float getHeading(int playerId);
    public static native void setHeading(int playerId, float heading);

    public static native float getMoveSpeed(int playerId);

    public static native float getHealth(int playerId);
    public static native void setHealth(int playerId, float health);

    public static native float getArmor(int playerId);
    public static native void setArmor(int playerId, float armor);

    public static native Vector3 getAimingAt(int playerId);

    public static native int getPing(int playerId);
    public static native float getPacketLoss(int playerId);

    public static native String getKickReason(int playerId);

    public static native String getIp(int playerId);

    public static native boolean isJumping(int playerId);
    public static native boolean isInCover(int playerId);
    public static native boolean isEnteringVehicle(int playerId);
    public static native boolean isLeavingVehicle(int playerId);
    public static native boolean isClimbing(int playerId);
    public static native boolean isOnLadder(int playerId);
    public static native boolean isReloading(int playerId);
    public static native boolean isInMelee(int playerId);
    public static native String getActionString(int playerId);

    // Player Vehicle
    public static native int getVehicle(int playerId);
    public static native void putIntoVehicle(int playerId, int vehicleId , int seatId);
    public static native void removeFromVehicle(int playerId);
    public static native int getSeat(int playerId);

    // Player Customization
    public static native int getEyeColor(int playerId);
    public static native void setEyeColor(int playerId, int color);

    public static native int getHairColor(int playerId);
    public static native int getHairHighlightColor(int playerId);
    public static native void setHairColor(int playerId, int color, int highlightColour);

    public static native float getFaceFeature(int playerId, int id);
    public static native void setFaceFeature(int playerId, int id, float scale);

    public static native PlayerHeadBlend getHeadBlend(int playerId);

    public static native void setHeadBlend(int playerId, int shapeFirstID, int shapeSecondID, int shapeThirdID, int skinFirstID, int skinSecondID, int skinThirdID, float shapeMix, float skinMix, float thirdMix);
    public static native void updateHeadBlend(int playerId, float shapeMix, float skinMix, float thirdMix);

    public static native PlayerHeadOverlay getHeadOverlay(int playerId, int overlayId);
    public static native void setHeadOverlay(int playerId, int overlayId, int index, float opacity);

    // Player Weapons
    public static native int getCurrentWeapon(int playerId);
    public static native void setCurrentWeapon(int playerId, int weaponHash);

    public static native int getCurrentWeaponAmmo(int playerId);
    public static native void setCurrentWeaponAmmo(int playerId, int ammo);

    public static native int getWeaponAmmo(int playerId, int weaponHash);
    public static native void setWeaponAmmo(int playerId, int weaponHash);

    public static native Map<Integer, Integer> getWeapons(int playerId);

    public static native int getWeapon(int playerId);
    public static native void giveWeapon(int playerId, int hash, int ammo);
    public static native void giveWeapons(int playerId, int[] weaponHashes, int[] ammo);

    public static native void removeWeapon(int playerId, int hash, int ammo);
    public static native void removeWeapons(int playerId, List<Integer> hashes);
    public static native void removeAllWeapons(int playerId);

    public static native boolean isStreamed(int playerId, int secondPlayerId);
    public static native List<Integer> getStreamed(int playerId);

    public static native String getSerial(int playerId);
    public static native String getSocialClubName(int playerId);
    public static native void removeObject(int playerId, int model, float x, float y, float z, float radius);

    public static native void call(int playerId, String eventName, String[] args);
    public static native void invoke(int playerId, long hash, String[] args);

    // Entity Pool
    public static native int length();
    public static native int count();

    public static native List<Integer> getInRange(float x, float y, float z, float range, int dimensionId);
    public static native List<Integer> getInDimension(int dimensionId);

    // Player Pool
    public static native void broadcast(String message);
    public static native void broadcastInRange(String message, float x, float y, float z, float range, int dimensionId);
    public static native void broadcastInDimension(String message, int dimensionId);

    public static native void call(String eventName, String[] args);
    public static native void callInRange(float x, float y, float z, float range, int dimensionId, String eventName, String[] args);
    public static native void callInDimension(int dimensionId, String eventName, String[] args);

    public static native void invoke(long hash, String[] args);
    public static native void invokeInRange(float x, float y, float z, float range, int dimensionId, long hash, String[] args);
    public static native void invokeInDimension(int dimensionId, long hash, String[] args);
}
