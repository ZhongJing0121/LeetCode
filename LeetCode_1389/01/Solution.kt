package LeetCode_1389.`01`

/**
 * 1389.按既定顺序创建目标数组
 */
class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val target = mutableListOf<Int>()

        index.forEachIndexed { i, v ->
            target.add(v, nums[i])
        }

        return target.toIntArray()
    }
}