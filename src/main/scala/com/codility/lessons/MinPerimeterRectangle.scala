package com.codility.lessons

/**
 * MinPerimeterRectangle
 */
object MinPerimeterRectangle {

  def solution(N: Int): Int = {

    var div = 1
    var minPerimeter = (N + 1) * 2
    while(div * div <= N) {

      if(N % div == 0) {
        minPerimeter = math.min(minPerimeter, (div + N / div) * 2)
      }
      div += 1
    }
    minPerimeter
  }
}
