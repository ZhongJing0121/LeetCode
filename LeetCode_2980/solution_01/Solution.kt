package LeetCode_2980.solution_01

/**
 * 2980.检查按位或是否存在尾随零
 * Author: 仲景
 * Date: 2024/10/16
 */
class Solution {
    fun hasTrailingZeros(nums: IntArray): Boolean {
        return nums.count { it % 2 == 0 } > 1
    }
}