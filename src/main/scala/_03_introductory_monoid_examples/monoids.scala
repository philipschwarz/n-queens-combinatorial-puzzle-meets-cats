package _03_introductory_monoid_examples

import cats.Monoid
import cats.syntax.foldable.*
import cats.syntax.monoid.*

@main def mainMonoids: Unit =

  assert(Monoid[Int].combine(2,3) == 5)
  assert(Monoid[Int].combine(2,Monoid[Int].empty) == 2)
  assert((2 |+| 3) == 5)
  assert((2 |+| Monoid[Int].empty) == 2)
  assert(Monoid[Int].empty == 0)
  assert(List.empty[Int].combineAll == 0)
  assert(List(1,2,3,4).combineAll == 10)

  val prodMonoid = cats.Monoid.instance[Int](emptyValue = 1, cmb = _ * _)
  assert(prodMonoid.combine(2,3) == 6)
  assert(List.empty[Int].combineAll(prodMonoid) == 1)
  assert(List(1, 2, 3, 4).combineAll(prodMonoid) == 24)

  assert(List("ab", "cd", "ef").combineAll == "abcdef")
  assert(List.empty[String].combineAll == "")

  assert((Option(1) |+| Option(3)) == Option(4))
  assert(List(Option(1), None, Option(3)).combineAll == Option(4))
  assert(List.empty[Option[Int]].combineAll == None)