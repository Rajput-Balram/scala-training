package com.techsophy

object factorial extends App {

  def fact(no: Int): Long = {
    if (no <= 1) 1 else no * fact(no - 1)
  }

  def fibSeri(no: Int): Int = {
    def fibItr(i: Int, a: Int, b: Int): Int = {
      if (no == i) a else fibItr(i + 1, b, a + b)
    }
    fibItr(0, 0, 1)
  }

  println(fact(2))
  println(fact(5))

  println(fibSeri(1))
}
