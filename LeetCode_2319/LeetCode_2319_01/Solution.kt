package LeetCode_2319.LeetCode_2319_01

/**
 * 2319.判断矩阵是否是一个 X 矩阵
 */
class Solution {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        val n = grid.size
        for (i in 0..<n) {
            for (j in 0..<n) {
                when {
                    // 是对角线
                    i == j || i + j == n - 1 -> if (grid[i][j] == 0) return false
                    // 不是对角线
                    else -> if (grid[i][j] != 0) return false
                }
            }
        }
        return true
    }
}