package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val arr = Array(100, { 0 })

    for (i in 0..n - 1) {
        val value = scan.nextInt()
        arr[value]++
    }

    print(countPickedNumbers(arr))
}

fun countPickedNumbers(arr: Array<Int>): Int {
    return (0..arr.size - 2)
            .map { arr[it] + arr[it + 1] }
            .max()
            ?: 0
}
