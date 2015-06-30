package com.codility.lessons

import scala.annotation.tailrec

/**
 * MaxSliceSum
 */
object MaxSliceSum {

  def solution(A: Array[Int]): Int = {
    @tailrec
    def s(A: Array[Int], ind: Int, maxSlice: Int, max: Int): Int = {
      if (ind >= A.length) {
        max
      } else {
        val slice = math.max(A(ind), maxSlice + A(ind))
        s(A, ind + 1, slice, math.max(max, slice))
      }
    }

    s(A, 1, A(0), A(0))
  }
}
