package com.techsophy

object BirwiseAdd extends App {
  def bitwiseAdd(val1: Int, val2: Int): Int = {
    var carry = 0

    var a = val1
    var b = val2
    while (b != 0) {
      carry = a & b   //=>3
      a = a ^ b       //=>1
      b = carry << 1  //=>
    }
    a

  }

  println(bitwiseAdd(3, 3))
  println(3&2)
}
/*
*
*  0 0 1 1
*  0 0 1 0
* --------
 & 0 0 1 0
*
*  0 0 1 1
*  0 0 1 0
* --------
 ^ 0 0 0 1
*/
