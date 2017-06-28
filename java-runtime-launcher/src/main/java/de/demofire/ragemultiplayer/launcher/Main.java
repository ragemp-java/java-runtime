package de.demofire.ragemultiplayer.launcher;

import de.demofire.ragemultiplayer.launcher.player.Player;
import de.demofire.ragemultiplayer.launcher.player.PlayerNative;

/**
 * @author Noxaro
 */
public class Main {

    public static void main() {
        System.out.println("init jvm code: Tobias ist ein Kek!");
//        System.out.println(System.getProperty("java.library.path"));
        System.load("F:\\Grand Theft Auto 5\\RageMP\\plugins\\RageJava.dll");
        System.out.println("loaded rage lib");
        new PlayerNative().kick("test");
    }
}