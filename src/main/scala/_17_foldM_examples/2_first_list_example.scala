package _17_foldM_examples

import cats.syntax.foldable._

@main def listFirstExample: Unit =

  assert(
    List().foldM(9)((_, _) => List(0, 0))
    ==
    List(9))

  assert(
    List(1).foldM(9)((_, _) => List(0, 0))
    ==
    List(0, 0))

  assert(List(1, 2).foldM(9)((_, _) => List(0, 0))
    ==
    List(0, 0, 0, 0))

  assert(
    List(1, 2, 3).foldM(9)((_, _) => List(0, 0))
    ==
    List(0, 0, 0, 0, 0, 0, 0, 0))

  assert(
    List(1, 2, 3, 4).foldM(9)((_, _) => List(0, 0))
    ==
    List(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))