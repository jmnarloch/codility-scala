package com.codility.lessons

/**
 * Triangle
 */
object Triangle {

  def solution(A: Array[Int]): Int = {

    val S = A.sorted
    val L = new Array[Long](A.length)
    for (ind <- S.indices) {
      L(ind) = S(ind).toLong
    }

    for (ind <- 2 until A.length) {
      if (L(ind - 2) + L(ind - 1) > L(ind)
        && L(ind - 2) + L(ind) > L(ind - 1)
        && L(ind - 1) + L(ind) > L(ind - 2)) {
        return 1
      }
    }
    return 0
  }
}
