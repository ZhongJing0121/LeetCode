package LeetCode_3151.LeetCode_3151_01

/**
 * 3151.特殊数组 I
 */
class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        if (nums.size < 2) return true

        for (i in 1 until nums.size) {
            if (nums[i] % 2 == nums[i - 1] % 2) return false
        }
        return true
    }
}