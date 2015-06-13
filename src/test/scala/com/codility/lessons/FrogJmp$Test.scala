package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link FrogJmp}
 */
class FrogJmp$Test extends UnitSpec {

  it should "return the unique divisors" in {

    val X = 10
    val Y = 85
    val D = 30

    FrogJmp.solution(X, Y, D) should be (3)
  }
}
