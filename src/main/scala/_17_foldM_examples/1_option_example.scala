package _17_foldM_examples

import cats.syntax.foldable._

def binSmalls(acc: Int, x: Int): Option[Int] =
  Option.unless(x > 9)(acc + x)

@main def optionExample: Unit =
  
  assert(  List(2,8,3,1).foldM(0)(binSmalls) == Some(14) )
  assert( List(2,11,3,1).foldM(0)(binSmalls) == None )