class SolutionMakeTheIntegerZero {
    fun survivedRobotsHealths(positions: IntArray, healths: IntArray, directions: String): List<Int> {
        val arr = positions.indices.map { Pair(positions[it], it) }.sortedBy { it.first }
        val stack = mutableListOf<Int>()

        for ((_, i) in arr) {
            var add = true
            while (directions[i] == 'L' && stack.isNotEmpty() && directions[stack.last()] == 'R') {
                if (healths[i] == healths[stack.last()]) {
                    stack.removeAt(stack.lastIndex)
                    add = false
                    break
                }
                if (healths[i] < healths[stack.last()]) {
                    healths[stack.last()] -= 1
                    add = false
                    break
                } else {
                    healths[i] -= 1
                    stack.removeAt(stack.lastIndex)
                }
            }
            if (add) {
                stack.add(i)
            }
        }

        stack.sort()

        return stack.map { healths[it] }
    }
}

fun main() {
    val solution = SolutionMakeTheIntegerZero()

    val positions1 = intArrayOf(5, 4, 3, 2, 1)
    val healths1 = intArrayOf(2, 17, 9, 15, 10)
    val directions1 = "RRRRR"
    println(solution.survivedRobotsHealths(positions1, healths1, directions1))
    // Output: [2, 17, 9, 15, 10]

    val positions2 = intArrayOf(3, 5, 2, 6)
    val healths2 = intArrayOf(10, 10, 15, 12)
    val directions2 = "RLRL"
    println(solution.survivedRobotsHealths(positions2, healths2, directions2))
    // Output: [14]

    val positions3 = intArrayOf(1, 2, 5, 6)
    val healths3 = intArrayOf(10, 10, 11, 11)
    val directions3 = "RLRL"
    println(solution.survivedRobotsHealths(positions3, healths3, directions3))
    // Output: []
}
