package _09_final_version_of_show_function_returning_image_for_candidate_solution_board

import _07_final_version_of_combine_function.combine
import doodle.core.Color
import doodle.image.Image

import scala.language.postfixOps

def show(queens: List[Int], squareSize: Int): Image =
  val n = queens length
  val solution = queens reverse
  val (emptySquare, fullSquare) = createSquareImages(squareSize)
  val squareImages: List[Image] =
    for
      row <- List.range(0, n)
      col <- List.range(0, n)
      squareX = col * squareSize
      squareY = - row * squareSize
      squareImageAtOrigin = if solution(row) == (col+1) then fullSquare else emptySquare
      squareImage = squareImageAtOrigin.at(squareX,squareY)
    yield squareImage
  val squareImageGrid = (squareImages grouped n).toList
  combine(squareImageGrid)

def createSquareImages(squareSize: Int): (Image,Image) =
  val square: Image = Image.square(squareSize).strokeColor(Color.black)
  val emptySquare: Image = square.fillColor(Color.white)
  val fullSquare: Image = square.fillColor(Color.orangeRed)
  (emptySquare, fullSquare)
