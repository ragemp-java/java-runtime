/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.event.dispatcher

import kotlinx.coroutines.experimental.launch
import mp.rage.api.event.AbstractEvent
import mp.rage.runtime.event.registry.EventRegistry
import org.slf4j.LoggerFactory

internal class ConcurrentEventDispatcher : EventDispatcher {

    private val log = LoggerFactory.getLogger(ConcurrentEventDispatcher::class.java)

    override fun dispatchEvent(eventRegistry: EventRegistry, abstractEvent: AbstractEvent) {
        eventRegistry.listeners.forEach { eventEntry ->
            eventEntry.value.references.forEach { (classReference, methodReference) ->
                methodReference.forEach {
                    if (abstractEvent.isInterrupted()) {
                        log.info("stopped dispatching event because event was interrupted. Event: {}", abstractEvent.javaClass.simpleName)
                        return
                    }
                    try {
                        launch {
                            it.invoke(classReference, abstractEvent)
                        }
                    } catch (e: Throwable) {
                        log.warn("catched exception while dispatching event: {}", abstractEvent, e)
                    }
                }
            }
        }
    }
}