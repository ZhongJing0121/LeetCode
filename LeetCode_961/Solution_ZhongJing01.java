package LeetCode_961;

import java.util.HashSet;

/**
 * 961.在长度 2N 的数组中找出重复 N 次的元素
 */
public class Solution_ZhongJing01 {
    public int repeatedNTimes(int[] nums) {
        var numSet = new HashSet<Integer>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return num;
            }
            numSet.add(num);
        }

        return -1;
    }
}
