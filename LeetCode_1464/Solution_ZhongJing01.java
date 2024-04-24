package LeetCode_1464;

/**
 * 1464.数组中两元素的最大乘积
 */
public class Solution_ZhongJing01 {
    public int maxProduct(int[] nums) {
        int max1 = nums[0] > nums[1] ? 0 : 1, max2 = max1 == 0 ? 1 : 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[max1]) {
                max2 = max1;
                max1 = i;
            } else if (nums[i] > nums[max2]) {
                max2 = i;
            }
        }

        return (nums[max1] - 1) * (nums[max2] - 1);
    }
}
