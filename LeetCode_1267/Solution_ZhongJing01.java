package LeetCode_1267;

import java.util.HashMap;

/**
 * 1267.统计参与通信的服务器
 *
 * @author ZhongJing </p>
 * @date 2023/08/24 </p>
 */
public class Solution_ZhongJing01 {
    public int countServers(int[][] grid) {
        var lenX = grid.length;
        var lenY = grid[0].length;
        var xMap = new HashMap<Integer, Integer>();
        var yMap = new HashMap<Integer, Integer>();

        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                if (grid[x][y] == 1) {
                    // 统计每一行为1的个数
                    xMap.put(x, xMap.getOrDefault(x, 0) + 1);
                    // 统计每一列位1的个数
                    yMap.put(y, yMap.getOrDefault(y, 0) + 1);
                }
            }
        }

        var res = 0;

        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                // 如果当前位置为1，并且这一行或者这一列不止他一个1，那就++
                if (grid[x][y] == 1 && (xMap.get(x) > 1 || yMap.get(y) > 1)) res++;
            }
        }

        return res;
    }
}
