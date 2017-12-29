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
import mp.rage.runtime.command.SimpleCommandHandler
import mp.rage.runtime.config.Configuration
import mp.rage.runtime.config.ResourceConfiguration
import mp.rage.runtime.event.EventInstanceManager
import org.slf4j.LoggerFactory
import java.io.File
import java.util.zip.ZipFile

class ResourceManagerImpl : ResourceManager {

    private val log = LoggerFactory.getLogger(ResourceManagerImpl::class.java)
    private val resourceClassLoader = ResourceClassLoader()
    private val resources = HashMap<String, InternalResource>()

    fun loadResources() {
        Configuration.getRuntimeConfiguration().resources.forEach {
            loadResource(it)
        }
    }

    override fun loadResource(resourceName: String) {
        val file = File("plugins" + File.separator + "resources" + File.separator + resourceName + ".jar")

        if (!file.exists()) {
            log.error("Cloud not find configured resource: {}", resourceName)
            return
        }

        var resourceConfiguration: ResourceConfiguration? = null
        try {
            resourceConfiguration = readResourceConfiguration(file)

            resourceClassLoader.loadClass(file.toURI().toURL())
            val runtime = createRuntimeInstance(resourceName, resourceConfiguration)
            val resource = resourceClassLoader.createClass(resourceConfiguration, runtime)

            val internalResource = InternalResource(resourceName, resource, runtime, resourceConfiguration)
            tryToStartResource(internalResource)
        } catch (e: Throwable) {
            log.error("Failed to load resource: '{}' with configuration: {}", resourceName, resourceConfiguration, e)
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

    override fun unloadResource(resourceName: String) {
        log.info("Unloading resource with name: '{}'", resourceName)
        if (!resources.containsKey(resourceName)) {
            return
        }

        val internalResource = resources[resourceName]!!
        internalResource.resource.stop()
        EventInstanceManager.removeInstance(internalResource.name)
        resources.remove(resourceName)
        log.info("Unloading resource with name: '{}' complete", resourceName)
    }

    internal fun createRuntimeInstance(resourceName: String, resourceConfiguration: ResourceConfiguration): RageJavaRuntime {
        val eventHandler = EventInstanceManager.createInstance(resourceName)
        val simpleCommandHandler = SimpleCommandHandler(eventHandler, resourceConfiguration)
        return ResourceRuntime(eventHandler, simpleCommandHandler, this)
    }

    internal fun readResourceConfiguration(file: File): ResourceConfiguration {
        val zipFile = ZipFile(file)
        val entry = zipFile.getEntry("config.yaml")
        val inputStream = zipFile.getInputStream(entry)
        return Configuration.readResourceConfiguration(inputStream)
    }
}