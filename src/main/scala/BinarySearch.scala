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


  println(BinSearch(List(1, 2, 3, 4, 5), 5))

}
