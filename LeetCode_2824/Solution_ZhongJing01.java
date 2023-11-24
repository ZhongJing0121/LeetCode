package LeetCode_2824;

import java.util.List;

/**
 * 2824.统计和小于目标的下标对数目
 * 方法一：暴力枚举
 *
 * @author ZhongJing </p>
 * @date 2023/11/24 </p>
 */
public class Solution_ZhongJing01 {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    res++;
                }
            }
        }
        return res;
    }
}
