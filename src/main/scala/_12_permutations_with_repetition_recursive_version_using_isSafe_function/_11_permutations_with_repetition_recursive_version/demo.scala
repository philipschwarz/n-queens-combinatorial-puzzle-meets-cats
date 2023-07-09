package _12_permutations_with_repetition_recursive_version_using_isSafe_function._11_permutations_with_repetition_recursive_version

@main def printPermutationsWithRepetitionRecursive =
  val results = permutations()
  println(s"# of results = ${results.size}")
  println(s"# of permutations with repetition allowed = ${4 * 4 * 4 * 4}") // n^n
  println(s"# of permutations with repetition disallowed = ${4 * 3 * 2 * 1}") // n!
  println(results)
