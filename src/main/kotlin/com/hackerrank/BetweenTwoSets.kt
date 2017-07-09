package com.hackerrank

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val m = scan.nextInt()

    val a = Array(n, { scan.nextLong() })
    val b = Array(m, { scan.nextLong() })

    print(countBetweenSets(a, b))
}

fun countBetweenSets(a: Array<Long>, b: Array<Long>): Int {
    val l = a.reduce { i, j -> i * (j / gcd(i, j)) }
    val g = b.reduce { i, j -> gcd(i, j) }

    var result = 0
    var multiple = 1
    for (i in l..g step l * multiple) {
        if (g % i == 0L) {
            result++
        }
        multiple++
    }
    return result
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}
