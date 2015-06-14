package com.codility.lessons

/**
 * PermCheck
 */
object PermCheck {

  def solution(A: Array[Int]): Int = {

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

  def solutionInPlace(A: Array[Int]): Int = {

    val N = A.length

    var ind = 0
    while (ind < A.length) {
      if (A(ind) > N || A(ind) < 1) {
        return 0
      } else if (A(ind) != ind + 1) {
        if (A(A(ind) - 1) == A(ind)) {
          return 0
        }
        swap(A, ind, A(ind) - 1)
      } else {
        ind += 1
      }
    }
    return 1
  }

  def swap[T](A: Array[T], i: Int, j: Int) = {
    val tmp = A(i)
    A(i) = A(j)
    A(j) = tmp
  }

  def funcSolution(A: Array[Int]): Int = {

    val N = A.length
    val counts = A filter (_ <= N) groupBy (v => v) map (e => (e._1, e._2.length))
    if (counts.size == N && counts.forall(_._2 == 1)) 1 else 0
  }
}
