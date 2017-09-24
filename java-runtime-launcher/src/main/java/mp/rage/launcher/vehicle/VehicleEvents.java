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

    public static void onVehicleDeath(int vehicleId, int hash, int killerId) {
        log.debug("incoming onVehicleDeath: {} {} {}", vehicleId, hash, killerId);
    }
}
