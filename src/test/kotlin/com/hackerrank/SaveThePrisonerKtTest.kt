package com.hackerrank

import org.junit.Assert.assertEquals
import org.junit.Test

class SaveThePrisonerKtTest {

    @Test
    fun poisonedSweetSimpleCase2() {
        assertEquals(2, poisonedSweet(5, 2, 1))
    }

    @Test
    fun poisonedSweetSimpleCase3() {
        assertEquals(3, poisonedSweet(5, 2, 2))
    }

    @Test
    fun poisonedSweetSimpleCase4() {
        assertEquals(5, poisonedSweet(5, 4, 2))
    }
}

