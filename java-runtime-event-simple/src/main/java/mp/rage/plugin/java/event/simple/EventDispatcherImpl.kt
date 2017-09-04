package mp.rage.plugin.java.event.simple

import mp.rage.plugin.java.event.api.Event
import mp.rage.plugin.java.event.api.EventDispatcher

/**
 * @author Noxaro
 */
class EventDispatcherImpl : EventDispatcher {

    override fun register(event: Event, listenerMethod: (event: Event) -> Unit) {

    }

    override fun post(event: Event) {

    }
}