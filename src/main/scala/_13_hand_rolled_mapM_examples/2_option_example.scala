package _13_hand_rolled_mapM_examples

def conv(c: Char): Option[Int] =
  Option.when(c.isDigit)(c.asDigit)

@main def optionExample: Unit =

  assert(mapM("1234".toList)(conv) == Some(List(1, 2, 3, 4)))
  assert(mapM("1234a".toList)(conv) == None)
