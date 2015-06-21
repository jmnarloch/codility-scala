package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link PassingCars}
 */
class PassingCars$Test extends UnitSpec {

  it should "find the passing cars" in {

    val A = Array(0, 1, 0, 1, 1)

    PassingCars.solution(A) should be (5)
  }

  it should "func find the passing cars" in {

    val A = Array(0, 1, 0, 1, 1)

    PassingCars.funcSolution(A) should be (5)
  }
}
