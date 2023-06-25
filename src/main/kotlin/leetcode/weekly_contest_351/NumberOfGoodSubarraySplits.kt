package leetcode.weekly_contest_351


const val MOD = 1000000007

class Solution {
    fun numberOfGoodSubarraySplits(nums: IntArray): Int {
        if (nums.sum() == 0) {
            return 0
        }

        val idx = mutableListOf<Int>()
        val n = nums.size
        for (i in 0 until n) {
            if (nums[i] == 1) {
                idx.add(i)
            }
        }

        var ans = 1L
        for (j in 0 until idx.size - 1) {
            ans *= idx[j + 1] - idx[j]
            ans %= MOD
        }

        return ans.toInt()
    }
}

fun main() {
    val solution = Solution()

    // Test Case
    val nums = intArrayOf(0,1,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0)
    val output = solution.numberOfGoodSubarraySplits(nums)
    println("Input: ${nums.contentToString()}")
    println("Output: $output")
    println("Expected: 230630552")

    // Test Case 1
    val nums1 = intArrayOf(0, 1, 0, 0, 1)
    val output1 = solution.numberOfGoodSubarraySplits(nums1)
    println("Input: ${nums1.contentToString()}")
    println("Output: $output1")
    println("Expected: 3")
    println()

    // Test Case 2
    val nums2 = intArrayOf(0, 1, 0)
    val output2 = solution.numberOfGoodSubarraySplits(nums2)
    println("Input: ${nums2.contentToString()}")
    println("Output: $output2")
    println("Expected: 1")
    println()

}
