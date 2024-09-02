package LeetCode_973.`01`

import java.util.*

/**
 * 973.最接近原点的 K 个点
 */
class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        // 创建大根堆
        val maxHeap = PriorityQueue<IntArray> { i, j -> i[1] - j[1] }

        // 遍历数组，入堆
        points.forEachIndexed { i, v ->
            maxHeap.offer(intArrayOf(i, v[0] * v[0] + v[1] * v[1]))
        }

        // 弹出k个
        return Array(k) { points[maxHeap.poll()[0]] }
    }
}