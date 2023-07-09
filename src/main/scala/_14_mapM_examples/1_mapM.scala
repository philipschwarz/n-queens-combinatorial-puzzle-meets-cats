package _14_mapM_examples

import cats.{Applicative, Monad}
import cats.syntax.traverse.*
import cats.Traverse

extension[A, B, M[_] : Monad] (as: List[A])
  def mapM(f: A => M[B]): M[List[B]] =
    as.traverse(f)
