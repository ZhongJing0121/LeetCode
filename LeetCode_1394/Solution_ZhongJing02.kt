package LeetCode_1394

import kotlin.math.max

/**
 * 1394.找出数组中的幸运数
 */
class Solution {
    fun findLucky(arr: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()

        arr.forEach { countMap[it] = countMap.getOrDefault(it, 0) + 1 }

        var res = -1
        countMap.forEach { num, count ->
            if (num == count) {
                res = max(res, num)
            }
        }
        return res
    }
}