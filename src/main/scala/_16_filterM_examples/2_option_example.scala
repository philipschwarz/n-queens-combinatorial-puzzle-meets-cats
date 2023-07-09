package _16_filterM_examples

def maybeIsEven(c: Char): Option[Boolean] =
  Option.when(c.isDigit)(c.asDigit % 2 == 0)

@main def optionExample: Unit =

  assert(
    "1234".toList.filterM(maybeIsEven)
      ==
      Some(List('2', '4'))
  )

  assert(
    "1234a".toList.filterM(maybeIsEven)
      ==
      None
  )