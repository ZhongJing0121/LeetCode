package LeetCode_268.solution_03

class Solution {
    /**
     * 268.丢失的数字
     */
    fun missingNumber(nums: IntArray): Int {
        // 等差数列求和
        val sum = (nums.size + 1) * nums.size / 2

        return sum - nums.sum()
    }
}