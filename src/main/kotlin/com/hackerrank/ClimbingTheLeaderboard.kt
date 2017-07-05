package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextInt()
    val scores = Stack<Int>()
    for (i in 0..n - 1) {
        val score = scan.nextInt()
        if (i == 0 || scores.peek() != score) {
            scores.push(score)
        }
    }

    val m = scan.nextInt()
    for (i in 0..m - 1) {
        val alice = scan.nextInt()
        while (!scores.empty() && scores.peek() <= alice) {
            scores.pop()
        }
        println(if (scores.isEmpty()) "1" else scores.size + 1)
    }
}