package LeetCode_2562.LeetCode_2562_01;

/**
 * 2562.找出数组的串联值
 *
 * @author ZhongJing </p>
 * @date 2023/10/12 </p>
 */
public class Solution_ZhongJing01 {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        long res = 0;

        while (left < right) {
            int rightNum = nums[right];
            int leftNum = nums[left];
            int size = 10;
            while (size <= rightNum) {
                size *= 10;
            }
            res += (long) leftNum * size + rightNum;
            right--;
            left++;
        }

        // 处理数组长度为奇数的情况
        if (left == right) {
            res += nums[left];
        }

        return res;
    }
}
