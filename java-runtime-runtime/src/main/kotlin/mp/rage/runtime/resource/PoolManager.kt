/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.resource

import mp.rage.runtime.game.checkpoint.CheckpointPoolImpl
import mp.rage.runtime.game.player.PlayerPoolImpl
import mp.rage.runtime.game.vehicle.VehiclePoolImpl

class PoolManager {
    val playerPool = PlayerPoolImpl()
    val checkpointPool = CheckpointPoolImpl()
    val vehiclePool = VehiclePoolImpl()
}