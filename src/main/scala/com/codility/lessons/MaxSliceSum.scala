package com.codility.lessons

import scala.annotation.tailrec

/**
 * MaxSliceSum
 */
object MaxSliceSum {

  def solution(A: Array[Int]): Int = {

    solution(A, 1, A(0), A(0))
  }

  @tailrec
  def solution(A: Array[Int], ind: Int, maxSlice: Int, max: Int): Int = {

    if(ind >= A.length) {
      return max
    }
    val slice = math.max(A(ind), maxSlice + A(ind))
    solution(A, ind + 1, slice, math.max(max, slice))
  }
}
