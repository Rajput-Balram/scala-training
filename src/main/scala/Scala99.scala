package com.techsophy

object Scala99 extends App {


  def FindLast(list: List[Int]): Int = {

    var last: Int = 0
    for (a <- list) {
      last = a
    }
    last
  }

  println(FindLast(List(1, 2, 3, 4, 5)))
  println(FindLast(List(1)))
//  println(FindLast(List(List.empty))

}
