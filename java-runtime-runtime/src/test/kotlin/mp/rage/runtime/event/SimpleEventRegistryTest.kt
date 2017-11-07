/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.event

import mp.rage.api.event.EventPriority
import mp.rage.runtime.event.registry.SimpleEventRegistry
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.lang.reflect.Method
import kotlin.reflect.jvm.javaMethod

internal class SimpleEventRegistryTest {

    lateinit var simpleEventRegistry : SimpleEventRegistry;
    lateinit var validEventClass: ValidEventClass
    lateinit var eventMethod: Method

    @BeforeEach
    internal fun setUp() {
        simpleEventRegistry = SimpleEventRegistry()
        validEventClass = ValidEventClass()
        eventMethod = validEventClass::testEvent.javaMethod!!
    }

    @Test
    fun canAddEventListener() {
        // WHEN
        simpleEventRegistry.addEventListener(EventPriority.HIGH, validEventClass, eventMethod)

        // THEN
        val eventElement = simpleEventRegistry.listeners[EventPriority.HIGH]
        assertThat(eventElement!!.references).hasSize(1)
        assertThat(eventElement.references[validEventClass]).contains(eventMethod)
    }

    @Test
    fun removeEventListener() {
        // GIVEN
        simpleEventRegistry.addEventListener(EventPriority.HIGH, validEventClass, eventMethod)

        // WHEN
        simpleEventRegistry.removeEventListener(validEventClass)

        // THEN
        assertThat(simpleEventRegistry.listeners).hasSize(0)
    }

}