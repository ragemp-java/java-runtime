/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.api.player.event

import mp.rage.api.player.Player
import mp.rage.api.vehicle.Vehicle

data class PlayerStartEnterVehicleEvent(
        val player: Player,
        val vehicle: Vehicle,
        val seatId: Int
) : PlayerEvent(player)