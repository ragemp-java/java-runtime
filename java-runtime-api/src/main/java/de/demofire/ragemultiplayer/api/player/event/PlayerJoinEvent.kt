package de.demofire.ragemultiplayer.api.player.event

import de.demofire.ragemultiplayer.api.player.Player

/**
 * @author Noxaro
 */
data class PlayerJoinEvent(
        val player: Player
) : PlayerEvent