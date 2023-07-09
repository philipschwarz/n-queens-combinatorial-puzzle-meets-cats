package _18_permutations_using_foldM

import cats.syntax.foldable._

def permute[A](as: List[A]): List[(List[A], List[A])] =
  as.foldM((List.empty[A], as))(update)

def permutations[A](as: List[A]): List[List[A]] =
  permute(as).map(_.head)

@main def testPermutation: Unit =

  assert(
    permutations(List(1, 2, 3))
    ==
    List(
      List(3, 2, 1),
      List(2, 3, 1),
      List(3, 1, 2),
      List(1, 3, 2),
      List(2, 1, 3),
      List(1, 2, 3)
    )
  )