package com.codility.lessons

/**
 * CountFactors
 */
object CountFactors {

  def solution(N: Int): Int = {

    var div = 1
    var factors = 0
    while(div * div < N) {
      if(N % div == 0) {
        factors += 2
      }
      div += 1
    }
    if(div * div == N) {
      factors += 1
    }
    factors
  }
}
