package LeetCode_485;

/**
 * 485.最大连续 1 的个数
 *
 * @author ZhongJing </p>
 * @date 2024/01/19 </p>
 */
public class Solution_ZhongJing01 {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 最大范围，首先考虑滑动窗口
        var left = 0;
        var right = 0;
        var max = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                right++;
            } else {
                max = Math.max(max, right - left);
                left = right + 1;
                right++;
            }
        }

        return Math.max(max, right - left);
    }
}
