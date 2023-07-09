package _06_intermediate_version_of_combine_function

import cats.Monoid
import cats.implicits.*
import doodle.image.Image

val beside = Monoid.instance[Image](Image.empty, _ beside _)
val above = Monoid.instance[Image](Image.empty, _ above _)

def combine(imageGrid: List[List[Image]]): Image =
  imageGrid.foldMap(_ combineAll beside)(above)