package hackerrank.problemsolving.p1_solve_me_first

import java.util.*

fun solveMeFirstSolution2(num1: Int, num2: Int): Int = num1 + num2

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirstSolution2(num1, num2)
    println(sum)
}
