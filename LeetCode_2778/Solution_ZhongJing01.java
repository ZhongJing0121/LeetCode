package LeetCode_2778;

/**
 * 2778.特殊元素平方和
 */
public class Solution_ZhongJing01 {
    public int sumOfSquares(int[] nums) {
        int len = nums.length, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (len % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }

        return sum;
    }
}
