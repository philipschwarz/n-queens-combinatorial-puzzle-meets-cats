package _15_hand_rolled_filterM_examples

def powerset[A](as: List[A]): List[List[A]] =
  filterM(as)(_ => List(true, false))

@main def listExample: Unit =

  assert(
    filterM(List(1, 2, 3))(_ => List(true, false))
    ==
    List(List(1, 2, 3), List(1, 2), List(1, 3), List(1), List(2, 3), List(2), List(3), List())
  )

  assert(
    powerset(List(1, 2, 3))
    ==
    List(List(1, 2, 3), List(1, 2), List(1, 3), List(1), List(2, 3), List(2), List(3), List())
  )
