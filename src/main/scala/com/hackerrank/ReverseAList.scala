package com.hackerrank

object ReverseAList {

  def f(arr: List[Int]): List[Int] = arr match {
    case List() => List()
    case head :: tail => f(tail) :+ head
  }

}
