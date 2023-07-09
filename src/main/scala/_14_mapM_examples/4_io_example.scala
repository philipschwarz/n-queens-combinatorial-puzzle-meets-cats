package _14_mapM_examples

import cats.effect.IO
import scala.io.StdIn.readLine
import cats.effect.unsafe.implicits.global

@main def ioExample: Unit =

  def getNumber(msg: String): IO[Int] =
    (IO.print(msg) *> IO.readLine).map(_.toIntOption.getOrElse(0))

  val messages = List("Enter a number: ", "Enter another: ")

  val getNumbers: IO[List[Int]] =
    messages.mapM{ getNumber }

  val numbers: List[Int] = getNumbers.unsafeRunSync()
  
  println(s"The two numbers add up to ${numbers.sum}")