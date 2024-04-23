package LeetCode_1295;

/**
 * 1295.统计位数为偶数的数字
 */
public class Solution_ZhongJing01 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (getNumberBit(num) % 2 == 0) count++;
        }
        return count;
    }

    /**
     * 求数字有多少位
     */
    public int getNumberBit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
