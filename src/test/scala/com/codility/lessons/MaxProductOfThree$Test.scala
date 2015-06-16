package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MaxProductOfThree}
 */
class MaxProductOfThree$Test extends UnitSpec {

  it should "find the maximum product" in {

    val A = Array(-3, 1, 2, -2, 5, 6)

    MaxProductOfThree.solution(A) should be (60)
  }
}
