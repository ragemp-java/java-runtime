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

data class InternalResource(
        val name: String,
        val resource: Resource,
        val runtime: RageJavaRuntime,
        val resourceConfiguration: ResourceConfiguration
)