package com.codility.lessons

/**
 * PermCheck
 */
object PermCheck {

  def solution(A: Array[Int]): Int = {
    // write your code in Scala 2.10

    val N = A.length
    val counts = new Array[Int](N)

    for (num <- A) {
      if (num > N) {
        return 0
      }
      counts(num - 1) += 1
      if (counts(num - 1) > 1) {
        return 0
      }
    }

    for (count <- counts) {
      if (count != 1) {
        return 0
      }
    }
    return 1
  }

  def funcSolution(A: Array[Int]): Int = {

    val N = A.length
    val counts = A filter (_ <= N) groupBy (v => v) map (e => (e._1, e._2.length))
    if (counts.size == N && counts.forall(_._2 == 1)) 1 else 0
  }
}
