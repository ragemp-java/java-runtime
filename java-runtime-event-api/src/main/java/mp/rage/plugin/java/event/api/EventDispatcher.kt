package mp.rage.plugin.java.event.api

/**
 * @author Noxaro
 */
interface EventDispatcher {

    fun register(event: Event, listenerMethod: (event: Event) -> Unit)

    fun post(event: Event)
}