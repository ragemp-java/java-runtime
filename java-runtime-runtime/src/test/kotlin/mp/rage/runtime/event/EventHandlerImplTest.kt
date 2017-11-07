/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.event

import com.nhaarman.mockito_kotlin.spy
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import mp.rage.api.exception.game.InvalidEventSubscriptionException
import mp.rage.api.player.event.PlayerJoinEvent
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.Test


internal class EventHandlerImplTest {

    @Test
    fun canFindAnnotatedMethod() {
        // GIVEN
        val eventHandlerImpl = EventHandlerImpl(SingleEventDispatcher())
        val validEventClass = spy(ValidEventClass())

        // WHEN
        eventHandlerImpl.registerEvents(validEventClass)
        val playerJoinEvent = PlayerJoinEvent("/test")
        eventHandlerImpl.postEvent(playerJoinEvent)

        // THEN
        verify(validEventClass, times(1)).testEvent(playerJoinEvent)
    }

    @Test
    fun rejectInvalidEventSubscription() {
        // GIVEN
        val eventHandlerImpl = EventHandlerImpl(ConcurrentEventDispatcher())

        // WHEN
        assertThatThrownBy {
            eventHandlerImpl.registerEvents(InvalidEventClass())
        }.isInstanceOf(InvalidEventSubscriptionException::class.java)
    }

}