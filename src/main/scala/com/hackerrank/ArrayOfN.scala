package com.hackerrank

object ArrayOfN {

  def f(num: Int): List[Int] = if (num == 0) List() else num :: f(num - 1)

}
