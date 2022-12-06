package com.techsophy

object factorial extends App {

  def fact(no: Int): BigInt = {
    if (no <= 1) 1 else no * fact(no - 1)
  }

  def fibSeri(no: Int): Int = {
    def fibItr(i: Int, a: Int, b: Int): Int = {
      if (no == i) a else fibItr(i + 1, b, a + b)
    }
    fibItr(0, 0, 1)
  }

//  def factRec

  println(fact(1000))
//  println(fact(5))

//  println(fibSeri(1))
}
