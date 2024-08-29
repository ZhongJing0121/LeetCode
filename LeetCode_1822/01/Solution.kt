package LeetCode_1822.`01`

/**
 * 1822.数组元素积的符号
 */
class Solution {
    fun arraySign(nums: IntArray): Int {
        // 记录负数的个数
        var count = 0
        nums.forEach { num ->
            if (num == 0) return 0
            if (num < 0) {
                count++
            }
        }
        return if (count % 2 == 0) 1 else -1
    }
}