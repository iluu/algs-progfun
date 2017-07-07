package com.hackerrank

object SimpleArraySum2 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    var result = 0
    for(_ <- 0 until n) {
      result += sc.nextInt()
    }

    println(result)
  }
}
