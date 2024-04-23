package LeetCode_2733;

import java.util.Arrays;

/**
 * 2733.既不是最小值也不是最大值
 */
public class Solution_ZhongJing01 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) return -1;
        var arr = new int[]{nums[0], nums[1], nums[2]};
        Arrays.sort(arr);
        return arr[1];
    }
}
