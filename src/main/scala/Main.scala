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

  /*
  Palindrome check function
  * */
  def PalindromeCheck(no: Int): Boolean = {

    var isPalindrom: Boolean = true
    if (no < 10 && no > -1) {
      isPalindrom = true

    } else {
      val inp: String = no.toString
      val len = inp.length

      for (i <- 0 until len / 2) {
        if (inp.charAt(i) != inp.charAt((len - i) - 1)) {
          isPalindrom = false
        }
      }
    }
    isPalindrom
  }


  def main(args: Array[String]): Unit = {

    println(isEvenOrOdd(12))

    println(fact(5))
    println(PalindromeCheck(11))
  }
}