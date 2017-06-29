package com.hackerrank

import java.util.*

val magicSquares = arrayOf(
        intArrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
        intArrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
        intArrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
        intArrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
        intArrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4),
        intArrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
        intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
        intArrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8))

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = IntArray(9)

    for (i in 0..2) {
        for (j in 0..2) {
            arr[i * 3 + j] = scan.nextInt()
        }
    }

    println(minimalCost(arr))
}

fun minimalCost(arr: IntArray): Int {
    return magicSquares.map {
        arr.zip(it)
                .filter { (first, second) -> first != second }
                .sumBy { (first, second) -> Math.abs(first - second) }
    }.min()!!
}

