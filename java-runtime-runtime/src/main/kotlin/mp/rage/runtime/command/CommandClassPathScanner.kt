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

import mp.rage.api.command.Command
import mp.rage.runtime.config.ResourceConfiguration
import org.reflections.Reflections
import org.slf4j.LoggerFactory

class CommandClassPathScanner {

    private val log = LoggerFactory.getLogger(CommandClassPathScanner::class.java)

    fun getCommandClasses(resourceConfiguration: ResourceConfiguration): Map<List<String>, Class<*>> {
        val classPath = getClassPath(resourceConfiguration.resourceClass)
        val reflections = Reflections(classPath);
        val commandClasses = reflections.getTypesAnnotatedWith(Command::class.java);
        log.debug("Found the following list of commands: {}", commandClasses)
        return buildCommandMap(commandClasses)
    }

    internal fun buildCommandMap(classes: Set<Class<*>>) : Map<List<String>, Class<*>> {
        val commandMap = HashMap<List<String>, Class<*>>()
        classes.forEach{
            val commandAnnotation = it.annotations.first { it.annotationClass == Command::class } as Command
            commandMap.put(commandAnnotation.commands.asList(), it)
        }
        return commandMap
    }

    internal fun getClassPath(classPath: String): String {
        val lastIndexOf = classPath.lastIndexOf(".")
        return classPath.substring(0, lastIndexOf)
    }
}