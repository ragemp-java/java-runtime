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
import mp.rage.runtime.command.SimpleCommandHandler
import mp.rage.runtime.config.Configuration
import mp.rage.runtime.config.ResourceConfiguration
import mp.rage.runtime.event.EventInstanceManager
import org.slf4j.LoggerFactory
import java.io.File
import java.util.zip.ZipFile

class ResourceManager {

    private val log = LoggerFactory.getLogger(ResourceManager::class.java)
    private val resourceClassLoader = ResourceClassLoader()
    private val resources = HashMap<String, InternalResource>()

    fun loadResources() {
        Configuration.getRuntimeConfiguration().resources.forEach {
            val file = File("plugins" + File.separator + "resources" + File.separator + it + ".jar")

            if (!file.exists()) {
                log.error("Cloud not find configured resource: {}", it)
                return
            }

            var resourceConfiguration: ResourceConfiguration? = null
            try {
                resourceConfiguration = readResourceConfiguration(file)

                resourceClassLoader.loadClass(file.toURI().toURL())
                val runtime = createRuntimeInstance(resourceConfiguration)
                val resource = resourceClassLoader.createClass(resourceConfiguration, runtime)

                val internalResource = InternalResource(it, resource, runtime, resourceConfiguration)
                tryToStartResource(internalResource)
            } catch (e: Throwable) {
                log.error("Failed to load resource: '{}' with configuration: {}", it, resourceConfiguration, e)
            }
        }
    }

    private fun tryToStartResource(internalResource: InternalResource) {
        try {
            internalResource.resource.start()
            resources.put(internalResource.name, internalResource)
        } catch (e: Throwable) {
            log.error("Failed to start resource: {}", internalResource.name, e)
            internalResource.resource.stop()
            EventInstanceManager.removeInstance(internalResource.name)
        }
    }

    fun unloadResource(name: String) {
        if (!resources.containsKey(name)) {
            return
        }

        val internalResource = resources[name]!!
        internalResource.resource.stop()
        EventInstanceManager.removeInstance(internalResource.name)
        resources.remove(name)
    }

    internal fun createRuntimeInstance(resourceConfiguration: ResourceConfiguration): RageJavaRuntime {
        val eventHandler = EventInstanceManager.createInstance(resourceConfiguration.resourceClass)
        val simpleCommandHandler = SimpleCommandHandler(eventHandler, resourceConfiguration)
        return ResourceRuntime(eventHandler, simpleCommandHandler)
    }

    internal fun readResourceConfiguration(file: File): ResourceConfiguration {
        val zipFile = ZipFile(file)
        val entry = zipFile.getEntry("config.yaml")
        val inputStream = zipFile.getInputStream(entry)
        return Configuration.readResourceConfiguration(inputStream)
    }
}