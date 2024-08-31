package LeetCode_1413.`01`

import kotlin.math.min

/**
 * 1413.逐步求和得到正数的最小值
 */
class Solution {
    fun minStartValue(nums: IntArray): Int {
        var minPreSum = Int.MAX_VALUE
        var preSum = 1
        nums.forEach { num ->
            preSum += num
            minPreSum = min(preSum, minPreSum)
        }
        return if (minPreSum >= 1) 1 else 2 - minPreSum
    }
}