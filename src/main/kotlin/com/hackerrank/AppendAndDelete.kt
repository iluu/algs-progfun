package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.next()
    val t = scan.next()
    val k = scan.nextInt()

    println(if (canTransform(s, t, k)) "Yes" else "No")
}

fun canTransform(s: String, t: String, k: Int): Boolean {
    val commonPrefix = t.commonPrefixWith(s)
    val diff = t.length + s.length - commonPrefix.length * 2
    return k >= diff && (diff % 2 == k % 2) || s.length + t.length < k
}
