package com.codility.lessons

/**
 * PassingCars
 */
object PassingCars {

  def solution(A: Array[Int]): Int = {

    val N = A.length

    var cars = 0
    var result = 0

    for(car <- A) {
      if(car == 0) {
        cars += 1
      } else {
        result += cars
      }

      if(result > 1E9) {
        return -1
      }
    }
    result
  }
}
