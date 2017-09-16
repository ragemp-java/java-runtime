/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.plugin.java.launcher.colshape;

import mp.rage.plugin.java.api.vector.Vector3;
import mp.rage.plugin.java.launcher.EntityNative;

public class ColshapeNative extends EntityNative {
    public static native boolean IsPointWithin(int colshapeId, Vector3 position);
    public static native int GetShapeType(int colshapeId);
}
