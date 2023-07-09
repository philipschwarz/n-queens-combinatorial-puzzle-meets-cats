package _16_filterM_examples

import cats.Monad
import cats.syntax.traverseFilter.*

extension [A,M[_]: Monad](as:List[A])
  def filterM(f: A => M[Boolean]): M[List[A]] =
    as.filterA(f)