package LeetCode_LCP_50;

/**
 * LCP 50.宝石补给
 *
 * @author ZhongJing </p>
 * @date 2023/09/15 </p>
 */
public class Solution_ZhongJing01 {
    public int giveGem(int[] gem, int[][] operations) {
        // 模拟
        for (int[] operation : operations) {
            var diff = gem[operation[0]] / 2;
            gem[operation[1]] += diff;
            gem[operation[0]] -= diff;
        }

        return diffMaxAndMin(gem);
    }

    private int diffMaxAndMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        var max = arr[0];
        var min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        return max - min;
    }
}
