package com.codility.lessons

import scala.annotation.tailrec

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

  def funcSolution(A: Array[Int]): Int = {

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

    if(count(A, candidate) <= A.length / 2) {
      return -1
    }

    findFirst(A, candidate)
  }

  def count(A: Array[Int], item: Int): Int = {
    @tailrec
    def count(A: Array[Int], item: Int, ind: Int, cnt: Int): Int = {
      if(ind >= A.length) {
        cnt
      } else if(A(ind) == item) {
        count(A, item, ind + 1, cnt + 1)
      } else {
        count(A, item, ind + 1, cnt)
      }
    }

    count(A, item, 0, 0)
  }

  def findFirst(A: Array[Int], item: Int): Int = {
    @tailrec
    def findFirst(A: Array[Int], item: Int, ind: Int): Int = {
      if(ind >= A.length) {
        -1
      } else if(A(ind) == item) {
        ind
      } else {
        findFirst(A, item, ind + 1)
      }
    }

    findFirst(A, item, 0)
  }
}
