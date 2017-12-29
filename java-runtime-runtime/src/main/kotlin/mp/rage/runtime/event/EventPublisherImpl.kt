/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.event

import mp.rage.api.event.AbstractEvent
import mp.rage.launcher.EventPublisher
import mp.rage.runtime.game.player.PlayerHandler

internal class EventPublisherImpl : EventPublisher {

    override fun <T : AbstractEvent?> publishEvent(eventClass: Class<T>, args: MutableList<Any>) {
        val playerId: Int = args[0] as Int
        val player = PlayerHandler.getPlayer(playerId)

        val event: AbstractEvent = if (args.size == 1) {
            eventClass.constructors[0].newInstance(player) as AbstractEvent
        } else {
            args[0] = player
            eventClass.constructors[0].newInstance(*args.toTypedArray()) as AbstractEvent
        }
        EventInstanceManager.postEvent(event)
    }
}