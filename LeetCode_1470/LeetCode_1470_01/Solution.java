package LeetCode_1470.LeetCode_1470_01;

/**
 * 1470.重新排列数组
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0, right = nums.length / 2, index = 0;
        var res = new int[nums.length];

        while (index < res.length) {
            res[index++] = nums[left++];
            res[index++] = nums[right++];
        }

        return res;
    }
}
