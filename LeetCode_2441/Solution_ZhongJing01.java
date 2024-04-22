package LeetCode_2441;

import java.util.HashSet;

public class Solution_ZhongJing01 {
    /**
     * 2441.与对应负数同时存在的最大正整数
     */
    public int findMaxK(int[] nums) {
        var set = new HashSet<Integer>();
        var res = -1;
        for (int num : nums) {
            if (set.contains(-num)) {
                res = Math.max(res, Math.abs(num));
            }
            set.add(num);
        }

        return res;
    }
}
