package LeetCode_3142.`01`

/**
 * 3142.判断矩阵是否满足条件
 */
class Solution {
    fun satisfiesConditions(grid: Array<IntArray>): Boolean {
        val colLen = grid.lastIndex
        val rowLen = grid[0].lastIndex
        for (i in 0..colLen) {
            for (j in 0..rowLen) {
                if (i < colLen && grid[i + 1][j] != grid[i][j]) return false
                if (j < rowLen && grid[i][j] == grid[i][j + 1]) return false
            }
        }
        return true
    }
}