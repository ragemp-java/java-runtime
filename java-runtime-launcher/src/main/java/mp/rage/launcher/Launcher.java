/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher;

import lombok.extern.slf4j.Slf4j;
import mp.rage.api.RageJavaRuntime;
import mp.rage.api.event.AbstractEvent;
import mp.rage.api.exception.JNIExecutionException;

import java.io.File;
import java.util.List;
import java.util.ServiceLoader;

@Slf4j
public class Launcher {

    private Launcher() {}

    private static ServiceLoader<EventPublisher> eventHandlers = ServiceLoader.load(EventPublisher.class);
    private static ServiceLoader<RageJavaRuntime> runtimes = ServiceLoader.load(RageJavaRuntime.class);

    /**
     * @param operatingSystem 0 for linux and 1 for windows
     */
    @SuppressWarnings("unused") // called via jni only
    public static void main(int operatingSystem) throws JNIExecutionException {
        initializeJNI(operatingSystem);
        initializeRuntime();
    }

    private static void initializeJNI(int operatingSystem) throws JNIExecutionException {
        log.info("Initializing RageJava launcher");
        String fileEnding;
        if(operatingSystem == 0) {
            fileEnding = ".so";
            log.info("Using Linux binary");
        } else if (operatingSystem  == 1) {
            fileEnding = ".dll";
            log.info("Using Windows binary");
        } else {
            throw new JNIExecutionException("invalid operating system parameter: " + operatingSystem);
        }
        File binaryPath = new File("plugins/RageJava" + fileEnding);
        System.load(binaryPath.getAbsolutePath());
    }

    private static void initializeRuntime() {
        log.info("Initialize RageMP Java Runtime");
        runtimes.forEach(RageJavaRuntime::initialize);
    }

    public static <T extends AbstractEvent> void publishEvent(Class<T> eventClass, List<Object> args) {
        eventHandlers.forEach(eventHandler -> eventHandler.publishEvent(eventClass, args));
    }
}