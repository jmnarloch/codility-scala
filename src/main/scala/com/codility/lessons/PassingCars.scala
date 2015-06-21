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

  def funcSolution(A: Array[Int]): Int = {

    A.foldLeft(Array(0, 0))(
      (acc, car) => {
        if(acc(0) ==  -1 || acc(0) > 1E9) {
          acc(0) = -1
        } else {
          if(car == 0) {
            acc(1) += 1
          } else {
            acc(0) += acc(1)
          }
        }
        acc
      }
    )(0)
  }
}
