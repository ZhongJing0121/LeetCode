package LeetCode_264.solution_01

import java.util.*

class Solution {
    /**
     * 264. 丑数 II
     */
    fun nthUglyNumber(n: Int): Int {
        // 小根堆
        val minHeap = PriorityQueue<Long>()
        minHeap.offer(1L)
        // 记录添加的丑数
        val numSet = mutableSetOf(1L)
        val nums = listOf(2L, 3L, 5L)

        for (i in 0 until n) {
            val curNum = minHeap.poll()
            if (i == n - 1) return curNum.toInt()
            nums.forEach { num ->
                val nextUgly = num * curNum
                if (nextUgly !in numSet) {
                    minHeap.offer(nextUgly)
                    numSet.add(nextUgly)
                }
            }
        }
        return 1
    }
}