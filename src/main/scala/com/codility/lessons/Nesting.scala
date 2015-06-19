package com.codility.lessons

/**
 * Nesting
 */
object Nesting {

  def solution(S: String): Int = {

    var nested = 0
    for (ch: Char <- S
         if nested >= 0) {
      nested += (ch match {
        case '(' => 1
        case ')' => -1
      })
    }

    if (nested == 0) 1 else 0
  }
}
