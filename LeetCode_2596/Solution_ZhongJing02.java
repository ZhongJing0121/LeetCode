package LeetCode_2596;

/**
 * 2596.检查骑士巡视方案
 *
 * @author ZhongJing </p>
 * @date 2023/09/13 </p>
 */
public class Solution_ZhongJing02 {
    public boolean checkValidGrid(int[][] grid) {
        // 如果骑士不是从左上角开始，直接false
        if (grid[0][0] != 0) {
            return false;
        }

        // 记录已经被访问过的节点
        var accessIndex = new boolean[grid.length][grid.length];

        return process(grid, accessIndex, 0, 0, 0);
    }

    public boolean process(int[][] grid, boolean[][] accessIndex, int curStep, int x, int y) {
        // 是否越界
        if (x < 0 || y < 0 || x >= grid.length || y >= grid.length) {
            return false;
        }

        // 是否已经被踩过
        if (accessIndex[x][y]) {
            return false;
        }

        // 和目标步数一不一样
        if (grid[x][y] != curStep) {
            return false;
        }

        // 如果已经是最后一步了
        if (curStep == grid.length * grid.length - 1) {
            return true;
        }

        // 记录这个坐标被访问过了
        accessIndex[x][y] = true;

        return process(grid, accessIndex, curStep + 1, x - 1, y - 2)
                || process(grid, accessIndex, curStep + 1, x - 2, y - 1)
                || process(grid, accessIndex, curStep + 1, x - 1, y + 2)
                || process(grid, accessIndex, curStep + 1, x - 2, y + 1)
                || process(grid, accessIndex, curStep + 1, x + 1, y - 2)
                || process(grid, accessIndex, curStep + 1, x + 2, y - 1)
                || process(grid, accessIndex, curStep + 1, x + 1, y + 2)
                || process(grid, accessIndex, curStep + 1, x + 2, y + 1);
    }
}
