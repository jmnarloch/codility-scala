package com.codility.lessons

/**
 * PermMissingElem
 */
class PermMissingElem$Test extends UnitSpec {

  it should "find missing value" in {

    val A = Array(2, 3, 1, 5)

    PermMissingElem.solution(A) should be(4)
  }
}
