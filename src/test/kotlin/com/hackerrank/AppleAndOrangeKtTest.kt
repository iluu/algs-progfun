package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class AppleAndOrangeKtTest {

    @Test
    fun shouldCountApplesOnTheHouse() {
        val apples = arrayListOf(-2, 2, 1)
        assertEquals(onTheHouse(apples, 7, 11, 5), 1)
    }

    @Test
    fun shouldCountOrangesOnTheHouse() {
        val apples = arrayListOf(5, -6)
        assertEquals(onTheHouse(apples, 7, 11, 15), 1)
    }
}

