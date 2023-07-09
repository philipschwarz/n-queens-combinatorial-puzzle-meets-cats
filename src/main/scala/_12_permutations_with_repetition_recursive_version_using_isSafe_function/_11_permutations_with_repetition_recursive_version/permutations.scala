package _12_permutations_with_repetition_recursive_version_using_isSafe_function._11_permutations_with_repetition_recursive_version

import _04_my_refactoring_of_isSafe_function.isSafe

def permutations(n:Int = 4): List[List[Int]] =
  if n == 0 then List(List())
  else
    for
      queens <- permutations(n-1)
      queen <- 1 to 4
      if isSafe(queen, queens)
    yield queen :: queens
