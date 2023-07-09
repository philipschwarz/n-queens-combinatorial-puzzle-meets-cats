package _05_initial_version_of_combine_function

import doodle.image.Image

def combine(imageGrid: List[List[Image]]): Image =
  imageGrid
    .map(_.reduce(_ beside _))
    .reduce(_ above _)