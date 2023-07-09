package _10_permutations_with_repetition_initial_version

def permutations(): List[List[Int]] =
  { for
      firstQueen  <- 1 to 4
      secondQueen <- 1 to 4
      thirdQueen  <- 1 to 4
      fourthQueen <- 1 to 4
      queens = List(firstQueen, secondQueen, thirdQueen, fourthQueen)
    yield queens
  }.toList
