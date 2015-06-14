package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link CountDiv}
 */
class CountDiv$Test extends UnitSpec {

  it should "count divisors" in {

    val A = 6
    val B = 11
    val K = 2

    CountDiv.solution(A, B, K) should be (3)
  }
}
