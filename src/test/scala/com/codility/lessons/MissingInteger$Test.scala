package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MissingInteger}
 */
class MissingInteger$Test extends UnitSpec {

  it should "find missing integer" in {

    val A = Array(1, 3, 6, 4, 1, 2)

    MissingInteger.solution(A) should be (5)
  }

  it should "in place find missing integer" in {

    val A = Array(1, 3, 6, 4, 1, 2)

    MissingInteger.solutionInPlace(A) should be (5)
  }
}
