package LeetCode_1913;

import java.util.Arrays;

/**
 * 1913.两个数对之间的最大乘积差
 */
public class Solution_ZhongJing01 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
