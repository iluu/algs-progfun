package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextInt()
    for (i in 1..t) {
        val n = scan.nextInt()
        val m = scan.nextInt()
        val s = scan.nextInt()

        println(poisonedSweet(n, m, s))
    }
}

fun poisonedSweet(n: Int, m: Int, s: Int): Int {
    val idx = (s - 1 + m) % n
    return if (idx == 0) n else idx
}
