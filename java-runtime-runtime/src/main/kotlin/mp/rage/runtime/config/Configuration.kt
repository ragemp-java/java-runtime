/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.io.File
import java.io.InputStream

object Configuration {

    private val mapper: ObjectMapper = ObjectMapper(YAMLFactory()).registerKotlinModule()

    private lateinit var runtimeConfiguration: RuntimeConfiguration;

    fun getRuntimeConfiguration(): RuntimeConfiguration {
        if(::runtimeConfiguration.isInitialized) {
            return runtimeConfiguration;
        }
        runtimeConfiguration = mapper.readValue(File("config.yaml"), RuntimeConfiguration::class.java)
        return runtimeConfiguration;
    }

    fun readResourceConfiguration(inputStream: InputStream): ResourceConfiguration {
        return mapper.readValue(inputStream, ResourceConfiguration::class.java)
    }
}