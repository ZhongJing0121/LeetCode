package LeetCode_338;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Solution_ZhongJing01 {
    public int[] countBits(int n) {
        var res = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            res[i] = countOneBits(i);
        }

        return res;
    }

    public int countOneBits(int n) {
        var res = 0;

        while (n > 0) {
            n &= (n - 1);
            res++;
        }

        return res;
    }
}
