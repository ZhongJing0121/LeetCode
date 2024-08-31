package LeetCode_3168.`01`

import kotlin.math.max

/**
 * 3168.候诊室中的最少椅子数
 */
class Solution {
    fun minimumChairs(s: String): Int {
        var maxChair = 0
        var tmp = 0

        s.forEach { c ->
            when (c) {
                'E' -> {
                    tmp++
                    maxChair = max(maxChair, tmp)
                }

                'L' -> {
                    tmp--
                }
            }
        }

        return maxChair
    }
}