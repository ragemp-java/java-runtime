package de.demofire.ragemultiplayer.launcher.player;

import de.demofire.ragemultiplayer.api.player.PlayerClothes;
import de.demofire.ragemultiplayer.api.player.PlayerHeadBlend;
import de.demofire.ragemultiplayer.api.player.PlayerProperty;
import de.demofire.ragemultiplayer.api.vector.Vector3;
import de.demofire.ragemultiplayer.launcher.EntityNative;

/**
 * @author Noxaro
 */
public class PlayerNative extends EntityNative {

    public static native void kick(int playerId, String reason);

    public static native void ban(int playerId, String reason);

    public static native void outputChatBox(int playerId, String message);

    public static native void notify(int playerId, String message);

    public static native void spawn(int playerId, Vector3 position, float heading);

    public static native void playAnimation(int playerId, String dist, String name, float speed, int flags);
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

    public static native String getKickReason(int playerId);

    public static native String getIp(int playerId);

    public static native boolean isJumping(int playerId);

    public static native boolean isInCover(int playerId);

    public static native boolean isEnteringVehicle(int playerId);

    public static native boolean isLeavingVehicle(int playerId);

    public static native boolean isClimbing(int playerId);

    public static native String getActionString(int playerId);

//    public static native getVehicle(int playerId);
//    public static native void putIntoVehicle()
    public static native void removeFromVehicle(int playerId);
    public static native int getSeat(int playerId);

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

    public static native int getWeapon(int playerId);
    public static native void giveWeapon(int playerId, int hash, int ammo);
//    public static native void giveWeapons()

    public static native String getSerial(int playerId);
}
