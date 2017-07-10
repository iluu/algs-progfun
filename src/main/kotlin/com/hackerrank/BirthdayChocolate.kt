package com.hackerrank

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val squares = Array(n, { scan.nextInt() })
    val d = scan.nextInt()
    val m = scan.nextInt()

    print(countChocolate(d, m, squares))

}

fun countChocolate(d: Int, m: Int, squares: Array<Int>): kotlin.Int {
    return (0..squares.size - m)
            .map { i -> (i..i + m - 1).sumBy { squares[it] } }
            .count { it == d }
}