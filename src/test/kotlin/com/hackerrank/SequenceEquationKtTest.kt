package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class SequenceEquationKtTest {

    @Test
    fun calculateEquation1() {
        assertEquals("2\n3\n1", calculateEquation(arrayOf(2, 3, 1)))
    }
}