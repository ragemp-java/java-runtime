package mp.rage.plugin.java.event.api

/**
 * @author Noxaro
 */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class SubscribeEvent(val eventPriority: EventPriority = EventPriority.NORMAL)