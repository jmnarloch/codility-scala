package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link EquiLeader}
 */
class EquiLeader$Test extends UnitSpec {

  it should "find equi leader" in {

    val A = Array(4, 3, 4, 4, 4, 2)

    EquiLeader.solution(A) should be(2)
  }
}
