package com.codility.lessons

/**
 * Tests {@link MaxCounters}
 */
class MaxCounters$Test extends UnitSpec {

  it should "return the counter values" in {

    val N = 5
    val A = Array(3, 4, 4, 6, 1, 4, 4)

    MaxCounters.solution(N, A) should equal(Array(3, 2, 2, 4, 2))
  }
}
