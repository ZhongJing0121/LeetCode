package LeetCode_56;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 56.合并区间
 *
 * @author ZhongJing </p>
 * @date 2023/09/06 </p>
 */
public class Solution_ZhongJing01 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        var res = new ArrayList<int[]>();
        for (int[] interval : intervals) {
            var num1 = interval[0];
            var num2 = interval[1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < num1) {
                // 如果没有合并过的区间，获取之前区间的最大值小于当前区间的最小值，就合并不了
                res.add(new int[]{num1, num2});
            } else {
                // 可以合并，更新范围的最大值
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], num2);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
