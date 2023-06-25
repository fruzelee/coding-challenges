class SolutionCountBeautifulPairs {
    private fun gcd(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b
        while (num2 != 0) {
            val temp = num2
            num2 = num1 % num2
            num1 = temp
        }
        return num1
    }

    fun countBeautifulPairs(nums: IntArray): Int {
        val n = nums.size
        var ans = 0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (gcd(getFirstDigit(nums[i]), getLastDigit(nums[j])) == 1) {
                    ans++
                }
            }
        }
        return ans
    }

    private fun getFirstDigit(num: Int): Int {
        var number = num
        while (number >= 10) {
            number /= 10
        }
        return number
    }

    private fun getLastDigit(num: Int): Int {
        return num % 10
    }
}

fun main() {
    val solution = SolutionCountBeautifulPairs()

    // Test case 1
    val nums1 = intArrayOf(2, 5, 1, 4)
    val beautifulPairs1 = solution.countBeautifulPairs(nums1)
    println("Beautiful pairs: $beautifulPairs1") // Expected: 5

    // Test case 2
    val nums2 = intArrayOf(11, 21, 12)
    val beautifulPairs2 = solution.countBeautifulPairs(nums2)
    println("Beautiful pairs: $beautifulPairs2") // Expected: 2
}
