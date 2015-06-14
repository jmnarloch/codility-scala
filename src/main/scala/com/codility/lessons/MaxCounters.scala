package com.codility.lessons

/**
 * MaxCounters
 */
object MaxCounters {

  def solution(N: Int, A: Array[Int]): Array[Int] = {

    val counters = new Array[Int](N)

    var max = 0
    var maxCounter = 0
    for (count <- A) {
      if (count != N + 1) {

        if (counters(count - 1) < maxCounter) {
          counters(count - 1) = maxCounter
        }
        counters(count - 1) += 1
        max = math.max(max, counters(count - 1))
      } else {

        maxCounter = max
      }
    }

    for (ind <- counters.indices) {
      if (counters(ind) < maxCounter) {
        counters(ind) = maxCounter
      }
    }

    counters
  }
}
