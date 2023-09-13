package LeetCode_2596;

import java.util.HashMap;

/**
 * 2596.检查骑士巡视方案
 *
 * @author ZhongJing </p>
 * @date 2023/09/13 </p>
 */
public class Solution_ZhongJing01 {
    public boolean checkValidGrid(int[][] grid) {
        var len = grid.length;
        // 遍历二维数组，把每一步的下标都存起来
        var indexMap = new HashMap<Integer, int[]>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                indexMap.put(grid[i][j], new int[]{i, j});
            }
        }

        // 如果0不在左上角，直接返回false
        if (indexMap.get(0)[0] != 0 || indexMap.get(0)[1] != 0) {
            return false;
        }

        // 从0开始一直走，看看下一个数能不能到达
        var curX = 0;
        var curY = 0;
        for (int i = 0; i < len * len - 1; i++) {
            // 下一次的坐标
            var nextX = indexMap.get(i + 1)[0];
            var nextY = indexMap.get(i + 1)[1];

            if (Math.abs(nextX - curX) * Math.abs(nextY - curY) != 2) {
                return false;
            }
            curX = nextX;
            curY = nextY;
        }
        return true;
    }
}
