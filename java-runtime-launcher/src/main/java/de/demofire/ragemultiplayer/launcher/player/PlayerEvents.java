package de.demofire.ragemultiplayer.launcher.player;

/**
 * @author Noxaro
 */
@SuppressWarnings("unused")
public class PlayerEvents {

    static void onPlayerJoin(int playerId) {
        System.out.println("incoming playerJoinEvent: " + playerId);
    }

    static void onPlayerCommand(int playerId, String command ) {
        System.out.println("incoming onPlayerCommandEvent: " + playerId + " " + command);
    }

    static void onPlayerQuit(int playerId, int exitType, String reason) {
        System.out.println("incoming onPlayerQuit: " + playerId + " " + exitType + " " + reason);
    }

    static void onPlayerSpawn(int playerId) {
        System.out.println("incoming onPlayerSpawn: " + playerId);
    }

    static void onPlayerChat(int playerId, String text) {
        System.out.println("incoming onPlayerChat:" + playerId + " " + text);
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
