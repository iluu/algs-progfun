package com.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class ConnectedCellsInAGridKtTest {

    @Test
    fun sizeOfMaxRegionCase1() {
        val arr = arrayOf(
                arrayOf(1, 1, 0, 0),
                arrayOf(0, 1, 1, 0),
                arrayOf(0, 0, 1, 0),
                arrayOf(1, 0, 0, 0)
        )
        val board = Board(arr, 4, 4)

        assertEquals(5, sizeOfMaxRegion(board))
    }
}

