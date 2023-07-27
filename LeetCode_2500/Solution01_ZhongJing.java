package LeetCode_2500;

import java.util.Arrays;

/**
 * 题目：2500.删除每行中的最大值
 * 日期：2023-07-27
 * 作者：仲景
 */
public class Solution01_ZhongJing {
    public int deleteGreatestValue(int[][] grid) {
        // 给每一行都排序
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }

        int res = 0, colLen = grid.length, rowLen = grid[0].length;
        // 从后往前遍历每一列求最大值累加res
        for (int row = rowLen - 1; row >= 0; row--) {
            int max = Integer.MIN_VALUE;
            for (int col = 0; col < colLen; col++) {
                max = Math.max(max, grid[col][row]);
            }
            res += max;
        }

        return res;
    }
}
