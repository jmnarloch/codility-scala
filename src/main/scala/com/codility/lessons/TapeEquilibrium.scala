package com.codility.lessons

/**
 * TapeEquilibrium
 */
object TapeEquilibrium {

  def solution(A: Array[Int]): Int = {

    val N = A.length
    val sum = A.sum

    var left = sum - A(N - 1)
    var right = A(N - 1)
    var min = math.abs(left - right)

    for (ind <- N - 2 to 1 by -1) {

      left -= A(ind)
      right += A(ind)

      min = math.min(min, math.abs(left - right))
    }
    min
  }
}
