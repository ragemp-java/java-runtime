/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.player;

import lombok.extern.slf4j.Slf4j;
import mp.rage.api.player.event.*;
import mp.rage.launcher.Launcher;

import java.util.Arrays;
import java.util.Collections;

@Slf4j
@SuppressWarnings("unused")
public class PlayerEvents {

    private PlayerEvents() {}

    static void onPlayerCreated(int playerId) {
        log.debug("incoming onPlayerCreated: {}", playerId);
        Launcher.publishEvent(PlayerCreatedEvent.class, Collections.singletonList(playerId));
    }

    static void onPlayerDestroyed(int playerId) {
        log.debug("incoming onPlayerDestroyed: {}", playerId);
        Launcher.publishEvent(PlayerDestroyedEvent.class, Collections.singletonList(playerId));
    }

    static void onPlayerJoin(int playerId) {
        log.debug("incoming playerJoinEvent: {}", playerId);
        Launcher.publishEvent(PlayerJoinEvent.class, Collections.singletonList(playerId));
    }

    static void onPlayerCommand(int playerId, String command ) {
        log.debug("incoming onPlayerCommandEvent: {} {}", playerId, command);
        Launcher.publishEvent(PlayerCommandEvent.class, Arrays.asList(playerId, command));
    }

    static void onPlayerQuit(int playerId, int exitType, String reason) {
        log.debug("incoming onPlayerQuit: {} {} {}", playerId, exitType, reason);
        Launcher.publishEvent(PlayerQuitEvent.class, Arrays.asList(playerId, exitType, reason));
    }

    static void onPlayerSpawn(int playerId) {
        log.debug("incoming onPlayerSpawn: {}", playerId);
        Launcher.publishEvent(PlayerSpawnEvent.class, Collections.singletonList(playerId));
    }

    static void onPlayerChat(int playerId, String text) {
        log.debug("incoming onPlayerChat: {} {}", playerId, text);
        Launcher.publishEvent(PlayerChatEvent.class, Arrays.asList(playerId, text));
    }

    static void onPlayerEnterVehicle(int playerId, int vehicleId, int seatId) {
        log.debug("incoming onPlayerEnterVehicle: {} {} {}", playerId, vehicleId, seatId);
        Launcher.publishEvent(PlayerEnterVehicleEvent.class, Arrays.asList(playerId, vehicleId, seatId));
    }

    static void onPlayerStartEnterVehicle(int playerId, int vehicleId, int seatId) {
        log.debug("incoming onPlayerStartEnterVehicle: {} {} {}", playerId, vehicleId, seatId);
        Launcher.publishEvent(PlayerStartEnterVehicleEvent.class, Arrays.asList(playerId, vehicleId, seatId));
    }

    static void onPlayerExitVehicle(int playerId, int vehicleId) {
        log.debug("incoming onPlayerExitVehicle: {} {}", playerId, vehicleId);
        Launcher.publishEvent(PlayerExitVehicleEvent.class, Arrays.asList(playerId, vehicleId));
    }

    static void onPlayerStartExitVehicle(int playerId, int vehicleId) {
        log.debug("incoming onPlayerStartExitVehicle: {} {}", playerId, vehicleId);
        Launcher.publishEvent(PlayerStartExitVehicleEvent.class, Arrays.asList(playerId, vehicleId));
    }

    static void onPlayerDeath(int playerId, int reason, int killerId) {
        log.debug("incoming onPlayerDeath: {} {} {}", playerId, reason, killerId);
        Launcher.publishEvent(PlayerDeathEvent.class, Arrays.asList(playerId, reason, killerId));
    }

    static void onPlayerReady(int playerId) {
        log.debug("incoming onPlayerReady: {}", playerId);
        Launcher.publishEvent(PlayerReadyEvent.class, Collections.singletonList(playerId));
    }

    static void onPlayerDamage(int playerId, float healthLoss, float armorLoss) {
        log.debug("incoming onPlayerDamage: {} {} {}", playerId, healthLoss, armorLoss);
        Launcher.publishEvent(PlayerDamageEvent.class, Arrays.asList(playerId, healthLoss, armorLoss));
    }

    static void onPlayerWeaponChange(int playerId, int oldWeaponHash, int newWeaponHash) {
        log.debug("incoming onPlayerWeaponChange: {} {} {}", playerId, oldWeaponHash, newWeaponHash);
        Launcher.publishEvent(PlayerWeaponChangeEvent.class, Arrays.asList(playerId, oldWeaponHash, newWeaponHash));
    }

    static void onPlayerModelChange(int playerId, int oldHash) {
        log.debug("incoming onEntityModelChange: {} {}", playerId, oldHash);
        Launcher.publishEvent(PlayerModelChangeEvent.class, Arrays.asList(playerId, oldHash));
    }
}
