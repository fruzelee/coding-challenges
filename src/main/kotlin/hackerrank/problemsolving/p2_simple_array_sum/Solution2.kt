package hackerrank.problemsolving.p2_simple_array_sum

fun simpleArraySum2(ar: Array<Int>): Int {
    var sum = 0

    ar.forEach { sum += it }

    return sum
}

fun main(args: Array<String>) {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = simpleArraySum2(ar)

    println(result)
}

/*
Sample Input

6
1 2 3 4 10 11

*/
