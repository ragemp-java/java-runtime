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

import mp.rage.api.vector.Vector3
import mp.rage.api.vehicle.Vehicle
import mp.rage.api.vehicle.VehiclePool

class VehiclePoolImpl : VehiclePool {
    override fun create(model: Int, x: Float, y: Float, z: Float, heading: Float, numberPlate: String, alpha: Int, locked: Boolean, engine: Boolean, dimension: Int): Vehicle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAt(id: Int): Vehicle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun length(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInRange(position: Vector3, range: Float, dimension: Int): List<Vehicle> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInDimension(dimension: Int): List<Vehicle> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}