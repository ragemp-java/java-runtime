/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Launcher {

    public static void main() {
        log.info("Initializing RageJava Launcher");
        log.info("Loading JNI Library");
        System.load("C:\\Users\\Fabian Jungwirth\\CLionProjects\\ragejava\\build\\plugins\\RageJava.dll");
    }
}