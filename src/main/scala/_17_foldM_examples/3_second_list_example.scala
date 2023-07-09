package _17_foldM_examples

import cats.syntax.foldable._

@main def listSecondExample: Unit =

  assert(
    List.empty[Int].foldM(0)((acc,x) => List(acc+x, acc-x))
    ==
    List(0))

  assert(
    List(1).foldM(0)((acc,x) => List(acc+x, acc-x))
    ==
    List(1, -1))

  assert(
    List(1,2).foldM(0)((acc,x) => List(acc+x, acc-x))
    ==
    List(3, -1, 1, -3))

  assert(
    List(1,2,3).foldM(0)((acc,x) => List(acc+x, acc-x))
    ==
    List(6,0,2,-4,4,-2,0,-6))