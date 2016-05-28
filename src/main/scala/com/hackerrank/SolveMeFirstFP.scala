package com.hackerrank

import scala.io.Source.stdin

object SolveMeFirstFP {

  def main(args: Array[String]) {
    println(stdin.getLines().take(2).map(_.toInt).sum)
    helloWorldN(5)
  }

  def helloWorldN(n: Int) = List.range(0, n).map(_ -> println("HelloWorld"))

}

