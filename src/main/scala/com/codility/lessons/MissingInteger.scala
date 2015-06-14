package com.codility.lessons

/**
 * MissingInteger
 */
object MissingInteger {

  def solution(A: Array[Int]): Int = {

    val N = A.length
    val numbers = new Array[Boolean](N)

    for (num <- A) {
      if (num > 0 && num <= N) {
        numbers(num - 1) = true
      }
    }

    for (ind <- numbers.indices) {
      if (!numbers(ind)) {
        return ind + 1
      }
    }
    return N + 1
  }

  def solutionInPlace(A: Array[Int]): Int = {

    val N = A.length

    var ind = 0
    while (ind < A.length) {
      if (A(ind) >= 1 && A(ind) <= N
        && A(ind) != ind + 1 && A(A(ind) - 1) != A(ind)) {
        swap(A, ind, A(ind) - 1)
      } else {
        ind += 1
      }
    }

    for (ind <- A.indices) {
      if (A(ind) != ind + 1) {
        return ind + 1
      }
    }
    return N + 1
  }

  def swap(A: Array[Int], i: Int, j: Int): Unit = {

    val tmp = A(i)
    A(i) = A(j)
    A(j) = tmp
  }
}
