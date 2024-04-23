package LeetCode_1137;

/**
 * 1137.第 N 个泰波那契数
 */
public class Solution_ZhongJing01 {
    public int tribonacci(int n) {
        if (n < 3) {
            if (n == 0) return 0;
            else return 1;
        }
        int t0 = 0, t1 = 1, t2 = 1;

        for (int i = 3; i <= n; i++) {
            var temp = t2;
            t2 = t0 + t1 + t2;
            t0 = t1;
            t1 = temp;
        }

        return t2;
    }
}
