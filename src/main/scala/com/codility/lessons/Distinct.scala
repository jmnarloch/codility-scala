package com.codility.lessons

/**
 * Distinct
 */
object Distinct {

  def solution(A: Array[Int]): Int = {

    if(A.length == 0) {
      return 0
    }

    val sorted = A.sorted
    var distinct = 1
    for(ind <- 1 until sorted.length) {
      if(sorted(ind) != sorted(ind - 1)) {
        distinct += 1
      }
    }
    return distinct
  }
}
