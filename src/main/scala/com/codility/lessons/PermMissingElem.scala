package com.codility.lessons

/**
 * PermMissingElem
 */
object PermMissingElem {

  def solution(A: Array[Int]): Int = {

    val N : Long = A.length
    var sum : Long = 0L
    for (ind <- A.indices) {
      sum += A(ind)
    }

    ((N + 1) * (N + 2) / 2 - sum).toInt
  }
}
