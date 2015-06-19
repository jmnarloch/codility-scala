package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link Nesting}
 */
class Nesting$Test extends UnitSpec {

  it should "verify if parentheses are correctly nested" in {

    val S = "(()(())())"

    Nesting.solution(S) should be (1)
  }

  it should "verify if parentheses are not correctly nested" in {

    val S = "())"

    Nesting.solution(S) should be (0)
  }
}
