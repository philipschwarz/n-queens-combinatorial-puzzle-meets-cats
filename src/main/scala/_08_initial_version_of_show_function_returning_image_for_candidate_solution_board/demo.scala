package _08_initial_version_of_show_function_returning_image_for_candidate_solution_board

import _02_queens_function_from_programming_in_scala_book.queens
import cats.effect.unsafe.implicits.global
import doodle.core.Color
import doodle.java2d.*
import doodle.java2d.effect.Frame
import doodle.syntax.*
import doodle.syntax.all.*

@main def drawBoard =
  showQueens(queens(8).head)

def showQueens(queens: List[Int]): Unit =

  val n = queens.length

  val frameTitle = s"$n-Queens Puzzle - A solution"
  val frameWidth, frameHeight = (n + 2) * 100
  val frameBackgroundColour = Color.white

  val frame =
    Frame
      .default
      .withSize(frameWidth,frameHeight)
      .withTitle(frameTitle)
      .withBackground(frameBackgroundColour)

  show(queens).compile.drawWithFrame(frame)
