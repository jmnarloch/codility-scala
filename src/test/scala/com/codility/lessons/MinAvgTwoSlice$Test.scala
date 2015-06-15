package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MinAvgTwoSlice}
 */
class MinAvgTwoSlice$Test extends UnitSpec {

  it should "return minimum average" in {

    val A = Array(4, 2, 2, 5, 1, 5, 8)

    MinAvgTwoSlice.solution(A) should be (1)
  }

  it should "return minimum average alternative" in {

    val A = Array(4, 2, 2, 5, 1, 5, 8)

    MinAvgTwoSlice.alternativeSolution(A) should be (1)
  }
}
