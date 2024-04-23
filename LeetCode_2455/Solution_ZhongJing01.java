package LeetCode_2455;

/**
 * 2455.可被三整除的偶数的平均值
 */
public class Solution_ZhongJing01 {
    public int averageValue(int[] nums) {
        int res = 0, count = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                res += num;
                count++;
            }
        }
        return count == 0 ? 0 : res / count;
    }
}
