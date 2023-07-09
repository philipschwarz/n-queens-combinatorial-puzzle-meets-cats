package _14_mapM_examples

@main def listExample: Unit =

  assert(
    List("X", "Y").map { x => List(x + "1", x + "2") }
    ==
    List(List("X1", "X2"), List("Y1", "Y2"))
  )

  assert(
    List("X", "Y").mapM { x => List(x + "1", x + "2") }
    ==
    List(List("X1", "Y1"), List("X1", "Y2"), List("X2", "Y1"), List("X2", "Y2"))
  )
