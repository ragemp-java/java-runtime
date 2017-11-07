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

import mp.rage.api.event.EventPriority
import mp.rage.api.event.SubscribeEvent

internal open class InvalidEventClass {
    @SubscribeEvent(EventPriority.HIGH)
    fun testEvent(playerCommandEvent: String) {

    }
}