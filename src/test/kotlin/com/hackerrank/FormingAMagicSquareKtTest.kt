package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class FormingAMagicSquareKtTest {

    @Test
    fun minimalCostTest1() {
        val input = intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 5)
        assertEquals(1, minimalCost(input))
    }

    @Test
    fun minimalCostTest2() {
        val input = intArrayOf(4, 8, 2, 4, 5, 7, 6, 1, 6)
        assertEquals(4, minimalCost(input))
    }
}