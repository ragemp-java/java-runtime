/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.game.player

import mp.rage.api.entity.EntityType
import mp.rage.api.player.Player
import mp.rage.api.player.PlayerClothes
import mp.rage.api.player.PlayerHeadBlend
import mp.rage.api.player.PlayerProperty
import mp.rage.api.vector.Vector3
import mp.rage.api.vehicle.Vehicle
import mp.rage.launcher.player.PlayerNative

class PlayerImpl(private val playerId: Int) : Player {
    override fun getId(): Int {
        return playerId;
    }

    override fun kick(reason: String) {
        PlayerNative.kick(playerId, reason)
    }

    override fun ban(reason: String) {
        PlayerNative.ban(playerId, reason)
    }

    override fun outputChatBox(message: String) {
        PlayerNative.outputChatBox(playerId, message)
    }

    override fun notify(message: String) {
        PlayerNative.notify(playerId, message)
    }

    override fun spawn(position: Vector3, heading: Float) {
        PlayerNative.spawn(playerId, position.x, position.y, position.z, heading)
    }

    override fun playAnimation(dist: String, name: String, speed: Float, flags: Int) {
        PlayerNative.playAnimation(playerId, dist, name, speed, flags)
    }

    override fun playScenario(scenario: String) {
        PlayerNative.playScenario(playerId, scenario)
    }

    override fun stopAnimation() {
        PlayerNative.stopAnimation(playerId)
    }

    override fun getClothes(componentNumber: Int): PlayerClothes {
        return PlayerNative.getClothes(playerId, componentNumber)
    }

    override fun setClothes(componentNumber: Int, playerCloth: PlayerClothes) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        PlayerNative.setClothes(playerId, componentNumber, playerCloth)
    }

    override fun getProp(propId: Int): PlayerProperty {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProp(propId: Int, propData: PlayerProperty) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun eval(code: String) {
        PlayerNative.eval(playerId, code)
    }

    override fun getName(): String {
        return PlayerNative.getName(playerId)
    }

    override fun setName(name: String) {
        PlayerNative.setName(playerId, name)
    }

    override fun isAiming(): Boolean {
        return PlayerNative.isAiming(playerId)
    }

    override fun getHeading(): Float {
        return PlayerNative.getHeading(playerId)
    }

    override fun setHeading(heading: Float) {
        PlayerNative.setHeading(playerId, heading)
    }

    override fun getMoveSpeed(): Float {
        return PlayerNative.getMoveSpeed(playerId)
    }

    override fun getHealth(): Float {
        return PlayerNative.getHealth(playerId)
    }

    override fun setHealth(health: Float) {
        PlayerNative.setHealth(playerId, health)
    }

    override fun getArmor(): Float {
        return PlayerNative.getArmor(playerId)
    }

    override fun setArmor(armor: Float) {
        PlayerNative.setArmor(playerId, armor)
    }

    override fun getAimingAt(): Vector3 {
        return PlayerNative.getAimingAt(playerId)
    }

    override fun getPing(): Int {
        return PlayerNative.getPing(playerId)
    }

    override fun getKickReason(): String {
        return PlayerNative.getKickReason(playerId)
    }

    override fun getIp(): String {
        return PlayerNative.getIp(playerId)
    }

    override fun isJumping(): Boolean {
        return PlayerNative.isJumping(playerId)
    }

    override fun isInCover(): Boolean {
        return PlayerNative.isInCover(playerId)
    }

    override fun isEnteringVehicle(): Boolean {
        return PlayerNative.isEnteringVehicle(playerId)
    }

    override fun isLeavingVehicle(): Boolean {
        return PlayerNative.isLeavingVehicle(playerId)
    }

    override fun isClimbing(): Boolean {
        return PlayerNative.isClimbing(playerId)
    }

    override fun getActionString(): String {
        return PlayerNative.getActionString(playerId)
    }

    override fun getVehicle(): Vehicle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        return PlayerNative.getVehicle(playerId)
    }

    override fun putIntoVehicle(vehicle: Vehicle, seatId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        PlayerNative.putIntoVehicle(playerId, vehicle.get)
    }

    override fun removeFromVehicle() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSeat(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEyeColor(): Int {
        return PlayerNative.getEyeColor(playerId)
    }

    override fun setEyeColor(color: Int) {
        return PlayerNative.setEyeColor(playerId, color)
    }

    override fun getHairColor(): Int {
        return PlayerNative.getHairColor(playerId)
    }

    override fun getHairHighlightColor(): Int {
        return PlayerNative.getHairHighlightColor(playerId)
    }

    override fun setHairColor(color: Int, highlightColour: Int) {
        PlayerNative.setHairColor(playerId, color, highlightColour)
    }

    override fun getFaceFeature(id: Int): Float {
        return PlayerNative.getFaceFeature(playerId, id)
    }

    override fun setFaceFeature(id: Int, scale: Float) {
        PlayerNative.setFaceFeature(playerId, id, scale)
    }

    override fun getHeadBlend(): PlayerHeadBlend {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        return PlayerNative.getHeadBlend(playerId)
    }

    override fun setHeadBlend(shapeFirstID: Int, shapeSecondID: Int, shapeThirdID: Int, skinFirstID: Int, skinSecondID: Int, skinThirdID: Int, shapeMix: Float, skinMix: Float, thirdMix: Float) {
        PlayerNative.setHeadBlend(playerId, shapeFirstID, shapeSecondID, shapeThirdID, skinFirstID, skinSecondID, skinThirdID, shapeMix, skinMix, thirdMix)
    }

    override fun updateHeadBlend(shapeMix: Float, skinMix: Float, thirdMix: Float) {
        PlayerNative.updateHeadBlend(playerId, shapeMix, skinMix, thirdMix)
    }

    override fun getWeapon(): Int {
        return PlayerNative.getWeapon(playerId)
    }

    override fun giveWeapon(hash: Int, ammo: Int) {
        return PlayerNative.giveWeapon(playerId, hash, ammo)
    }

    override fun getSerial(): String {
        return PlayerNative.getSerial(playerId)
    }

    override fun getType(): EntityType {
        return EntityType.values()[PlayerNative.getType(playerId)]
    }

    override fun destroy() {
        return PlayerNative.destroy(playerId)
    }

    override fun getDimension(): Int {
        return PlayerNative.getDimension(playerId)
    }

    override fun setDimension(dimensionId: Int) {
        PlayerNative.setDimension(playerId, dimensionId)
    }

    override fun getPosition(): Vector3 {
        return PlayerNative.getPosition(playerId)
    }

    override fun setPosition(vector3: Vector3) {
        PlayerNative.setPosition(playerId, vector3.x, vector3.y, vector3.z)
    }

    override fun getRotation(): Vector3 {
        return PlayerNative.getRotation(playerId)
    }

    override fun setRotation(vector3: Vector3) {
        return PlayerNative.setRotation(playerId, vector3.x, vector3.y, vector3.z)
    }

    override fun getModel(): Int {
        return PlayerNative.getModel(playerId)
    }

    override fun setModel(modelId: Int) {
        PlayerNative.setModel(playerId, modelId)
    }

    override fun getVelocity(): Vector3 {
        return PlayerNative.getVelocity(playerId);
    }

    override fun getAlpha(): Int {
        return PlayerNative.getAlpha(playerId)
    }

    override fun setAlpha(alpha: Int) {
        return PlayerNative.setAlpha(playerId, alpha)
    }
}