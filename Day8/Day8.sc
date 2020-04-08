import java.util.{Optional, OptionalInt}

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *
 * }
 */
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object Solution {
  def middleNode(head: ListNode): ListNode = {
    checkNode(head, 0)._2
  }

  def checkNode(node: ListNode, index: Int ): (Int, ListNode) = {
    node.next match {
      case null => (index + 1,node)
      case _ => {
        val result = checkNode(node.next, index + 1)
        if(Math.round(result._1/2) == index) {
           return (result._1,node)
        }
        result
      }
    }
  }
}