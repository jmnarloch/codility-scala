package com.codility.lessons

import org.scalatest.FunSuite

/**
 * Tests {@link Brackets}
 */
class Brackets$Test extends UnitSpec {

  it should "check if brackets are correctly nested" in {

    val S = "{[()()]}"

    Brackets.solution(S) should be(1)
  }
}
