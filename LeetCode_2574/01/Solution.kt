package LeetCode_2574.`01`

import kotlin.math.abs

/**
 * 2574.左右元素和的差值
 */
class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val prefixArr = IntArray(nums.size)
        val suffixArr = IntArray(nums.size)
        // 之前的总和
        var prefix = 0
        // 之后的总和
        var suffix = 0
        for (i in nums.indices) {
            prefixArr[i] = prefix.also { prefix += nums[i] }
            suffixArr[nums.lastIndex - i] = suffix.also { suffix += nums[nums.lastIndex - i] }
        }
        return prefixArr.mapIndexed { index, pre ->
            abs(pre - suffixArr[index])
        }.toIntArray()
    }
}