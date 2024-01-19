package LeetCode_463;

/**
 * 463.岛屿的周长
 *
 * @author ZhongJing </p>
 * @date 2024/01/19 </p>
 */
public class Solution_ZhongJing01 {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0, len = grid[0].length; j < len; j++) {
                // 只要计算任意一个岛屿就可以
                if (grid[i][j] == 1)
                    return def(grid, i, j);
            }
        }
        return 0;
    }

    public int def(int[][] grid, int i, int j) {
        // 如果越界，说明这个方向是水，周长+1
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return 1;
        // 如果碰到水，周长+1
        if (grid[i][j] == 0)
            return 1;
        // 如果碰到已经计算过的岛屿，直接返回0
        if (grid[i][j] == -1)
            return 0;
        // 如果是岛屿，标记为-1
        grid[i][j] = -1;
        return def(grid, i - 1, j)
                + def(grid, i + 1, j)
                + def(grid, i, j - 1)
                + def(grid, i, j + 1);
    }
}
