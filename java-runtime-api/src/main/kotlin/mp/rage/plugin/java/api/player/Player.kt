/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.api.player

import mp.rage.plugin.java.api.entity.Entity
import mp.rage.plugin.java.api.vector.Vector3
import mp.rage.plugin.java.api.vehicle.Vehicle

interface Player : Entity {
    fun kick(reason: String)

    fun ban(reason: String)

    fun outputChatBox(message: String)

    fun notify(message: String)

    fun spawn(position: Vector3, heading: Float)

    fun playAnimation(dist: String, name: String, speed: Float, flags: Int)
    fun playScenario(scenario: String)
    fun stopAnimation()

    fun getClothes(componentNumber: Int): PlayerClothes
    fun setClothes(componentNumber: Int, playerCloth: PlayerClothes)

    fun getProp(propId: Int): PlayerProperty
    fun setProp(propId: Int, propData: PlayerProperty)

    fun eval(code: String)

    fun getName(): String
    fun setName(name: String)

    fun isAiming(): Boolean

    fun getHeading(): Float
    fun setHeading(heading: Float)

    fun getMoveSpeed(): Float

    fun getHealth(): Float
    fun setHealth(health: Float)

    fun getArmor(): Float
    fun setArmor(armor: Float)

    fun getAimingAt(): Vector3

    fun getPing(): Int

    fun getKickReason(): String

    fun getIp(): String

    fun isJumping(): Boolean

    fun isInCover(): Boolean

    fun isEnteringVehicle(): Boolean

    fun isLeavingVehicle(): Boolean

    fun isClimbing(): Boolean

    fun getActionString(): String

    fun getVehicle(): Vehicle;
    fun putIntoVehicle(vehicle: Vehicle, seatId: Int);
    fun removeFromVehicle()

    fun getSeat(): Int

    fun getEyeColor(): Int
    fun setEyeColor(color: Int)

    fun getHairColor(): Int
    fun getHairHighlightColor(): Int
    fun setHairColor(color: Int, highlightColour: Int)

    fun getFaceFeature(id: Int): Float
    fun setFaceFeature(id: Int, scale: Float)

    fun getHeadBlend(): PlayerHeadBlend
    fun setHeadBlend(shapeFirstID: Int, shapeSecondID: Int, shapeThirdID: Int, skinFirstID: Int, skinSecondID: Int, skinThirdID: Int, shapeMix: Float, skinMix: Float, thirdMix: Float)
    fun updateHeadBlend(shapeMix: Float, skinMix: Float, thirdMix: Float)

    fun getWeapon(): Int
    fun giveWeapon(hash: Int, ammo: Int)
//    public static native void giveWeapons()

    fun getSerial(): String
}