package LeetCode_3028;

/**
 * 3028.边界上的蚂蚁
 */
public class Solution_ZhongJing01 {
    public int returnToBoundaryCount(int[] nums) {
        int res = nums[0] == 0 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            if (nums[i] == 0) {
                res++;
            }
        }

        return res;
    }
}
