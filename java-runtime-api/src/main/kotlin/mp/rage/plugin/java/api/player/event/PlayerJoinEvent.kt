package mp.rage.plugin.java.api.player.event

import mp.rage.plugin.java.api.player.Player

/**
 * @author Noxaro
 */
data class PlayerJoinEvent(
        val player: Player
) : PlayerEvent()