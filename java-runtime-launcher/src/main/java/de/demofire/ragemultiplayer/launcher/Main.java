package de.demofire.ragemultiplayer.launcher;

import de.demofire.ragemultiplayer.launcher.player.PlayerNative;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Noxaro
 */
@Slf4j
public class Main {

    public static void main() {
        log.info("Initializing RageJava Launcher");
        log.info("Loading JNI Library");
        System.load("F:\\Grand Theft Auto 5\\RageMP\\plugins\\RageJava.dll");
        new PlayerNative().kick(0, "test");
    }
}