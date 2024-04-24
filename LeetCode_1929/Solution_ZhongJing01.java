package LeetCode_1929;

/**
 * 1929.数组串联
 */
public class Solution_ZhongJing01 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        var res = new int[n * 2];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }

        return res;
    }
}
