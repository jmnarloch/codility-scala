package com.codility.lessons

/**
 * Tests {@link GenomicRangeQuery}
 */
class GenomicRangeQuery$Test extends UnitSpec {

  it should "find minimum genom" in {

    val S = "CAGCCTA"
    val P = Array(2, 5, 0)
    val Q = Array(4, 5, 6)

    GenomicRangeQuery.solution(S, P, Q) should equal (Array(2, 4, 1))
  }
}
