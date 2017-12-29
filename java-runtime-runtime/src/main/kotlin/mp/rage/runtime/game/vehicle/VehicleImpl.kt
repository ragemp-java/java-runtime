/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.game.vehicle

import mp.rage.api.color.RGBColor
import mp.rage.api.entity.EntityType
import mp.rage.api.player.Player
import mp.rage.api.vector.Vector3
import mp.rage.api.vehicle.Vehicle
import mp.rage.launcher.vehicle.VehicleNative
import mp.rage.runtime.game.player.PlayerHandler

class VehicleImpl(private val vehicleId: Int) : Vehicle {
    override fun getId(): Int {
        return vehicleId
    }

    override fun create(model: Int, x: Float, y: Float, z: Float, heading: Float, numberPlate: String, alpha: Int, locked: Boolean, engine: Boolean, dimension: Int): Int {
        return VehicleNative.create(model, x, y, z, heading, numberPlate, alpha, locked, engine, dimension)
    }

    override fun isSirenActive(): Boolean {
        return VehicleNative.isSirenActive(vehicleId)
    }

    override fun isHornActive(): Boolean {
        return VehicleNative.isHornActive(vehicleId)
    }

    override fun areHighbeamsActive(): Boolean {
        return VehicleNative.areHighbeamsActive(vehicleId)
    }

    override fun areLightsActive(): Boolean {
        return VehicleNative.areLightsActive(vehicleId)
    }

    override fun isEngineActive(): Boolean {
        return VehicleNative.isEngineActive(vehicleId)
    }

    override fun isRocketBoostActive(): Boolean {
        return VehicleNative.isRocketBoostActive(vehicleId)
    }

    override fun isBrakeActive(): Boolean {
        return VehicleNative.isBrakeActive(vehicleId)
    }

    override fun getSteerAngle(): Float {
        return VehicleNative.getSteerAngle(vehicleId)
    }

    override fun getGasPedalState(): Float {
        return VehicleNative.getGasPedalState(vehicleId)
    }

    override fun getEngineHealth(): Float {
        return VehicleNative.getEngineHealth(vehicleId)
    }

    override fun getBodyHealth(): Float {
        return VehicleNative.getBodyHealth(vehicleId)
    }

    override fun getOccupant(seat: Int): Player {
        return PlayerHandler.getPlayer(VehicleNative.getOccupant(vehicleId, seat))
    }

    override fun getOccupants(): List<Player> {
        val players = ArrayList<Player>()
        VehicleNative.getOccupants(vehicleId).forEach { players.add(PlayerHandler.getPlayer(it)) }
        return players
    }

    override fun setOccupant(seat: Int, player: Player) {
        VehicleNative.setOccupant(vehicleId, seat, player.getId())
    }

    override fun isLocked(): Boolean {
        return VehicleNative.isLocked(vehicleId)
    }

    override fun lock(toggle: Boolean) {
        VehicleNative.lock(vehicleId, toggle)
    }

    override fun isDead(): Boolean {
        return VehicleNative.isDead(vehicleId)
    }

    override fun explode() {
        VehicleNative.explode(vehicleId)
    }

    override fun spawn(x: Float, y: Float, z: Float, heading: Float) {
        VehicleNative.spawn(vehicleId, x, y, z, heading)
    }

    override fun getMod(id: Int): Int {
        return VehicleNative.getMod(vehicleId, id)
    }

    override fun setMod(id: Int, mod: Int) {
        VehicleNative.setMod(vehicleId, id, mod)
    }

    override fun areNeonsEnabled(): Boolean {
        return VehicleNative.areNeonsEnabled(vehicleId)
    }

    override fun enableNeons(toggle: Boolean) {
        return VehicleNative.enableNeons(vehicleId, toggle)
    }

    override fun setNeonsColour(r: Int, g: Int, b: Int) {
        return VehicleNative.setNeonsColour(vehicleId, r, g, b)
    }

    override fun getNeonsColour(): RGBColor {
        return VehicleNative.getNeonsColour(vehicleId)
    }

    override fun repair() {
        VehicleNative.repair(vehicleId)
    }

    override fun getColourRGB(id: Int): RGBColor {
        return VehicleNative.getColourRGB(vehicleId, id)
    }

    override fun getColour(id: Int): Int {
        return VehicleNative.getColour(vehicleId, id)
    }

    override fun getPaint(id: Int): Int {
        return VehicleNative.getPaint(vehicleId, id)
    }

    override fun setColourRGB(primaryRed: Int, primaryGreen: Int, primaryBlue: Int, secondaryRed: Int, secondaryGreen: Int, secondaryBlue: Int) {
        VehicleNative.setColourRGB(vehicleId, primaryRed, primaryGreen, primaryBlue, secondaryRed, secondaryGreen, secondaryBlue)
    }

    override fun setColour(primary: Int, secondary: Int) {
        VehicleNative.setColour(vehicleId, primary, secondary)
    }

    override fun setPaint(primaryType: Int, primaryColor: Int, secondaryType: Int, secondaryColor: Int) {
        VehicleNative.setPaint(vehicleId, primaryType, primaryColor, secondaryType, secondaryColor)
    }

    override fun getMaterialType(): Int {
        return VehicleNative.getMaterialType(vehicleId)
    }

    override fun getNumberPlate(): String {
        return VehicleNative.getNumberPlate(vehicleId)
    }

    override fun setNumberPlate(numberPlate: String) {
        VehicleNative.setNumberPlate(vehicleId, numberPlate)
    }

    override fun getType(): EntityType {
        return EntityType.values()[VehicleNative.getType(vehicleId)]
    }

    override fun destroy() {
        VehicleNative.destroy(vehicleId)
    }

    override fun getDimension(): Int {
        return VehicleNative.getDimension(vehicleId)
    }

    override fun setDimension(dimensionId: Int) {
        return VehicleNative.setDimension(vehicleId, dimensionId)
    }

    override fun getPosition(): Vector3 {
        return VehicleNative.getPosition(vehicleId)
    }

    override fun setPosition(vector3: Vector3) {
        VehicleNative.setPosition(vehicleId, vector3.x, vector3.y, vector3.z)
    }

    override fun getRotation(): Vector3 {
        return VehicleNative.getRotation(vehicleId)
    }

    override fun setRotation(vector3: Vector3) {
        return VehicleNative.setRotation(vehicleId, vector3.x, vector3.y, vector3.z)
    }

    override fun getModel(): Int {
        return VehicleNative.getModel(vehicleId)
    }

    override fun setModel(modelId: Int) {
        return VehicleNative.setModel(vehicleId, modelId)
    }

    override fun getVelocity(): Vector3 {
        return VehicleNative.getVelocity(vehicleId)
    }

    override fun getAlpha(): Int {
        return VehicleNative.getAlpha(vehicleId)
    }

    override fun setAlpha(alpha: Int) {
        return VehicleNative.setAlpha(vehicleId, alpha)
    }
}