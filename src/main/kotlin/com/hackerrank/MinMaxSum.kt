package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = Array(5, { scan.nextLong() })

    val sum = arr.sum()
    val min = sum - arr.max()!!
    val max = sum - arr.min()!!
    println("$min $max")
}
