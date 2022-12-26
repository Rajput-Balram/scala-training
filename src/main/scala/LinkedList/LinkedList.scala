package com.techsophy
package LinkedList


object LinkedList extends App {
  class ListNode(var data: Int, var next: ListNode = null)

  class LinkedList {
    var head: ListNode = null

    def addFirst(ele: Int) = {
      head = new ListNode(data = ele, head)

    }

    def addLast(elm: Int) = {
      if (head == null) {
        head = new ListNode(data = elm)

      } else {
        var temp: ListNode = head
        while (temp.next != null) {
          temp = temp.next
        }
        temp.next = new ListNode(data = elm)
      }
    }

    def deleteNode(elm: Int): Unit = {
      var tempHead = head
      var prevNode: ListNode = null
      while (tempHead.next != null) {
        if (tempHead.data == elm) {
          println(s"element: ${tempHead.data} deleted")
          tempHead = tempHead.next
          return (head = tempHead)
        }
        else {
          prevNode = tempHead
          tempHead = tempHead.next

        }

      }


    }

    def printList(head: ListNode): Any = {
      var temp: ListNode = head
      while (temp.next != null) {
        print(s"${temp.data}")
        temp = temp.next
      }
    }
  }


  //  addEle(10)
  //  printList(addEle(20))
}

