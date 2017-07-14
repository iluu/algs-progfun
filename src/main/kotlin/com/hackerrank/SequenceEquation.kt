package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val arr = Array(n, { scan.nextInt() })

    print(calculateEquation(arr))
}

fun calculateEquation(arr: Array<Int>): String {
    val sb = StringBuilder()
    (1..arr.size)
            .map { arr.indexOf(it) + 1 }
            .map { arr.indexOf(it) + 1 }
            .forEach { sb.append(it).append("\n") }
    return sb.toString().trim()
}
