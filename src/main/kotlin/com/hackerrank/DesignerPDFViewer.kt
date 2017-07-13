package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val dict = Array(26, { scan.nextInt() })
    val word = scan.next()

    println(calculateRectangle(word, dict))
}

fun calculateRectangle(word: String, dict: Array<Int>): Int {
    return word.map { dict[it.toInt() - 'a'.toInt()] }.max()!! * word.length
}
