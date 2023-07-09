package _10_permutations_with_repetition_initial_version

@main def printPermutationsWithRepetition =
  val results = permutations()
  println(s"# of results = ${results.size}")
  println(s"# of permutations with repetition allowed = ${4 * 4 * 4 * 4}") // n^n
  println(s"# of permutations with repetition disallowed = ${4 * 3 * 2 * 1}") // n!
  println(results)