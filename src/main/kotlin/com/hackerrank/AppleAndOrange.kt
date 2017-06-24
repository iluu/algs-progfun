package com.hackerrank

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val s = scan.nextInt()
    val t = scan.nextInt()

    val a = scan.nextInt()
    val b = scan.nextInt()

    val m = scan.nextInt()
    val n = scan.nextInt()

    val apples = arrayListOf<Int>()
    val oranges = arrayListOf<Int>()

    for (i in 1..m)
        apples.add(scan.nextInt())

    for (i in 1..n)
        oranges.add(scan.nextInt())

    println(onTheHouse(apples, s, t, a))
    println(onTheHouse(oranges, s, t, b))
}

fun onTheHouse(fruits: ArrayList<Int>, s: Int, t: Int, tree: Int): Int {
    return fruits.count { tree + it in (s..t) }
}