/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.command

import mp.rage.api.command.BasicCommand
import mp.rage.api.command.Command
import mp.rage.api.player.Player

@Command(["testCommand", "command"])
class ValidCommandClass : BasicCommand {
    override fun execute(player: Player, arguments: List<String>) {
        throw Exception("test")
    }
}