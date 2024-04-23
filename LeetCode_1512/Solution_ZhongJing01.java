package LeetCode_1512;

import java.util.HashMap;

/**
 * 1512.好数对的数目
 */
public class Solution_ZhongJing01 {
    public int numIdenticalPairs(int[] nums) {
        var numMap = new HashMap<Integer, Integer>();
        var res = 0;
        for (int num : nums) {
            var numCount = numMap.getOrDefault(num, 0);
            if (numCount > 0) {
                res += numCount;
            }
            numMap.put(num, numCount + 1);
        }
        return res;
    }
}
