package mp.rage.plugin.java.event.api

/**
 * @author Noxaro
 */
interface GameEventDispatcher {
    fun post(gameEvent: GameEvent)

    fun register()

    fun registerNodeEventHandler(gameEventDispatcher: GameEventDispatcher)
    fun unregisterNodeEventHandler(gameEventDispatcher: GameEventDispatcher)
}