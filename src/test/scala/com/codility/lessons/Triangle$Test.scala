package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link Triangle}
 */
class Triangle$Test extends UnitSpec {

  it should "if triangle can be build" in {

    val A = Array(10, 2, 5, 1, 8, 20)

    Triangle.solution(A) should be (1)
  }
}
