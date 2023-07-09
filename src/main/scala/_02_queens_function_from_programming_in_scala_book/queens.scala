package _02_queens_function_from_programming_in_scala_book

import _04_my_refactoring_of_isSafe_function.isSafe

def queens(n: Int): List[List[Int]] =

  def placeQueens(k: Int): List[List[Int]] =
    if k == 0 then List(List())
    else
      for
        queens <- placeQueens(k - 1)
        queen  <- 1 to n
        if isSafe(queen, queens)
      yield queen :: queens

  placeQueens(n)