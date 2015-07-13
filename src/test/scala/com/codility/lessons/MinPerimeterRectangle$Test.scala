package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link MinPerimeterRectangle}
 */
class MinPerimeterRectangle$Test extends UnitSpec {

  it should "find minimum perimeter" in {

    val N = 30

    MinPerimeterRectangle.solution(N) should be (22)
  }
}
