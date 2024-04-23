package LeetCode_3065;

/**
 * 3065.超过阈值的最少操作数 I
 */
public class Solution_ZhongJing01 {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int num : nums) {
            if (num < k) {
                res++;
            }
        }
        return res;
    }
}
