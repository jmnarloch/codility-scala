package com.codility.lessons

/**
 * Tests {@link FrogRiverOne}
 */
class FrogRiverOne$Test extends UnitSpec {

  it should "find minimal needed time" in {

    val X = 5
    val A = Array(1, 3, 1, 4, 2, 3, 5, 4)

    FrogRiverOne.solution(X, A) should be(6)
  }
}
