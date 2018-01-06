/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.resource

import mp.rage.api.RageJavaRuntime
import mp.rage.api.ResourceManager
import mp.rage.api.checkpoint.CheckpointPool
import mp.rage.api.command.CommandHandler
import mp.rage.api.event.EventHandler
import mp.rage.api.player.PlayerPool
import mp.rage.api.vehicle.VehiclePool

data class ResourceRuntime(
        override val eventHandler: EventHandler,
        override val commandHandler: CommandHandler,
        override val resourceManager: ResourceManager,

        override val playerPool: PlayerPool,
        override val vehiclePool: VehiclePool,
        override val checkpointPool: CheckpointPool
) : RageJavaRuntime