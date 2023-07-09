package _17_foldM_examples

import cats.syntax.foldable._

@main def listThirdExample: Unit =

  assert(
    List().foldM(List.empty)((acc,x) => List(x::acc,acc))
    ==
    List(List()))

  assert(
    List(1).foldM(List.empty)((acc,x) => List(x::acc,acc))
    ==
    List(List(1),List()))

  assert(
    List(1,2).foldM(List.empty)((acc,x) => List(x::acc,acc))
    ==
    List(List(2,1),List(1),List(2),List()))

  assert(
    List(1,2,3).foldM(List.empty)((acc,x) => List(x::acc,acc))
    ==
    List(List(3,2,1),List(2,1),List(3,1),List(1),List(3,2),List(2),List(3),List()))