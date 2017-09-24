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

import mp.rage.api.vector.Vector3;
import mp.rage.launcher.checkpoint.CheckpointNative;
import mp.rage.launcher.vehicle.VehicleNative;

@SuppressWarnings("unused")
public class PlayerEvents {

    static void onPlayerCreated(int playerId) {
        System.out.println("incoming onPlayerCreated: " + playerId);
    }

    static void onPlayerDestroyed(int playerId) {
        System.out.println("incoming onPlayerDestroyed: " + playerId);
    }

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
        } else if(command.equalsIgnoreCase("vehicle")) {
            Vector3 position = PlayerNative.getPosition(playerId);
            VehicleNative.create(418536135, position.getX() + 2, position.getY(), position.getZ(), 0F, 0);
        } else if(command.equalsIgnoreCase("getvehicle")) {
            int vehicle = PlayerNative.getVehicle(playerId);
            PlayerNative.outputChatBox(playerId, String.valueOf(vehicle));
        } else if(command.equalsIgnoreCase("putvehicle")) {
            PlayerNative.putIntoVehicle(playerId, 0, 0);
        } else if(command.equalsIgnoreCase("giveweapons")) {
            int[] weapons = {-1312131151, -1063057011};
            int[] ammo = {5, 10};
            PlayerNative.giveWeapons(playerId, weapons, ammo);
        } else if(command.equalsIgnoreCase("numberplate")) {
            VehicleNative.setNumberPlate(0, "KEK=TOBI");
        } else if(command.equalsIgnoreCase("neon")) {
            VehicleNative.setNeonsColour(0, 255, 0, 0);
            VehicleNative.enableNeons(0, true);
        } else if(command.equalsIgnoreCase("checkpoint")) {
            Vector3 position = PlayerNative.getPosition(0);
            CheckpointNative.create(1, position.getX(), position.getY(), position.getZ() -1,
                    position.getX() + 20, position.getY(), position.getZ(), 5F,
                    255, 0, 0, 255, true, 0);
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
