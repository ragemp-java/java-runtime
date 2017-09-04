package mp.rage.plugin.java.api.command

/**
 * @author Noxaro
 */
@MustBeDocumented
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Command(val commands: Array<String>)