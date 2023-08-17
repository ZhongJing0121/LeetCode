package LeetCode_326;

/**
 * @author ZhongJing </p>
 * @date 2023/08/17 </p>
 */
public class Solution_ZhongJing01 {
    public boolean isPowerOfThree(int n) {
        var resArr = new int[]{
                1,
                3,
                9,
                27,
                81,
                243,
                729,
                2187,
                6561,
                19683,
                59049,
                177147,
                531441,
                1594323,
                4782969,
                14348907,
                43046721,
                129140163,
                387420489,
                1162261467
        };

        for (int j : resArr) if (n == j) return true;
        return false;
    }
}
