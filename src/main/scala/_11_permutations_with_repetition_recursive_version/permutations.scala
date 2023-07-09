package _11_permutations_with_repetition_recursive_version

def permutations(n:Int = 4): List[List[Int]] =
  if n == 0 then List(List())
  else
    for
      queens <- permutations(n-1)
      queen <- 1 to 4
    yield queen :: queens
