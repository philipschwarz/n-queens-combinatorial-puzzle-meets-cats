package _13_hand_rolled_mapM_examples

import cats.Monad
import cats.syntax.applicative.*
import cats.syntax.flatMap.*
import cats.syntax.functor.* // pure

def mapM[A, B, M[_] : Monad](l: List[A])(f: A => M[B]): M[List[B]] = l match
  case Nil => Nil.pure
  case a :: as =>
    for
      b <- f(a)
      bs <- {mapM(as)(f)}
    yield b :: bs
