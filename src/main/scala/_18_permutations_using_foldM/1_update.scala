package _18_permutations_using_foldM

def update[A](acc:(List[A],List[A]),a:A): List[(List[A],List[A])] = acc match
  case (permutation, choices) =>
    for
      choice <- choices
    yield (choice :: permutation, choices.diff(List(choice)))

import cats.syntax.foldable._

@main def testUpdate: Unit =

  assert(
    List(1,2,3).foldM((List.empty[Int],List(1,2,3)))(update)
    ==
    List(
      (List(3,2,1),List()),
      (List(2,3,1),List()),
      (List(3,1,2),List()),
      (List(1,3,2),List()),
      (List(2,1,3),List()),
      (List(1,2,3),List())
      )
  )