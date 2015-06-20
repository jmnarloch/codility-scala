package com.codility.lessons

import scala.collection.mutable.Stack

/**
 * Fish
 */
object Fish {

  def solution(A: Array[Int], B: Array[Int]): Int = {

    val stack = new Stack[Int]
    var survived = 0

    for (ind <- A.indices) {
      B(ind) match {
        case 0 =>
          while (stack.nonEmpty && stack.top < A(ind)) {
            stack.pop()
          }

          if (stack.isEmpty) {
            survived += 1
          }
        case 1 =>
          stack.push(A(ind))
      }
    }
    survived + stack.size
  }
}
