package LeetCode_2824;

import java.util.Collections;
import java.util.List;

/**
 * 2824.统计和小于目标的下标对数目
 * 方法二：双指针
 *
 * @author ZhongJing </p>
 * @date 2023/11/24 </p>
 */
public class Solution_ZhongJing02 {
    public int countPairs(List<Integer> nums, int target) {
        // 记录结果数量
        int res = 0;

        // 排序
        Collections.sort(nums);

        // 双指针
        int left = 0, right = nums.size() - 1;

        // 遍历数组
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                res += right - left;
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
