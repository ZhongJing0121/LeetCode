package LeetCode_1351;

/**
 * 1351.统计有序矩阵中的负数
 */
public class Solution_ZhongJing01 {
    public int countNegatives(int[][] grid) {
        int res = 0, m = grid.length, n = grid[0].length;

        for (int i = 0, j = n; i < m; i++) {
            while (j > 0 && grid[i][j - 1] < 0) {
                j--;
            }
            res += (n - j);
        }
        return res;
    }
}
