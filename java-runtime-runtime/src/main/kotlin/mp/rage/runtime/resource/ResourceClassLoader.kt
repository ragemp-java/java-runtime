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
import mp.rage.api.Resource
import mp.rage.runtime.config.ResourceConfiguration
import java.lang.reflect.Method
import java.net.URL
import java.net.URLClassLoader

class ResourceClassLoader() {

    private var classloader: ClassLoader = ClassLoader.getSystemClassLoader() as URLClassLoader;
    private val method: Method

    init {
        val sysClass = URLClassLoader::class.java
        val parameters = arrayOf<Class<*>>(URL::class.java)
        method = sysClass.getDeclaredMethod("addURL", *parameters)
        method.isAccessible = true
    }

    fun loadClass(uri: URL, resourceConfiguration: ResourceConfiguration, rageJavaRuntime: RageJavaRuntime): Resource {
        method.invoke(classloader, uri)

        val constructor = classloader
                .loadClass(resourceConfiguration.resourceClass)
                .getConstructor(RageJavaRuntime::class.java)
        return constructor.newInstance(rageJavaRuntime) as Resource
    }
}