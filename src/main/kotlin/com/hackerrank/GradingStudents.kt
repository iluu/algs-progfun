package com.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextInt()
    val grades = Array(n, { scan.nextInt() })
    for (grade in grades)
        println(roundGrade(grade))
}

fun roundGrade(grade: Int): Int {
    val diff = 5 - grade % 5
    if (grade < 38 || diff >= 3) {
        return grade
    }

    return grade + diff
}
