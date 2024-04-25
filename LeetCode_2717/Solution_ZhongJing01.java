package LeetCode_2717;

/**
 * 2717.半有序排列
 */
public class Solution_ZhongJing01 {
    public int semiOrderedPermutation(int[] nums) {
        var len = nums.length;
        // 特殊情况处理：如果已经是半有序
        if (nums[0] == 1 && nums[len - 1] == len) return 0;

        // 查找1的最左边位置
        var leftIndex = findNumFirstIndex(nums, 1);

        // 查找len的最右边位置
        var rightIndex = findNumLastIndex(nums, len);

        return leftIndex + len - rightIndex - 1 - (leftIndex > rightIndex ? 1 : 0);
    }

    public int findNumFirstIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public int findNumLastIndex(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
