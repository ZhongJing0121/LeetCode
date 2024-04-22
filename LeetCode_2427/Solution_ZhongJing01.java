package LeetCode_2427;

public class Solution_ZhongJing01 {
    /**
     * 2427.公因子的数目
     */
    public int commonFactors(int a, int b) {
        int c = gcd(a, b);
        int res = 0;
        for (int i = 1; i * i <= c; i++) {
            if (c % i == 0) {
                res++;
                if (i * i != c) {
                    res++;
                }
            }
        }
        return res;
    }

    /**
     * 求a和b的最大公约数
     */
    public int gcd(int a, int b) {
        // 辗转相除
        while (b != 0) {
            a %= b;
            // 利用异或运算交换a和b
            a ^= b;
            b ^= a;
            a ^= b;
        }
        return a;
    }
}
