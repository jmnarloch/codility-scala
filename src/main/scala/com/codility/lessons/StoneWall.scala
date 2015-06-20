package com.codility.lessons

import scala.collection.mutable

/**
 * StoneWall
 */
object StoneWall {

  def solution(H: Array[Int]): Int = {

    val stack = new mutable.Stack[Int]
    var blocks = 0

    for(h <- H) {

      while(stack.nonEmpty && stack.top > h) {
        stack.pop()
      }

      if(stack.isEmpty || stack.top != h) {
        stack.push(h)
        blocks += 1
      }
    }
    blocks
  }
}
