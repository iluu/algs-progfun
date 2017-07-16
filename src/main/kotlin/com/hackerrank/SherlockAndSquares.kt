package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    (0..t).forEach { println(squares(scan.nextDouble(), scan.nextDouble()).toInt()) }
}

fun squares(from: Double, to: Double): Double {
    return (Math.floor(Math.sqrt(to)) - Math.ceil(Math.sqrt(from)) + 1)
}
