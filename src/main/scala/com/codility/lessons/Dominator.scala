package com.codility.lessons

/**
 * Dominator
 */
object Dominator {

  def solution(A: Array[Int]): Int = {

    if (A.length == 0) {
      return -1
    }

    var candidate = A(0)
    var occurrences = 1
    var firstIndex = -1

    for (ind <- 1 until A.length) {
      if (candidate != A(ind)) {
        occurrences -= 1
      } else {
        occurrences += 1
      }

      if (occurrences == 0) {
        candidate = A(ind)
        occurrences = 1
      }
    }

    var count = 0
    for(ind <- A.indices) {
      if(A(ind) == candidate) {
        if(firstIndex == -1) {
          firstIndex = ind
        }
        count += 1
      }
    }

    if(count <= A.length / 2) {
      firstIndex = -1
    }

    firstIndex
  }
}
