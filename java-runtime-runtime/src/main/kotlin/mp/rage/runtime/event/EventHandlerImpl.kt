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
import mp.rage.api.event.EventPriority
import mp.rage.api.event.SubscribeEvent
import mp.rage.api.exception.game.InvalidEventSubscriptionException
import java.lang.reflect.Method
import java.util.concurrent.ConcurrentHashMap

internal class EventHandlerImpl(private val eventDispatcher: EventDispatcher) : EventHandler {

    private val eventListeners = ConcurrentHashMap<Class<AbstractEvent>, EventRegistry>()

    override fun registerEvents(instance: Any) {
        val methods = instance.javaClass.methods.filter { it.annotations.any { it is SubscribeEvent } }

        methods.forEach {
            val eventPriority = getEventPriorityFromMethod(it)
            val eventType = getEventType(it)
            registerEventListener(eventPriority, eventType, instance, it)
        }
    }

    override fun unregisterEvents(instance: Any) {
        val entriesToRemove = ArrayList<Class<AbstractEvent>>()
        eventListeners.forEach { classReference, eventDispatcher ->
            eventDispatcher.removeEventListener(instance)
            if(eventDispatcher.listeners.isEmpty()) {
                entriesToRemove.add(classReference)
            }
        }
        entriesToRemove.forEach{eventListeners.remove(it)}
    }

    override fun postEvent(event: AbstractEvent) {
        eventDispatcher.dispatchEvent(eventListeners[event.javaClass]!!, event)
    }

    private fun getEventPriorityFromMethod(method: Method) : EventPriority {
        val subscribeEvent = method.annotations.find { it is SubscribeEvent } as SubscribeEvent
        return subscribeEvent.eventPriority
    }

    private fun getEventType(method: Method) : Class<AbstractEvent> {
        val parameters = method.parameters
        if(parameters.size != 1 || !AbstractEvent::class.java.isAssignableFrom(parameters.first().type)) {
            throw InvalidEventSubscriptionException("method signature is invalid")
        }
        @Suppress("UNCHECKED_CAST")
        return parameters.first().type as Class<AbstractEvent>;
    }

    private fun registerEventListener(eventPriority: EventPriority, eventType: Class<AbstractEvent>, instance : Any, method: Method) {
        val eventListener = eventListeners.getOrPut(eventType, { SimpleEventRegistry() });
        eventListener.addEventListener(eventPriority, instance, method)
    }
}