package com.codility.lessons

/**
 * Tests {@link TapeEquilibrium}
 */
class TapeEquilibrium$Test extends UnitSpec {

  it should "find minimum difference" in {

    val A = Array(3, 1, 2, 4, 3)

    TapeEquilibrium.solution(A) should be(1)
  }
}
