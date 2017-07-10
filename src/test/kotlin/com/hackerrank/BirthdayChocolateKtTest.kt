package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class BirthdayChocolateKtTest {
    @Test
    fun countChocolate1() {
        assertEquals(2, countChocolate(3, 2, arrayOf(1, 2, 1, 3, 2)))
    }

    @Test
    fun countChocolate2() {
        assertEquals(0, countChocolate(3, 2, arrayOf(1, 1, 1, 1, 1)))
    }

    @Test
    fun countChocolate3() {
        assertEquals(1, countChocolate(4, 1, arrayOf(4)))
    }
}