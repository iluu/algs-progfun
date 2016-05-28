package com.hackerrank

object FilterArray {

  def main(args: Array[String]) {
    print(f(5, List(1, 3, 5, 7)))
  }

  def f(delim: Int, arr: List[Int]): List[Int] = arr.filter(_ <= delim)

}
