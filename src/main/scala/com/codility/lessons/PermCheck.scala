package com.codility.lessons

/**
 * PermCheck
 */
object PermCheck {

  def solution(A: Array[Int]): Int = {
    // write your code in Scala 2.10

    val N = A.length
    val counts = new Array[Boolean](N)

    for (num <- A) {
      if (num > N || counts(num - 1)) {
        return 0
      }
      counts(num - 1) = true
    }
    return 1
  }

  def funcSolution(A: Array[Int]): Int = {

    val N = A.length
    val counts = A filter (_ <= N) groupBy (v => v) map (e => (e._1, e._2.length))
    if (counts.size == N && counts.forall(_._2 == 1)) 1 else 0
  }
}
