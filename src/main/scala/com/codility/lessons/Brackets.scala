package com.codility.lessons

import scala.collection.mutable

/**
 * Brackets
 */
object Brackets {

  def solution(S: String): Int = {

    val brackets = Map(
      '(' -> ')',
      '{' -> '}',
      '[' -> ']'
    )

    val stack = new mutable.Stack[Char]

    for(ch <- S) {
      if(brackets.contains(ch)) {
        stack.push(ch)
      } else if(stack.isEmpty || brackets.get(stack.top).get != ch) {
         return 0
      } else {
        stack.pop()
      }
    }
    if(stack.isEmpty) 1 else 0
  }
}
