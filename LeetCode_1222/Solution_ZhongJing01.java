package LeetCode_1222;

import java.util.ArrayList;
import java.util.List;

/**
 * 1222.可以攻击国王的皇后
 *
 * @author ZhongJing </p>
 * @date 2023/09/14 </p>
 */
public class Solution_ZhongJing01 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        // 初始化棋盘
        var chessboard = new int[8][8];
        for (int[] queen : queens) {
            chessboard[queen[0]][queen[1]] = 1;
        }
        // 8个方向的偏移量
        int[][] offsets = new int[][]{
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1},
                {-1, -1},
                {-1, 1},
                {1, -1},
                {1, 1}
        };

        var res = new ArrayList<List<Integer>>();
        for (int[] offset : offsets) {
            var curRes = process(chessboard, king[0], king[1], offset);
            if (curRes != null) {
                res.add(curRes);
            }
        }

        return res;
    }

    public List<Integer> process(int[][] chessboard, int x, int y, int[] offset) {
        // 如果越界直接返回null
        if (x >= 8 || x < 0 || y >= 8 || y < 0) {
            return null;
        }

        // 如果碰到第一个皇后，直接返回皇后下标
        if (chessboard[x][y] != 0) {
            return List.of(x, y);
        }

        // 如果当前位置没有皇后，继续找
        return process(chessboard, x + offset[0], y + offset[1], offset);
    }
}
