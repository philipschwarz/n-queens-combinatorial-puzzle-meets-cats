  package _01_show_function_returning_string_representation_of_candidate_solution_board
  
  def show(queens: List[Int]): String =
    val lines: List[String] =
      for (col <- queens.reverse)
      yield Vector.fill(queens.length)("❎ ").updated(col-1, s"👑 ").mkString
    "\n" + lines.mkString("\n")

