/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *  
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.api.entity

import mp.rage.api.color.RGBColor
import mp.rage.api.vector.Vector3

/**
 * @author Noxaro
 */
interface Entity {
    fun getType(): EntityType

    fun destroy()

    fun getDimension(): Int
    fun setDimension(dimensionId: Int)

    fun getPosition(): Vector3
    fun setPosition(vector3: Vector3)

    fun getRotation(): Vector3
    fun setRotation(vector3: Vector3)

    fun getModel(): Int
    fun setModel(modelId: Int)

    fun getVelocity(): Vector3

    fun getAlpha(): Int
    fun setAlpha(alpha: Int)
}