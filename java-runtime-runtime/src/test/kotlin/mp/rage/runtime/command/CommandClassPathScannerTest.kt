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

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommandClassPathScannerTest {

    @Test
    fun testCanGetClassPath() {
        // GIVEN
        val commandClassPathScanner = CommandClassPathScanner()
        val classPath = "de.test.hallo.welt.Test"

        // WHEN
        val parsedClassPath = commandClassPathScanner.getClassPath(classPath)

        // THEN
        assertThat(parsedClassPath).isEqualTo("de.test.hallo.welt")
    }

    @Test
    fun testCanBuildCommandMap() {
        // GIVEN
        val commandClassPathScanner = CommandClassPathScanner()

        // WHEN
        val buildCommandMap = commandClassPathScanner.buildCommandMap(setOf<Class<*>>(ValidCommandClass::class.java))

        // THEN
        assertThat(buildCommandMap).hasSize(1)
        val firstCommand = buildCommandMap.entries.first()
        assertThat(firstCommand.key).containsExactly("testCommand", "command")
        assertThat(firstCommand.value).isEqualTo(ValidCommandClass::class.java)
    }
}