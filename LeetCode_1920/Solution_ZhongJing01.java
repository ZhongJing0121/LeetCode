package LeetCode_1920;

/**
 * 1920.基于排列构建数组
 */
public class Solution_ZhongJing01 {
    public int[] buildArray(int[] nums) {
        var res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
