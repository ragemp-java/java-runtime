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
import mp.rage.api.event.EventHandler
import mp.rage.runtime.config.Configuration
import mp.rage.runtime.event.dispatcher.ConcurrentEventDispatcher
import mp.rage.runtime.event.dispatcher.SingleEventDispatcher
import java.util.concurrent.ConcurrentHashMap

object EventInstanceManager {
    private val eventHandlers = ConcurrentHashMap<String, EventHandler>()

    fun createInstance(name: String) : EventHandler {
        val eventDispatcher = if(Configuration.getRuntimeConfiguration().concurrentEventDispatching) {
            ConcurrentEventDispatcher()
        } else {
            SingleEventDispatcher()
        }
        val eventHandler = EventHandlerImpl(eventDispatcher)
        eventHandlers.put(name, eventHandler)
        return eventHandler;
    }

    fun removeInstance(owner: String) {
        if(eventHandlers.containsKey(owner)) {
            eventHandlers.remove(owner)
        }
    }

    fun postEvent(event: AbstractEvent) {
        eventHandlers.forEach {
            it.value.postEvent(event)
        }
    }
}