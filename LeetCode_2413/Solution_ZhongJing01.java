package LeetCode_2413;

/**
 * 2413.最小偶倍数
 */
public class Solution_ZhongJing01 {
    public int smallestEvenMultiple(int n) {
        if (n < 2) return 2;
        return n % 2 == 0 ? n : n * 2;
    }
}
