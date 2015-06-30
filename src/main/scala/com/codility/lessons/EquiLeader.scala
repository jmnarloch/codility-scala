package com.codility.lessons

import scala.annotation.tailrec

/**
 * EquiLeader
 */
object EquiLeader {

  def solution(A: Array[Int]): Int = {
    if(A == null || A.length == 0) {
      return 0
    }

    var candidate = findCandidate(A)
    val cnt = count(A, candidate)
    if(cnt <= A.length / 2) {
      return 0
    }

    val occurrences = new Array[Int](A.length)
    for(ind <- A.indices) {
      if(ind > 0) {
        occurrences(ind) = occurrences(ind - 1)
      }
      if(A(ind) == candidate) {
        occurrences(ind) += 1
      }
    }

    var leaders = 0
    for(ind <- 0 until A.length - 1) {
      if(occurrences(ind) > (ind + 1) / 2 && (cnt - occurrences(ind)) > (A.length - ind - 1) / 2) {
        leaders += 1
      }
    }

    leaders
  }

  def findCandidate(A: Array[Int]): Int = {
    @tailrec
    def findCandidate(A: Array[Int], ind: Int, candidate: Int, occur: Int): Int = {
      if(ind >= A.length) {
        candidate
      } else if(candidate == A(ind)) {
        findCandidate(A, ind + 1, candidate, occur + 1)
      } else if(occur > 1) {
        findCandidate(A, ind + 1, candidate, occur - 1)
      } else {
        findCandidate(A, ind + 1, A(ind), 1)
      }
    }

    findCandidate(A, 1, A(0), 1)
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

    count(A, item , 0, 0)
  }
}
