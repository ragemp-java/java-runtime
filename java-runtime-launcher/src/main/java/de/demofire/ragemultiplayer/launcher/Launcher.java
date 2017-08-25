package de.demofire.ragemultiplayer.launcher;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Noxaro
 */
@Slf4j
public class Launcher {

    public static void main() {
        log.info("Initializing RageJava Launcher");
        log.info("Loading JNI Library");
        System.load("C:\\Users\\Fabian Jungwirth\\CLionProjects\\ragejava\\build\\plugins\\RageJava.dll");
    }
}