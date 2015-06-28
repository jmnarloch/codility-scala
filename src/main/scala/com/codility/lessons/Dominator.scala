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
    countImpl(A, item, 0, 0)
  }

  @tailrec
  def countImpl(A: Array[Int], item: Int, ind: Int, count: Int): Int = {
    if(ind >= A.length) {
      count
    } else if(A(ind) == item) {
      countImpl(A, item, ind + 1, count + 1)
    } else {
      countImpl(A, item, ind + 1, count)
    }
  }

  def findFirst(A: Array[Int], item: Int): Int = {
      findFirstImpl(A, item, 0)
  }

  @tailrec
  def findFirstImpl(A: Array[Int], item: Int, ind: Int): Int = {
    if(ind >= A.length) {
      -1
    } else if(A(ind) == item) {
      ind
    } else {
      findFirstImpl(A, item, ind + 1)
    }
  }
}
