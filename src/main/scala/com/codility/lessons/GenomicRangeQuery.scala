package com.codility.lessons

/**
 * GenomicRangeQuery
 */
object GenomicRangeQuery {

  def solution(S: String, P: Array[Int], Q: Array[Int]): Array[Int] = {

    val N = S.length
    val genoms = Map(
      'A' -> 1,
      'C' -> 2,
      'G' -> 3,
      'T' -> 4)
    val occur = Array.fill[Int](N, 4) {-1}

    for (ind <- S.indices) {
      if (ind > 0) {
        for (gen <- occur(ind).indices) {
          occur(ind)(gen) = occur(ind - 1)(gen)
        }
      }
      occur(ind)(genoms.get(S.charAt(ind)).get - 1) = ind
    }

    val result = new Array[Int](P.length)
    for (ind <- P.indices) {
      for (gen <- occur(Q(ind)).indices
           if result(ind) == 0) {
        if (occur(Q(ind))(gen) >= P(ind)) {
          result(ind) = gen + 1
        }
      }
    }
    result
  }
}
