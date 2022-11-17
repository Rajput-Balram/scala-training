package com.techsophy

object Main {
  /*
  Even Odd check function
  * */
  def isEvenOrOdd(no: Int): String = {
    val res: String = if (no == 0) "none" else if (no % 2 == 0) "Even" else "Odd"
    res
  }

  /*
  factorial find function
  * */

  def fact(inp: Int): Long = {
    var no: Int = inp
    var res: Long = 1

    if (no == 0 || no == 1) {
      res = 1
    } else {
      while (no > 1) {
        res = res * no
        no -= 1
      }
    }
    res
  }


  def main(args: Array[String]): Unit = {

    println(isEvenOrOdd(12))
    println(isEvenOrOdd(1))
    println(isEvenOrOdd(0))
    println(fact(5))
  }
}