/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.game.checkpoint

import mp.rage.api.checkpoint.Checkpoint
import mp.rage.api.checkpoint.CheckpointPool
import mp.rage.api.color.RGBAColor
import mp.rage.api.vector.Vector3
import mp.rage.launcher.checkpoint.CheckpointNative

class CheckpointPoolImpl : CheckpointPool {
    override fun create(type: Int, position: Vector3, nextPosition: Vector3, radius: Float, rgbaColor: RGBAColor, visible: Boolean, dimension: Int): Checkpoint {
        val id = CheckpointNative.create(
                type,
                position.x,
                position.y,
                position.z,
                nextPosition.x,
                nextPosition.y,
                nextPosition.z,
                radius,
                rgbaColor.red,
                rgbaColor.green,
                rgbaColor.blue,
                rgbaColor.alpha,
                visible,
                dimension)

        TODO()
    }

    override fun getAt(id: Int): Checkpoint {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun length(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInRange(position: Vector3, range: Float, dimension: Int): List<Checkpoint> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInDimension(dimension: Int): List<Checkpoint> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}