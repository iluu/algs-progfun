package com.hackerrank

object FilterByPosition {

  def main(args: Array[String]) {
    println(f(List(1, 2, 3, 4, 5, 6)))
  }

  def f(arr: List[Int]): List[Int] = {
    def iter(idx: Int, acc: List[Int]): List[Int] = {
      if (idx == arr.length) acc
      else if (idx % 2 == 1) iter(idx + 1, acc :+ arr(idx))
      else iter(idx + 1, acc)
    }

    iter(0, List())
  }

}
