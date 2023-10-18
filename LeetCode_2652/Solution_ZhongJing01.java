package LeetCode_2652;

/**
 * 2652. 倍数求和
 *
 * @author ZhongJing </p>
 * @date 2023/10/18 </p>
 */
public class Solution_ZhongJing01 {
    public int sumOfMultiples(int n) {
        var res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                res += i;
            }
        }
        return res;
    }
}
