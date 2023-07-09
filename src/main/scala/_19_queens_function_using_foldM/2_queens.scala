package _19_queens_function_using_foldM

import cats.syntax.foldable._

def queens(n: Int): List[List[Int]] =
  def oneMoreQueen(acc: (List[Int],List[Int]), x: Int): List[(List[Int],List[Int])] = acc match
    case (queens, emptyColumns) =>
      def safe(x:Int): Boolean = {
        for (c,n) <- queens zip (1 to n) yield x != c + n && x != c - n
      } forall identity
      for
        queen <- emptyColumns
        if safe(queen)
      yield (queen::queens, emptyColumns diff List(queen))
  List(1 to n *).foldM(Nil, List(1 to n *))(oneMoreQueen) map (_.head)

@main def testQueens: Unit =

  assert(queens(4) == List(List(3, 1, 4, 2), List(2, 4, 1, 3)))

  assert(
    queens(8)
    ==
    List(
      List(4, 2, 7, 3, 6, 8, 5, 1), List(5, 2, 4, 7, 3, 8, 6, 1), List(3, 5, 2, 8, 6, 4, 7, 1), List(3, 6, 4, 2, 8, 5, 7, 1), List(5, 7, 1, 3, 8, 6, 4, 2),
      List(4, 6, 8, 3, 1, 7, 5, 2), List(3, 6, 8, 1, 4, 7, 5, 2), List(5, 3, 8, 4, 7, 1, 6, 2), List(5, 7, 4, 1, 3, 8, 6, 2), List(4, 1, 5, 8, 6, 3, 7, 2),
      List(3, 6, 4, 1, 8, 5, 7, 2), List(4, 7, 5, 3, 1, 6, 8, 2), List(6, 4, 2, 8, 5, 7, 1, 3), List(6, 4, 7, 1, 8, 2, 5, 3), List(1, 7, 4, 6, 8, 2, 5, 3),
      List(6, 8, 2, 4, 1, 7, 5, 3), List(6, 2, 7, 1, 4, 8, 5, 3), List(4, 7, 1, 8, 5, 2, 6, 3), List(5, 8, 4, 1, 7, 2, 6, 3), List(4, 8, 1, 5, 7, 2, 6, 3),
      List(2, 7, 5, 8, 1, 4, 6, 3), List(1, 7, 5, 8, 2, 4, 6, 3), List(2, 5, 7, 4, 1, 8, 6, 3), List(4, 2, 7, 5, 1, 8, 6, 3), List(5, 7, 1, 4, 2, 8, 6, 3),
      List(6, 4, 1, 5, 8, 2, 7, 3), List(5, 1, 4, 6, 8, 2, 7, 3), List(5, 2, 6, 1, 7, 4, 8, 3), List(6, 3, 7, 2, 8, 5, 1, 4), List(2, 7, 3, 6, 8, 5, 1, 4),
      List(7, 3, 1, 6, 8, 5, 2, 4), List(5, 1, 8, 6, 3, 7, 2, 4), List(1, 5, 8, 6, 3, 7, 2, 4), List(3, 6, 8, 1, 5, 7, 2, 4), List(6, 3, 1, 7, 5, 8, 2, 4),
      List(7, 5, 3, 1, 6, 8, 2, 4), List(7, 3, 8, 2, 5, 1, 6, 4), List(5, 3, 1, 7, 2, 8, 6, 4), List(2, 5, 7, 1, 3, 8, 6, 4), List(3, 6, 2, 5, 8, 1, 7, 4),
      List(6, 1, 5, 2, 8, 3, 7, 4), List(8, 3, 1, 6, 2, 5, 7, 4), List(2, 8, 6, 1, 3, 5, 7, 4), List(5, 7, 2, 6, 3, 1, 8, 4), List(3, 6, 2, 7, 5, 1, 8, 4),
      List(6, 2, 7, 1, 3, 5, 8, 4), List(3, 7, 2, 8, 6, 4, 1, 5), List(6, 3, 7, 2, 4, 8, 1, 5), List(4, 2, 7, 3, 6, 8, 1, 5), List(7, 1, 3, 8, 6, 4, 2, 5),
      List(1, 6, 8, 3, 7, 4, 2, 5), List(3, 8, 4, 7, 1, 6, 2, 5), List(6, 3, 7, 4, 1, 8, 2, 5), List(7, 4, 2, 8, 6, 1, 3, 5), List(4, 6, 8, 2, 7, 1, 3, 5),
      List(2, 6, 1, 7, 4, 8, 3, 5), List(2, 4, 6, 8, 3, 1, 7, 5), List(3, 6, 8, 2, 4, 1, 7, 5), List(6, 3, 1, 8, 4, 2, 7, 5), List(8, 4, 1, 3, 6, 2, 7, 5),
      List(4, 8, 1, 3, 6, 2, 7, 5), List(2, 6, 8, 3, 1, 4, 7, 5), List(7, 2, 6, 3, 1, 4, 8, 5), List(3, 6, 2, 7, 1, 4, 8, 5), List(4, 7, 3, 8, 2, 5, 1, 6),
      List(4, 8, 5, 3, 1, 7, 2, 6), List(3, 5, 8, 4, 1, 7, 2, 6), List(4, 2, 8, 5, 7, 1, 3, 6), List(5, 7, 2, 4, 8, 1, 3, 6), List(7, 4, 2, 5, 8, 1, 3, 6),
      List(8, 2, 4, 1, 7, 5, 3, 6), List(7, 2, 4, 1, 8, 5, 3, 6), List(5, 1, 8, 4, 2, 7, 3, 6), List(4, 1, 5, 8, 2, 7, 3, 6), List(5, 2, 8, 1, 4, 7, 3, 6),
      List(3, 7, 2, 8, 5, 1, 4, 6), List(3, 1, 7, 5, 8, 2, 4, 6), List(8, 2, 5, 3, 1, 7, 4, 6), List(3, 5, 2, 8, 1, 7, 4, 6), List(3, 5, 7, 1, 4, 2, 8, 6),
      List(5, 2, 4, 6, 8, 3, 1, 7), List(6, 3, 5, 8, 1, 4, 2, 7), List(5, 8, 4, 1, 3, 6, 2, 7), List(4, 2, 5, 8, 6, 1, 3, 7), List(4, 6, 1, 5, 2, 8, 3, 7),
      List(6, 3, 1, 8, 5, 2, 4, 7), List(5, 3, 1, 6, 8, 2, 4, 7), List(4, 2, 8, 6, 1, 3, 5, 7), List(6, 3, 5, 7, 1, 4, 2, 8), List(6, 4, 7, 1, 3, 5, 2, 8),
      List(4, 7, 5, 2, 6, 1, 3, 8), List(5, 7, 2, 6, 3, 1, 4, 8))
  )

  assert(queens(8).size == 92)