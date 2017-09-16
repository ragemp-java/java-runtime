/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.event.simple

import mp.rage.plugin.java.event.api.Event
import mp.rage.plugin.java.event.api.EventDispatcher

class EventDispatcherImpl : EventDispatcher {

    override fun register(event: Event, listenerMethod: (event: Event) -> Unit) {

    }

    override fun post(event: Event) {

    }
}