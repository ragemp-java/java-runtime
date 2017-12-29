/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.game.checkpoint

import mp.rage.api.checkpoint.Checkpoint
import mp.rage.api.color.RGBAColor
import mp.rage.api.entity.EntityType
import mp.rage.api.player.Player
import mp.rage.api.vector.Vector3
import mp.rage.launcher.checkpoint.CheckpointNative

class CheckpointImpl(val checkpointId: Int) : Checkpoint {
    override fun create(type: Int, position: Vector3, nextPosition: Vector3, radius: Float, rgbaColor: RGBAColor, visible: Boolean, dimension: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getColour(): RGBAColor {
        return CheckpointNative.getColour(checkpointId);
    }

    override fun setColour(rgbaColor: RGBAColor) {
        CheckpointNative.setColour(checkpointId, rgbaColor.red, rgbaColor.green, rgbaColor.blue, rgbaColor.alpha)
    }

    override fun getDirection(): Vector3 {
        return CheckpointNative.getDirection(checkpointId)
    }

    override fun setDirection(direction: Vector3) {
        CheckpointNative.setDirection(checkpointId, direction.x, direction.y, direction.z)
    }

    override fun getRadius(): Float {
        return CheckpointNative.getRadius(checkpointId)
    }

    override fun setRadius(radius: Float) {
        CheckpointNative.setRadius(checkpointId, radius)
    }

    override fun isVisible(): Boolean {
        return CheckpointNative.isVisible(checkpointId)
    }

    override fun setVisible(toggle: Boolean) {
        CheckpointNative.setVisible(checkpointId, toggle)
    }

    override fun showFor(players: List<Player>) {
        val ids = players.map { player -> player.getId() }
        CheckpointNative.showFor(checkpointId, ids.toIntArray())
    }

    override fun hideFor(players: List<Player>) {
        val ids = players.map { player -> player.getId() }
        CheckpointNative.hideFor(checkpointId, ids.toIntArray())
    }

    override fun getId(): Int {
        return checkpointId
    }

    override fun getType(): EntityType {
        return EntityType.values()[CheckpointNative.getType(checkpointId)]
    }

    override fun destroy() {
        CheckpointNative.destroy(checkpointId)
    }

    override fun getDimension(): Int {
        return CheckpointNative.getDimension(checkpointId)
    }

    override fun setDimension(dimensionId: Int) {
        CheckpointNative.setDimension(checkpointId, dimensionId)
    }

    override fun getPosition(): Vector3 {
        return CheckpointNative.getPosition(checkpointId)
    }

    override fun setPosition(vector3: Vector3) {
        CheckpointNative.setPosition(checkpointId, vector3.x, vector3.y, vector3.z)
    }

    override fun getRotation(): Vector3 {
        return CheckpointNative.getRotation(checkpointId)
    }

    override fun setRotation(vector3: Vector3) {
        CheckpointNative.setRotation(checkpointId, vector3.x, vector3.y, vector3.z)
    }

    override fun getModel(): Int {
        return CheckpointNative.getModel(checkpointId)
    }

    override fun setModel(modelId: Int) {
        CheckpointNative.setModel(checkpointId, modelId)
    }

    override fun getVelocity(): Vector3 {
        return CheckpointNative.getVelocity(checkpointId)
    }

    override fun getAlpha(): Int {
        return CheckpointNative.getAlpha(checkpointId)
    }

    override fun setAlpha(alpha: Int) {
        CheckpointNative.setAlpha(checkpointId, alpha)
    }
}