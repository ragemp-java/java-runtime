/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.vehicle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VehicleEvents {

    private VehicleEvents() {}

    static void onVehicleCreated(int vehicleId) {
        log.debug("incoming onVehicleCreated: {}", vehicleId);
    }

    static void onVehicleDestroyed(int vehicleId) {
        log.debug("incoming onVehicleDestroyed: {}", vehicleId);
    }

    static void onVehicleDeath(int vehicleId, int hash, int killerId) {
        log.debug("incoming onVehicleDeath: {} {} {}", vehicleId, hash, killerId);
    }

    static void onVehicleModelChange(int vehicleId, int oldModelHash) {
        log.debug("incoming onVehicleModelChange: {} {}", vehicleId, oldModelHash);
    }

    static void onVehicleSirenToggle(int vehicleId, boolean toggle) {
        log.debug("onVehicleSirenToggle: {} {}", vehicleId, toggle);
    }

    static void onVehicleHornToggle(int vehicleId, boolean toggle) {
        log.debug("onVehicleHornTog gle: {} {}", vehicleId, toggle);
    }

    static void onVehicleTrailerAttached(int vehicleId, int trailerId) {
        log.debug("onVehicleTrailerAttached: {} {}", vehicleId, trailerId);
    }

    static void onVehicleDamage(int vehicleId, float bodyHealthLoss, float engineHealthLoss) {
        log.debug("onVehicleDamage: {} {} {}", vehicleId, bodyHealthLoss, engineHealthLoss);
    }
}
