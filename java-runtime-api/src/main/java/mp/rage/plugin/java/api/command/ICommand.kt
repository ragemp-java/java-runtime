package mp.rage.plugin.java.api.command

import mp.rage.plugin.java.api.player.Player

/**
 * @author Noxaro
 */
interface ICommand {
    fun beforeExecute(player: Player, arguments: Array<String>): Boolean {
        return true;
    }

    fun execute(player: Player, arguments: Array<String>);
}