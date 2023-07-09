package _01_show_function_returning_string_representation_of_candidate_solution_board

import _02_queens_function_from_programming_in_scala_book.queens

/**
 * Prints the following to console:
 * 👑 ❎ ❎ ❎ ❎ ❎ ❎ ❎
 * ❎ ❎ ❎ ❎ 👑 ❎ ❎ ❎
 * ❎ ❎ ❎ ❎ ❎ ❎ ❎ 👑
 * ❎ ❎ ❎ ❎ ❎ 👑 ❎ ❎
 * ❎ ❎ 👑 ❎ ❎ ❎ ❎ ❎
 * ❎ ❎ ❎ ❎ ❎ ❎ 👑 ❎
 * ❎ 👑 ❎ ❎ ❎ ❎ ❎ ❎
 * ❎ ❎ ❎ 👑 ❎ ❎ ❎ ❎
 */
@main def printOneBoard =
  showQueens(queens(8).head)

def showQueens(solution: List[Int]): Unit =
  println(show(solution))
