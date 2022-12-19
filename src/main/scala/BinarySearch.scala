package com.techsophy

object BinarySearch extends App {

  def BinSearch(list: List[Int], key: Int): Int = {
    def inner(L: Int, H: Int): Int = {
      var mid = (L + H) / 2
      if (L > H) throw new NoSuchElementException
      else if (list(mid) == key) mid
      else if (list(mid) < key) inner(mid + 1, H)
      else inner(L, mid - 1)

    }

    inner(0, list.length - 1)
  }

  def BinSearch_v2(list: List[Int], key: Int): Boolean = {
    def inner(list: List[Int]): Boolean = {
      var mid = list.length / 2
      if (list(mid) == key) true
      else if (list(mid) < key) inner(list.slice(mid + 1, list.length))
      else if (list(mid) > key) inner(list.slice(0, mid - 1))
      else throw new NoSuchElementException
    }

    inner(list)
  }


  println(BinSearch(List(1, 2, 3, 4, 5), 5))
  println(BinSearch_v2(List(1, 2, 3, 4, 5), 5))

}
