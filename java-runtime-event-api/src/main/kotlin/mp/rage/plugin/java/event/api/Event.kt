package mp.rage.plugin.java.event.api

/**
 * @author Noxaro
 */
abstract class Event {
    private var interrupted: Boolean = false;

    fun isInterrupted(): Boolean {
        return interrupted;
    }

    fun interrupt() {
        interrupted = true;
    }
}