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

import mp.rage.api.vector.Vector3

interface EntityPool<out T : Entity> {
    fun getAt(id: Int): T
    fun length(): Int
    fun count(): Int

    fun getInRange(position: Vector3, range: Float, dimension: Int): List<T>
    fun getInDimension(dimension: Int): List<T>
}