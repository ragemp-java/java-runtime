/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.api.checkpoint

import mp.rage.api.color.RGBAColor
import mp.rage.api.entity.Entity
import mp.rage.api.player.Player
import mp.rage.api.vector.Vector3

interface Checkpoint : Entity {

    fun create(type: Int, position: Vector3, nextPosition: Vector3, radius: Float, rgbaColor: RGBAColor, visible: Boolean, dimension: Int): Int

    fun getColour(): RGBAColor
    fun setColour(rgbaColor: RGBAColor)

    fun getDirection(): Vector3
    fun setDirection(direction: Vector3)

    fun getRadius(): Float
    fun setRadius(radius: Float)

    fun isVisible(): Boolean
    fun setVisible(toggle: Boolean)

    fun showFor(players: List<Player>)
    fun hideFor(players: List<Player>)
}