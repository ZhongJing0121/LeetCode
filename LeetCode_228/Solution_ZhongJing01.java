package LeetCode_228;

import java.util.ArrayList;
import java.util.List;

/**
 * 228.汇总区间
 *
 * @author ZhongJing </p>
 * @date 2023/09/06 </p>
 */
public class Solution_ZhongJing01 {
    public List<String> summaryRanges(int[] nums) {
        var res = new ArrayList<String>();

        var left = 0;
        var right = 0;

        while (right < nums.length) {
            while (right < nums.length - 1 && nums[right] + 1 == nums[right + 1]) {
                right++;
            }
            var sb = new StringBuilder();
            if (left == right) {
                sb.append(nums[left]);
            } else {
                sb.append(nums[left]).append("->").append(nums[right]);
            }
            res.add(sb.toString());
            left = ++right;
        }

        return res;
    }
}
