package LeetCode_303;

/**
 * @author ZhongJing </p>
 * @date 2023/08/17 </p>
 */
public class Solution_ZhongJing01 {
    class NumArray {

        private int[] nums;
        private int[] preArr;

        public NumArray(int[] nums) {
            this.nums = nums;
            // 求前缀和
            preArr = new int[nums.length];
            var sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                preArr[i] = sum;
            }
        }

        public int sumRange(int left, int right) {
            // [left, right]的和就是right的前缀和 - left的前缀和
            // right的前缀和 = A + left + B + right
            // left的前缀和 = A + left
            // 相减 = B + right
            return preArr[right] - preArr[left] + nums[left];
        }
    }
}
