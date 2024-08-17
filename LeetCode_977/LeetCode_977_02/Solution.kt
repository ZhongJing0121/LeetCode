package LeetCode_977.LeetCode_977_02

import kotlin.math.abs

/**
 * 977.有序数组的平方
 */
class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var left = 0
        var right = nums.lastIndex
        val res = IntArray(nums.size)
        var index = res.lastIndex

        while (left <= right) {
            // 选大的
            if (abs(nums[left]) < abs(nums[right])) {
                res[index--] = nums[right] * nums[right--]
            } else {
                res[index--] = nums[left] * nums[left++]
            }
        }

        return res
    }
}