package com.techsophy

object Main {

  def isEvenOrOdd(no: Int): String = {
    val res: String = if (no == 0) "none" else if (no % 2 == 0) "Even" else "Odd"
    res
  }

  def main(args: Array[String]): Unit = {

    println(isEvenOrOdd(12))
    println(isEvenOrOdd(1))
    println(isEvenOrOdd(0))
  }
}