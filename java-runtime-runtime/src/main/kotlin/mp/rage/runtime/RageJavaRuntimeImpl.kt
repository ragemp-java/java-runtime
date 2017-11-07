/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime

import mp.rage.api.RageJavaRuntime
import mp.rage.api.event.EventHandler
import mp.rage.runtime.event.EventHandlerImpl
import mp.rage.runtime.event.dispatcher.SingleEventDispatcher
import mp.rage.runtime.player.PlayerHandler
import org.slf4j.LoggerFactory

object RageJavaRuntimeImpl : RageJavaRuntime {

    private val log = LoggerFactory.getLogger(RageJavaRuntimeImpl::class.java)

    internal val eventHandler : EventHandler = EventHandlerImpl(SingleEventDispatcher())
    internal val playerHandler : PlayerHandler = PlayerHandler()

    override fun initialize() {
        log.info("Initialize runtime")
    }

    override fun getEventHandler(): EventHandler {
        return eventHandler;
    }
}