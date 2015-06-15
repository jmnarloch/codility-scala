package com.codility.lessons

/**
 * MinAvgTwoSlice
 */
object MinAvgTwoSlice {

  def solution(A: Array[Int]): Int = {

    val N = A.length

    var twoSum = A(0) + A(1)
    var threeSum = twoSum

    var minAvg: Double = twoSum.toDouble / 2.0
    var minIndex = 0

    var ind = 2
    while (ind < N) {

      twoSum += A(ind) - A(ind - 2)
      threeSum += A(ind) - (if (ind >= 3) A(ind - 3) else 0)

      if (twoSum / 2.0 < minAvg) {
        minAvg = twoSum / 2.0
        minIndex = ind - 1
      }
      if (threeSum / 3.0 < minAvg) {
        minAvg = threeSum / 3.0
        minIndex = ind - 2
      }

      ind += 1
    }

    minIndex
  }

  def alternativeSolution(A: Array[Int]): Int = {

    val N = A.length

    var minAvg: Double = (A(0) + A(1)) / 2.0
    var minIndex = 0

    var ind = 1
    while (ind < N) {
      var avg: Double = (A(ind) + A(ind - 1)) / 2.0
      if (avg < minAvg) {
        minIndex = ind - 1
        minAvg = avg
      }

      if (ind >= 2) {
        avg = (A(ind) + A(ind - 1) + A(ind - 2)) / 3.0
        if (avg < minAvg) {
          minIndex = ind - 2
          minAvg = avg
        }
      }

      ind += 1
    }

    minIndex
  }
}
