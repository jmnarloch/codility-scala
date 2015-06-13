package com.codility.lessons

/**
 * FrogJmp
 */
object FrogJmp {

  def solution(X: Int, Y: Int, D: Int): Int = {
    math.ceil((Y - X).toDouble / D.toDouble).toInt
  }
}
