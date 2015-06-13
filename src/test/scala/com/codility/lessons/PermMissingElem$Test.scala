package com.codility.lessons

import org.scalatest.FunSuite

/**
 * PermMissingElem
 */
class PermMissingElem$Test extends UnitSpec {

  it should "find missing value" in {

    val A = Array(2, 3, 1, 5)

    PermMissingElem.solution(A) should be(4)
  }
}
