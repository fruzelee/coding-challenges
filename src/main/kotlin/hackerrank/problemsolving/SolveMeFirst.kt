package hackerrank.problemsolving

import java.util.*

fun solveMeFirst(num1: Int, num2: Int) = num1 + num2

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
