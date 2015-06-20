package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link Fish}
 */
class FishTest extends UnitSpec {

  it should "returns number of survived fishes" in {

    val A = Array(4, 3, 2, 1, 5)
    val B = Array(0, 1, 0, 0, 0)

    Fish.solution(A, B) should be (2)
  }
}
