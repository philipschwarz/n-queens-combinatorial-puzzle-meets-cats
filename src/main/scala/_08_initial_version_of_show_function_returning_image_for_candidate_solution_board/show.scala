package _08_initial_version_of_show_function_returning_image_for_candidate_solution_board

import _05_initial_version_of_combine_function.combine
import doodle.core.Color
import doodle.image.Image

val square: Image = Image.square(100).strokeColor(Color.black)
val emptySquare: Image = square.fillColor(Color.white)
val fullSquare: Image = square.fillColor(Color.orangeRed)

def show(queens: List[Int]): Image =
  val squareImageGrid: List[List[Image]] =
    for col <- queens.reverse
    yield List.fill(queens.length)(emptySquare).updated(col-1,fullSquare)
  combine(squareImageGrid)
