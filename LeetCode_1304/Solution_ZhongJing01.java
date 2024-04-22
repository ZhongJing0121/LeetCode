package LeetCode_1304;

public class Solution_ZhongJing01 {
    /**
     * 1304.和为零的 N 个不同整数
     */
    public int[] sumZero(int n) {
        var res = new int[n];
        for (int i = 1, j = 1; i <= n / 2; i++, j += 2) {
            res[j - 1] = -i;
            res[j] = i;
        }

        return res;
    }
}
