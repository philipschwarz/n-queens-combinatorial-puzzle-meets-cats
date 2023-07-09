package _19_queens_function_using_foldM

def oneMoreQueen[A](acc:(List[A],List[A]),a:A): List[(List[A],List[A])] = acc match
  case (queens, emptyColumns) =>
    for
      queen <- emptyColumns
    yield (queen :: queens, emptyColumns.diff(List(queen)))