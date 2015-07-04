package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link CountFactors}
 */
class CountFactors$Test extends UnitSpec {

  it should "return number of factors" in  {

    val N = 24

    CountFactors.solution(N) should be(8)
  }
}
