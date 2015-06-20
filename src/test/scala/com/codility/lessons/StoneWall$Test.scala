package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link StoneWall}
 */
class StoneWall$Test extends UnitSpec {

  it should "find minimum number of blocks" in {

    val H = Array(8, 8, 5, 7, 9, 8, 7, 4, 8)

    StoneWall.solution(H) should be(7)
  }
}
