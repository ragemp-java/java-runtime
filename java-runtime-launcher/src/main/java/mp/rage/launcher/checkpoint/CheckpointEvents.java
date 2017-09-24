/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.checkpoint;

import lombok.extern.slf4j.Slf4j;
import mp.rage.launcher.player.PlayerNative;

@Slf4j
public class CheckpointEvents {

    private CheckpointEvents() {}

    public static void onPlayerEnterCheckpoint(int playerId, int checkpointId) {
        PlayerNative.outputChatBox(playerId, "onEnterCheckpoint");
        log.debug("onPlayerEnterCheckpoint; {} {}", playerId, checkpointId);
    }

    public static void onPlayerExitCheckpoint(int playerId, int checkpointId) {
        PlayerNative.outputChatBox(playerId, "onExitCheckpoint");
        log.debug("onPlayerExitCheckpoint; {} {}", playerId, checkpointId);
    }

    public static void onCheckpointCreated(int checkpointId) {
        log.debug("incoming onCheckpointCreated", checkpointId);
    }

    public static void onCheckpointDestroyed(int checkpointId) {
        log.debug("incoming onCheckpointDestroyed", checkpointId);
    }
}
