/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.player

import java.util.concurrent.ConcurrentHashMap

internal class PlayerHandler {

    private val players = ConcurrentHashMap<Int, PlayerImpl>()

    fun getPlayer(id: Int): PlayerImpl {
        return players.getOrDefault(id, PlayerImpl(id))
    }

    fun removePlayer(id: Int) {
        players.remove(id)
    }
}