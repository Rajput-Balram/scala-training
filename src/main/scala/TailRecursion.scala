package com.techsophy

object TailRecursion extends App {

  /*
  Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13.....
  * */

  def FibTail(no: Int): Int = {
    def Inner(i: Int, a: Int, b: Int): Int = {
      println(s"i:$i, a:$a, b:$b")
      if (i == no) a else Inner(i + 1, b, a + b)
    }

    Inner(0, 0, 1)
  }


  def FactTail(no: Int): Int = {
    def Inner(no: Int, res: Int): Int = {
      if (no <= 1) res else Inner(no - 1, no * res)
    }

    Inner(no, 1)
  }

  println(FibTail(1))
  println(FactTail(5))
}
