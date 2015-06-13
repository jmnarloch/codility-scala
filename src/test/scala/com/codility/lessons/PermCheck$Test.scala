package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link PermCheck}
 */
class PermCheck$Test extends UnitSpec {

  it should "check if is permutation" in {

    val A = Array(4, 1, 3, 2)

    PermCheck.solution(A) should be (1)
  }

  it should "check is not permutation" in {

    val A = Array(4, 1, 3)

    PermCheck.solution(A) should be (0)
  }

  it should "func check if is permutation" in {

    val A = Array(4, 1, 3, 2)

    PermCheck.funcSolution(A) should be (1)
  }

  it should "func check is not permutation" in {

    val A = Array(4, 1, 3)

    PermCheck.funcSolution(A) should be (0)
  }
}
