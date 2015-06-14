package com.codility.lessons

/**
 * CountDiv
 */
object CountDiv {

  def solution(A: Int, B: Int, K: Int): Int = {

    val div = (B / K - A / K)
    val mul = if (A % K == 0) 1 else 0

    div + mul
  }
}
