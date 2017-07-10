package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class BetweenTwoSetsKtTest {

    @Test
    fun countBetweenSets1() {
        val a = arrayOf<Long>(2, 4)
        val b = arrayOf<Long>(16, 32, 96)

        assertEquals(3, countBetweenSets(a, b))
    }

    @Test
    fun countBetweenSets2() {
        val a = arrayOf<Long>(100, 99, 98, 97, 96, 95, 94, 93, 92, 91)
        val b = arrayOf<Long>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        assertEquals(0, countBetweenSets(a, b))
    }
}