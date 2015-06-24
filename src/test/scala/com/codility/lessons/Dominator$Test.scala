package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link Dominator}
 */
class Dominator$Test extends UnitSpec {

  it should "find leader" in {

    val A = Array(3, 4, 3, 2, 3, -1, 3, 3)

    List(Dominator.solution(A)) should contain oneOf (0, 2, 4, 6, 7)
  }

  it should "func find leader" in {

    val A = Array(3, 4, 3, 2, 3, -1, 3, 3)

    List(Dominator.funcSolution(A)) should contain oneOf (0, 2, 4, 6, 7)
  }
}
