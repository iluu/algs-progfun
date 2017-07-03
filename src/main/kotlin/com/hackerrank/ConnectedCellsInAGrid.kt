package com.hackerrank

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val m = scan.nextInt()
    val arr = Array(n, { Array(m, { scan.nextInt() }) })

    println(sizeOfMaxRegion(Board(arr, n, m)))
}

fun sizeOfMaxRegion(board: Board): Int {
    var maxSize = 0
    for (i in 0..board.n - 1) {
        for (j in 0..board.m - 1) {
            val node = Pair(i, j)
            if (!board.wasVisited(node)) {
                val size = regionSize(node, board)
                if (size > maxSize) {
                    maxSize = size
                }
            }
        }
    }
    return maxSize
}

fun regionSize(node: Pair<Int, Int>, board: Board): Int {
    var region = if (board.isNode(node)) 1 else 0
    board.markVisited(node)
    board.neighbours(node)
            .map { regionSize(it, board) }
            .forEach { region += it }
    return region
}

class Board(val arr: Array<Array<Int>>, val n: Int, val m: Int) {
    private var visited = mutableSetOf<Pair<Int, Int>>()

    fun markVisited(node: Pair<Int, Int>) {
        visited.add(node)
    }

    fun neighbours(node: Pair<Int, Int>): List<Pair<Int, Int>> {
        val neighbours = setOf(
                Pair(node.first - 1, node.second - 1),
                Pair(node.first - 1, node.second),
                Pair(node.first - 1, node.second + 1),
                Pair(node.first, node.second - 1),
                Pair(node.first, node.second + 1),
                Pair(node.first + 1, node.second - 1),
                Pair(node.first + 1, node.second),
                Pair(node.first + 1, node.second + 1))

        return neighbours.filter { (first, second) -> valid(first, second) }
    }

    fun isNode(pair: Pair<Int, Int>): Boolean {
        return arr[pair.first][pair.second] == 1 && !wasVisited(pair)
    }

    fun wasVisited(pair: Pair<Int, Int>): Boolean {
        return visited.contains(pair)
    }

    private fun valid(row: Int, col: Int): Boolean {
        return row in 0..n - 1
                && col in 0..m - 1
                && arr[row][col] == 1
                && !wasVisited(Pair(row, col))
    }

}