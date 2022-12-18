package com.techsophy

object FindLast extends App {


  def FindLast(list: List[Int]): Int = {

    var last: Int = 0
    for (a <- list) {
      last = a
    }
    last
  }


  def FindLast_v2(list: List[Int]): Int = list match {
    case head :: Nil => head
    case _ :: tail => FindLast_v2(tail)
    case _ => throw new NoSuchElementException
  }


  println(FindLast(List(1, 2, 3, 4, 5)))
  println(FindLast(List(1)))
  println(FindLast_v2(List(1, 2, 3, 4, 5)))
  println(FindLast_v2(List(1, 2, 3)))
  println(FindLast_v2(List(0)))
  //  println(FindLast(List(List.empty))

}
