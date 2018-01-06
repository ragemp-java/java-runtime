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

import mp.rage.api.player.Player
import mp.rage.api.player.PlayerPool
import mp.rage.api.vector.Vector3

class PlayerPoolImpl : PlayerPool {
    override fun broadcast(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun broadcastInRange(message: String, position: Vector3, range: Float, dimension: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun broadcastInDimension(message: String, dimension: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAt(id: Int): Player {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun length(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInRange(position: Vector3, range: Float, dimension: Int): List<Player> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInDimension(dimension: Int): List<Player> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}