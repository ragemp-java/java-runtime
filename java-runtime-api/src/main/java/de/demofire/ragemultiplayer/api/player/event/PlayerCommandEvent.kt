package de.demofire.ragemultiplayer.api.player.event

import de.demofire.ragemultiplayer.api.player.Player

/**
 * @author Noxaro
 */
data class PlayerCommandEvent(
        val player: Player,
        val command: String
) : PlayerEvent