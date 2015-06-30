package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MaxProfit}
 */
class MaxProfit$Test extends UnitSpec {

  it should "compute the maximum profit" in {

    val A = Array(23171, 21011, 21123, 21366, 21013, 21367)

    MaxProfit.solution(A) should be(356)
  }
}
