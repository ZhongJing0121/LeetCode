package LeetCode_2171;

import java.util.Arrays;

/**
 * 2171.拿出最少数目的魔法豆
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing01 {
    public long minimumRemoval(int[] beans) {
        // 给数组排序
        Arrays.sort(beans);

        long sum = 0L;
        long max = 0L;
        var len = beans.length;
        for (int i = 0; i < len; i++) {
            // 计算总数
            sum += beans[i];
            // 如果以当前元素为基准，计算最多能留下多少豆子
            max = Math.max(max, (long) (len - i) * beans[i]);
        }

        // 总数减去最多能留下的豆子数，就是最少需要拿走的豆子数
        return sum - max;
    }
}
