package LeetCode_3046.`01`

/**
 * 3046.分割数组
 */
class Solution {
    fun isPossibleToSplit(nums: IntArray): Boolean {
        // 判断是不是有数字出现次数超过2
        val numMap = IntArray(101)
        nums.forEach {
            numMap[it]++
            if (numMap[it] > 2) return false
        }
        return true
    }
}