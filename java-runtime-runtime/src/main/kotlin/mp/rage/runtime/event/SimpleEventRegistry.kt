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
import java.lang.reflect.Method
import java.util.*

internal class SimpleEventRegistry : EventRegistry {

    @Volatile
    override var listeners: EnumMap<EventPriority, EventElement> = EnumMap(EventPriority::class.java)

    @Synchronized
    override fun addEventListener(eventPriority: EventPriority, instance: Any, method: Method) {
        listeners.getOrPut(eventPriority, { EventElement() }).addReference(instance, method)
    }

    @Synchronized
    override fun removeEventListener(instance: Any) {
        val entriesToRemove = ArrayList<EventPriority>()
        listeners.forEach { eventPriority, eventEntry ->
            if(eventEntry.references.containsKey(instance)){
                eventEntry.references.remove(instance)
                if(eventEntry.references.isEmpty()) {
                    entriesToRemove.add(eventPriority)
                }
            }
        }

        entriesToRemove.forEach{listeners.remove(it)}
    }
}