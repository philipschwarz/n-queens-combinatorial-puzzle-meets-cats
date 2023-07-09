package _15_hand_rolled_filterM_examples

def maybeIsEven(c: Char): Option[Boolean] =
  Option.when(c.isDigit)(c.asDigit % 2 == 0)

@main def optionExample: Unit =

  assert(
      filterM("1234".toList)(maybeIsEven)
      ==
      Some(List('2', '4'))
  )

  assert(
      filterM("1234a".toList)(maybeIsEven)
      ==
      None
  )