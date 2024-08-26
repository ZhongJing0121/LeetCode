package LeetCode_2485.`01`

/**
 * 2485.找出中枢整数
 */
class Solution {
    fun pivotInteger(n: Int): Int {
        // 等差数列求和
        val sum = (1 + n) * n / 2
        var preSum = 0
        for (i in 1..n) {
            if (preSum * 2 == sum - i) return i
            preSum += i
        }
        return -1
    }
}