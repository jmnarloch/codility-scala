package com.codility.lessons

/**
 * Tests {@link Distinct}
 */
class Distinct$Test extends UnitSpec {

  it should "find number of distinct values" in {

    val A = Array(2, 1, 1, 2, 3, 1)

    Distinct.solution(A) should be (3)
  }
}
