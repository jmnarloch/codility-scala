package com.codility.lessons

/**
 * FrogRiverOne
 */
object FrogRiverOne {

  def solution(X: Int, A: Array[Int]): Int = {

    val N = A.length
    val leaves = Array.fill(X){-1}

    for (ind <- A.indices) {
      if(leaves(A(ind) - 1) == -1) {
        leaves(A(ind) - 1) = ind
      }
    }

    var min = -1
    for (t <- leaves) {
      if(t == -1) {
        return -1
      }
      min = math.max(min, t)
    }
    min
  }
}
