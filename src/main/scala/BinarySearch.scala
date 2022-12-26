//package com.techsophy
//
//object BinarySearch extends App {
//
//  def binSearch(list: List[Int], key: Int): Int = {
//    def inner(L: Int, H: Int): Int = {
//      val mid = (L + H) / 2
//      if (L > H) throw new NoSuchElementException
//      else if (list(mid) == key) mid
//      else if (list(mid) < key) inner(mid + 1, H)
//      else inner(L, mid - 1)
//
//    }
//
//    inner(0, list.length - 1)
//  }
//
//  def binSearch_v2(list: List[Int], key: Int): Boolean = {
//    val mid = list.length / 2
//    if (list.isEmpty) false
//    else {
//      if (list(mid) == key) true
//      else if (list(mid) < key) binSearch_v2(list.slice(mid + 1, list.length), key)
//      else binSearch_v2(list.slice(0, mid - 1), key)
//    }
//  }
//
//
//  println(binSearch()inSearch(List(1, 2, 3, 4, 5), 5))
//  println(binSearch_v2(List(1, 2, 3, 4, 5), 5))
//
//}
