package com.hackerrank

object ListReplication {

  def main(args: Array[String]): Unit = {
    print(f(5, List(1, 3, 4)))
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    def iter(num: Int, x: Int, acc: List[Int]): List[Int] = {
      if (num == 0) acc
      else iter(num - 1, x, x :: acc)
    }

    arr.flatMap(x => iter(num, x, List()))
  }

}
