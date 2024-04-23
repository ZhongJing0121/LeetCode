package LeetCode_2903;

/**
 * 2903.找出满足差值条件的下标 I
 */
public class Solution_ZhongJing01 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length; i++) {
            for (int cursor = i + indexDifference; cursor < nums.length; cursor++) {
                if (Math.abs(nums[i] - nums[cursor]) >= valueDifference) {
                    return new int[]{i, cursor};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
