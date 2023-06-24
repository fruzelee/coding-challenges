package hackerrank

import java.util.*

fun solveMeFirst(num1: Int, num2: Int): Int {
    var sum = 0
    sum = num1 + num2
    return sum
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
