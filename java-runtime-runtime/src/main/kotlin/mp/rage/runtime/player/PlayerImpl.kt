/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.player

import mp.rage.api.entity.EntityType
import mp.rage.api.player.Player
import mp.rage.api.player.PlayerClothes
import mp.rage.api.player.PlayerHeadBlend
import mp.rage.api.player.PlayerProperty
import mp.rage.api.vector.Vector3
import mp.rage.api.vehicle.Vehicle

class PlayerImpl(val playerId: Int) : Player {

    override fun kick(reason: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ban(reason: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun outputChatBox(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun notify(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spawn(position: Vector3, heading: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playAnimation(dist: String, name: String, speed: Float, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playScenario(scenario: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stopAnimation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getClothes(componentNumber: Int): PlayerClothes {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setClothes(componentNumber: Int, playerCloth: PlayerClothes) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProp(propId: Int): PlayerProperty {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProp(propId: Int, propData: PlayerProperty) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun eval(code: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setName(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isAiming(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHeading(): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setHeading(heading: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMoveSpeed(): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHealth(): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setHealth(health: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArmor(): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setArmor(armor: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAimingAt(): Vector3 {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPing(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKickReason(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getIp(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isJumping(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isInCover(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEnteringVehicle(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isLeavingVehicle(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isClimbing(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getActionString(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getVehicle(): Vehicle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putIntoVehicle(vehicle: Vehicle, seatId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeFromVehicle() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSeat(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEyeColor(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setEyeColor(color: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHairColor(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHairHighlightColor(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setHairColor(color: Int, highlightColour: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFaceFeature(id: Int): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFaceFeature(id: Int, scale: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHeadBlend(): PlayerHeadBlend {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setHeadBlend(shapeFirstID: Int, shapeSecondID: Int, shapeThirdID: Int, skinFirstID: Int, skinSecondID: Int, skinThirdID: Int, shapeMix: Float, skinMix: Float, thirdMix: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateHeadBlend(shapeMix: Float, skinMix: Float, thirdMix: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWeapon(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun giveWeapon(hash: Int, ammo: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSerial(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(): EntityType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDimension(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDimension(dimensionId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPosition(): Vector3 {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPosition(vector3: Vector3) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRotation(): Vector3 {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setRotation(vector3: Vector3) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getModel(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setModel(modelId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getVelocity(): Vector3 {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAlpha(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAlpha(alpha: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}