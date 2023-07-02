package LeetCode_01

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val m = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val curTarget = target - num
            m[curTarget]?.let { return intArrayOf(index, it) }
            m[num] = index
        }
        return intArrayOf()
    }
}
