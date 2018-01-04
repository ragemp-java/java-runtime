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
import mp.rage.api.entity.EntityPool
import mp.rage.api.vector.Vector3

interface CheckpointPool : EntityPool<Checkpoint> {
    fun create(type: Int, position: Vector3, nextPosition: Vector3, radius: Float, rgbaColor: RGBAColor, visible: Boolean, dimension: Int): Checkpoint
}