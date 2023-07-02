package LeetCode_01;

import java.util.HashMap;

/**
 * 日期：20223-07-02
 * 作者：仲景
 */
public class Solution_ZhongJing {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var curTarget = target - nums[i];
            if (map.containsKey(curTarget)) {
                return new int[]{map.get(curTarget), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}