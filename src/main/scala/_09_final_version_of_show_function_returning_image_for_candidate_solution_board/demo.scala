package _09_final_version_of_show_function_returning_image_for_candidate_solution_board

import _02_queens_function_from_programming_in_scala_book.queens

import cats.effect.unsafe.implicits.global
import doodle.core.Color
import doodle.java2d.*
import doodle.java2d.effect.Frame
import doodle.syntax.all.*

@main def drawBoard =
  showQueens(queens(8).head)

def showQueens(solution: List[Int]): Unit =
  val n = solution.length
  val squareSize = 100
  val boardSize = squareSize * n
  val boardX = - (boardSize - squareSize) / 2
  val boardY = - boardX
  val frame = createFrame(n, squareSize)
  val boardImageAtOrigin = show(solution, squareSize)
  val boardImage = boardImageAtOrigin.at(boardX,boardY)
  boardImage.compile.drawWithFrame(frame)

def createFrame(n: Int, squareSize: Int): Frame =
  val title = s"$n-Queens Puzzle - A solution"
  val backgroundColour = Color.white
  val boardSize = n * squareSize
  val width = boardSize + (squareSize * 2)
  val height = width
  Frame
    .default
    .withSize(width, height)
    .withTitle(title)
    .withBackground(backgroundColour)