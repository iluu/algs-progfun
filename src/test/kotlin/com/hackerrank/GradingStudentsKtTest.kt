package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class GradingStudentsKtTest {

    @Test
    fun shouldRoundGrade() {
        assertEquals(85, roundGrade(84))
    }

    @Test
    fun shouldNotRoundGrade() {
        assertEquals(67, roundGrade(67))
    }
}