/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.checkpoint;

import mp.rage.plugin.java.launcher.player.PlayerNative;

/**
 * @author Noxaro
 */
public class CheckpointEvents {

    public static void onPlayerEnterCheckpoint(int playerId, int checkpointId) {
        PlayerNative.outputChatBox(playerId, "onEnterCheckpoint");
        System.out.println("onPlayerEnterCheckpoint " + playerId + " " + checkpointId);
    }

    public static void onPlayerExitCheckpoint(int playerId, int checkpointId) {
        PlayerNative.outputChatBox(playerId, "onExitCheckpoint");
        System.out.println("onPlayerExitCheckpoint " + playerId + " " + checkpointId);
    }

    public static void onCheckpointCreated(int checkpointId) {
        System.out.println("incoming onCheckpointCreated" + checkpointId);
    }

    public static void onCheckpointDestroyed(int checkpointId) {
        System.out.println("incoming onCheckpointDestroyed" + checkpointId);
    }
}
