package LeetCode_1380.`01`

import kotlin.math.max
import kotlin.math.min

/**
 * 1380.矩阵中的幸运数
 */
class Solution {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val res = mutableListOf<Int>()
        val m = matrix.size
        val n = matrix[0].size

        // 每一行的最小值
        val rowMin = IntArray(m) { Int.MAX_VALUE }
        // 每一列的最大值
        val colMax = IntArray(n)
        matrix.forEachIndexed { i, row ->
            row.forEachIndexed { j, v ->
                rowMin[i] = min(rowMin[i], v)
                colMax[j] = max(colMax[j], v)
            }
        }

        // 遍历矩阵，判断是否为幸运数
        matrix.forEachIndexed { i, row ->
            row.forEachIndexed { j, v ->
                if (v == rowMin[i] && v == colMax[j]) {
                    res.add(v)
                }
            }
        }
        return res
    }
}