package com.hackerrank

import canJumpToSameLocation
import org.junit.Test
import kotlin.test.assertEquals

class KangarooTest {

    @Test
    fun shouldNotJumpToSameLocation() {
        assertEquals("NO", canJumpToSameLocation(0, 2, 5, 3))
    }

    @Test
    fun shouldJumpToSameLocation() {
        assertEquals("YES", canJumpToSameLocation(0, 3, 4, 3))
    }
}