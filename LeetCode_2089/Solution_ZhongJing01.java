package LeetCode_2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089.找出数组排序后的目标下标
 * 方法一：两次二分查找到最前和最后等于target的下标，就得到答案
 */
public class Solution_ZhongJing01 {
    public List<Integer> targetIndices(int[] nums, int target) {
        var res = new ArrayList<Integer>();

        Arrays.sort(nums);

        var firstIndex = searchFirstIndex(nums, target);
        var lastIndex = searchLastIndex(nums, target);

        if (firstIndex == -1) {
            return res;
        }

        for (int i = firstIndex; i <= lastIndex; i++) {
            res.add(i);
        }

        return res;
    }

    /**
     * 二分查找数组中target出现的最开始位置，不存在返回-1
     * 给定数组必须是升序的
     */
    public int searchFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    /**
     * 二分查找数组中target出现的最后位置，不存在返回-1
     * 给定数组必须是升序的
     */
    public int searchLastIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
