package com.codility.lessons

/**
 * MaxProfit
 */
object MaxProfit {

  def solution(A: Array[Int]): Int = {

    if (A == null || A.length == 0) {
      return 0
    }

    var prev = A(0)
    for (ind <- A.indices) {
      val next = A(ind)
      A(ind) -= prev
      prev = next
    }

    var maxProfit = 0
    var maxSlice = 0

    for (ind <- 1 until A.length) {

      maxSlice = math.max(0, maxSlice + A(ind))
      maxProfit = math.max(maxProfit, maxSlice)
    }
    maxProfit
  }
}
