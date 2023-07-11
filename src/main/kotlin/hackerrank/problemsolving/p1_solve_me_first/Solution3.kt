package hackerrank.problemsolving.p1_solve_me_first

import java.util.*

fun solveMeFirstSolution3(num1: Int, num2: Int) = num1 + num2

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirstSolution3(num1, num2)
    println(sum)
}
