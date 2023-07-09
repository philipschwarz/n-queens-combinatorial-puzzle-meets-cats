package _15_hand_rolled_filterM_examples

import cats.Monad
import cats.syntax.applicative.* // map
import cats.syntax.flatMap.* // flatMap
import cats.syntax.functor.* // pure

def filterM[A, M[_] : Monad](l: List[A])(p: A => M[Boolean]): M[List[A]] = l match
  case Nil => Nil.pure
  case a :: as =>
    for
      retainingA <- p(a)
      retainedAs <- filterM(as)(p)
    yield if retainingA then a :: retainedAs else retainedAs
