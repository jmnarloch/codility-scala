package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MaxProfit}
 */
class MaxSliceSum$Test extends UnitSpec {

  it should "find max slice sum" in {

    val A = Array(3, 2, -6, 4, 0)

    MaxSliceSum.solution(A) should be(5)
  }
}
