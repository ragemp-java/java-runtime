package mp.rage.plugin.java.api.command

/**
 * @author Noxaro
 */
interface CommandHandler {

    fun setCommandActive(command: BasicCommand, active: Boolean)
}