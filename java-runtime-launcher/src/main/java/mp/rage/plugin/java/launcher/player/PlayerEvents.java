/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.player;

import mp.rage.plugin.java.api.vector.Vector3;

@SuppressWarnings("unused")
public class PlayerEvents {

    static void onPlayerJoin(int playerId) {
        System.out.println("incoming playerJoinEvent: " + playerId);
    }

    static void onPlayerCommand(int playerId, String command ) {
        System.out.println("incoming onPlayerCommandEvent: " + playerId + " " + command);
        if(command.equals("kick")) {
            PlayerNative.kick(playerId, "lol");
        } else if (command.equals("spawn")) {
            PlayerNative.spawn(playerId,-425.517F, 1123.620F, 325.8544F, 1.5F);
        } else if (command.equals("aim")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Vector3 aimingAt = PlayerNative.getAimingAt(playerId);
            System.out.println(aimingAt.toString());
        } else if (command.equals("notify")) {
            PlayerNative.notify(playerId, "Hallo Welt!");
        } else if (command.equalsIgnoreCase("getarmor")) {
            System.out.println(PlayerNative.getArmor(playerId));
        } else if (command.equalsIgnoreCase("setarmor")) {
            PlayerNative.setArmor(playerId, 50);
        } else if (command.equalsIgnoreCase("destroy")) {
            PlayerNative.destroy(playerId);
        } else if (command.equalsIgnoreCase("getclothes")) {
            try {
                PlayerNative.getClothes(playerId, 0);
            } catch (Exception e) {
                System.out.println("exception catched" + e);
            }
        }
    }

    static void onPlayerQuit(int playerId, int exitType, String reason) {
        System.out.println("incoming onPlayerQuit: " + playerId + " " + exitType + " " + reason);
    }

    static void onPlayerSpawn(int playerId) {
        System.out.println("incoming onPlayerSpawn: " + playerId);
    }

    static void onPlayerChat(int playerId, String text) {
        System.out.println("incoming onPlayerChat:" + playerId + " " + text);
        PlayerNative.outputChatBox(playerId, text);
    }

    static void onPlayerEnterVehicle(int playerId, int vehicleId, int seatId) {
        System.out.println("incoming onPlayerEnterVehicle: " + playerId + " " + vehicleId + " " + seatId);
    }

    static void onPlayerEnteredVehicle(int playerId, int vehicleId, int seatId) {
        System.out.println("incoming onPlayerEnteredVehicle: " + playerId + " " + vehicleId + " " + seatId);
    }

    static void onPlayerExitVehicle(int playerId, int vehicleId) {
        System.out.println("incoming onPlayerExitVehicle: " + playerId + " " + vehicleId);
    }

    static void onPlayerDeath(int playerId, int reason, int killerId) {
        System.out.println("incoming onPlayerDeath: " + playerId + " "+ reason + " "+ killerId);
    }
}
