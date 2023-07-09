package _14_mapM_examples

def conv(c: Char): Option[Int] =
  Option.when(c.isDigit)(c.asDigit)

@main def optionExample: Unit =

  assert("1234a".toList.mapM(conv) == None)
  assert("1234".toList.mapM(conv) == Some(List(1, 2, 3, 4)))
