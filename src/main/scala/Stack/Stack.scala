package com.techsophy
package Stack

import LinkedList.LinkedList.ListNode

object Stack extends App {

  class StackNode(var data: Int, var next: StackNode = null)

  class Stack {
    var head: StackNode = null
    var tail: StackNode = null

    def push(elm: Int) = {
      if (head == null) {
        head = new StackNode(data = elm)
        tail = head
      } else {
        //        var temp: StackNode = head
        //        while (temp.next != null) {
        //          temp = temp.next
        //        }
        //        temp.next = new StackNode(data = elm)

        tail.next = new StackNode(data = elm)
        tail = tail.next
      }
    }

    def pull() = {
      var curr = head
      //      var prev: StackNode = null
      if (curr == null) println("stack is Empty")
      else if (curr.next == null) {
        println(s"element ${curr.data} pulled")
        curr = null
        tail = null
        head = null
      } else {

        while (curr.next.next != null) {
          curr = curr.next
        }
        println(s" element ${curr.next.data} pulled")
        curr.next = null
        tail = curr
      }
    }

    def printStack() = {
      var temp = head
      while (temp != tail) {
        print(s"${temp.data}-> ")
        temp = temp.next
      }
      print(s"${temp.data}")
    }

  }

  val stackobj: Stack = new Stack
  stackobj.push(1)
  stackobj.push(2)
  stackobj.push(3)
  stackobj.printStack()
  stackobj.pull()
  stackobj.printStack()

}
