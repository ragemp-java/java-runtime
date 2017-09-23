/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.api.vehicle

import mp.rage.plugin.java.api.color.RGBColor
import mp.rage.plugin.java.api.entity.Entity

interface Vehicle : Entity {
    fun create(model: Int, x: Float, y: Float, z: Float, heading: Float, dimension: Int): Int

    fun isSirenActive(): Boolean
    fun isHornActive(): Boolean
    fun areHighbeamsActive(): Boolean
    fun ireLightsActive(): Boolean
    fun isEngineActive(): Boolean
    fun isRocketBoostActive(): Boolean
    fun isBrakeActive(): Boolean
    fun getSteerAngle(): Float
    fun getGasPedalState(): Float
    fun getEngineHealth(): Float

    fun getBodyHealth(): Float
    fun getOccupant(seat: Int): Int
    fun getOccupants(): List<Int>
    fun setOccupant(seat: Int, playerId: Int)

    fun isLocked(): Boolean
    fun lock(toggle: Boolean)

    fun isDead(): Boolean

    fun explode()
    fun spawn(x: Float, y: Float, z: Float, heading: Float)

    fun getMod(id: Int): Int
    fun setMod(id: Int, mod: Int)

    fun areNeonsEnabled(): Boolean
    fun enableNeons(toggle: Boolean)

    fun setNeonsColour(r: Int, g: Int, b: Int)
    fun getNeonsColour(): RGBColor

    fun repair()

    fun getColourRGB(id: Int): RGBColor
    fun getColour(id: Int): Int
    fun getPaint(id: Int): Int

    fun setColourRGB(primaryRed: Int, primaryGreen: Int, primaryBlue: Int, secondaryRed: Int, secondaryGreen: Int, secondaryBlue: Int)
    fun setColour(primary: Int, secondary: Int)
    fun setPaint(primaryType: Int, primaryColor: Int, secondaryType: Int, secondaryColor: Int)

    fun getMaterialType(): Int

    fun getNumberPlate(): String
    fun setNumberPlate(numberPlate: String)
}