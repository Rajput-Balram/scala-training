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

  /*
  * Prime No check
  * */
  def primeCheck(no: Int): Boolean = {
    //    var isPrime = false
    if (no <= 1) return false
    if (no == 2 || no == 3) return true
    if (no % 2 == 0 || no % 3 == 0) return false

    for (i <- 5 to Math.sqrt(no).toInt) {
      if (no % i == 0) return false
    }
    true
  }


  def main(args: Array[String]): Unit = {

    println(isEvenOrOdd(12))

    println(fact(5))
    println(PalindromeCheck(11))

    println(s"prime test ${primeCheck(4)}")
  }
}