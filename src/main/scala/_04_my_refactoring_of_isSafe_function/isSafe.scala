package _04_my_refactoring_of_isSafe_function

def isSafe(queen: Int, queens: List[Int]): Boolean =
  val (row, column) = (queens.length, queen)
  val safe: ((Int,Int)) => Boolean = (nextRow, nextColumn) =>
    column != nextColumn && ! onDiagonal(column, row, nextColumn, nextRow)
  zipWithRows(queens) forall safe

def onDiagonal(row: Int, column: Int, otherRow: Int, otherColumn: Int) =
  math.abs(row - otherRow) ==  math.abs(column - otherColumn)

// List(4, 1, 3) => Iterable((2,4),(1,1),(0,3))
def zipWithRows(queens: List[Int]): Iterable[(Int,Int)] =
  val rowCount = queens.length
  val rowNumbers = rowCount - 1 to 0 by -1
  rowNumbers zip queens