package leetcode_1337.solution_02

import java.util.*

class Solution {
    /**
     * 1337.矩阵中战斗力最弱的 K 行
     * 备注：堆+二分做法
     */
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        // Pair(战斗力,索引)
        val maxHeap = PriorityQueue<Pair<Int, Int>>(
            compareByDescending<Pair<Int, Int>> { it.first }.thenByDescending { it.second }
        )

        // 遍历数组
        mat.forEachIndexed { index, row ->
            val lastNumIndex = findLastNum(row, 1)
            if (maxHeap.size == k && lastNumIndex < maxHeap.peek().first) maxHeap.poll()
            if (maxHeap.size < k) maxHeap.offer(Pair(lastNumIndex, index))
        }

        val res = IntArray(k)
        for (i in res.indices) {
            res[k - i - 1] = maxHeap.poll().second
        }
        return res
    }

    /**
     * 找到目标数组中最后一个target的索引位置，找不到返回-1
     */
    fun findLastNum(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var res = -1
        while (left <= right) {
            val mid = left + ((right - left) shr 1)
            if (nums[mid] == target) {
                res = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return res
    }
}