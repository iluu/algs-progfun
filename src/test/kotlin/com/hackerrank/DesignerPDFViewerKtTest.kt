package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class DesignerPDFViewerKtTest {

    @Test
    fun calculateRectangle1() {
        val arr = arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5)
        assertEquals(9, calculateRectangle("abc", arr))
    }
}
