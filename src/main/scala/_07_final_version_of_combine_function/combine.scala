package _07_final_version_of_combine_function

import cats.Monoid
import cats.implicits.*
import doodle.image.Image

import scala.language.postfixOps

given Monoid[Image] = Monoid.instance[Image](Image.empty, _ on _)

def combine(imageGrid: List[List[Image]]): Image =
  imageGrid.foldMap(_ combineAll)