package LeetCode_2913;

import java.util.HashSet;
import java.util.List;

/**
 * 2913.子数组不同元素数目的平方和 I
 */
public class Solution_ZhongJing01 {
    public int sumCounts(List<Integer> nums) {
        long res = nums.size();
        var set = new HashSet<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                for (int k = i; k <= j; k++) {
                    set.add(nums.get(k));
                }
                res += (long) set.size() * set.size();
                set.clear();
            }
        }

        return (int) res % 1000000007;
    }
}
