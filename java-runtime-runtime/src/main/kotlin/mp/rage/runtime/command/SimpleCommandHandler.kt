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
import mp.rage.api.command.CommandHandler
import mp.rage.api.event.EventHandler
import mp.rage.api.event.EventPriority
import mp.rage.api.event.SubscribeEvent
import mp.rage.api.player.event.PlayerCommandEvent
import mp.rage.runtime.config.ResourceConfiguration
import org.slf4j.LoggerFactory
import java.util.concurrent.atomic.AtomicBoolean

class SimpleCommandHandler(eventHandler: EventHandler, resourceConfiguration: ResourceConfiguration) : CommandHandler {

    private val log = LoggerFactory.getLogger(SimpleCommandHandler::class.java)
    private val commands = HashMap<String, InternalCommand>()

    init {
        val commandClasses = CommandClassPathScanner().getCommandClasses(resourceConfiguration)
        commandClasses.forEach {
            it.key.forEach { command ->
                commands.put(command, InternalCommand(it.value, AtomicBoolean(true)))
            }
        }
        eventHandler.registerEvents(this)
    }

    @SubscribeEvent(eventPriority = EventPriority.HIGH)
    fun execute(playerCommandEvent: PlayerCommandEvent) {
        var arguments: MutableList<String>
        val command: String

        if(playerCommandEvent.command.contains(" ")) {
            arguments = playerCommandEvent.command.split(" ").toMutableList()
            command = arguments[0]
            arguments = arguments.subList(1, arguments.size)
        } else {
            arguments = emptyList<String>().toMutableList()
            command = playerCommandEvent.command
        }

        if(!commands.containsKey(command)) {
            return
        }

        val clazz = commands[command]!!.commandClass
        val basicCommand = clazz.constructors.first().newInstance() as BasicCommand

        if(!commands[command]!!.active.get()) {
            basicCommand.whenDisabled(playerCommandEvent.player, arguments)
            return
        }

        try {
            if(basicCommand.beforeExecute(playerCommandEvent.player, arguments.toList())) {
                basicCommand.execute(playerCommandEvent.player, arguments.toList())
            }
        } catch (e: Throwable) {
            log.error("Failed to execute command: '{}'", command, e)
        }
    }

    override fun setCommandActive(command: String, active: Boolean) {
        commands[command]?.active?.set(active)
    }
}