package LeetCode_441;

/**
 * 441.排列硬币
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing01 {
    public int arrangeCoins(int n) {
        // 差值为1的等差数列公式：sum = k * (k + 1) / 2
        // 结果一定在1行和n行之间
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) / 2 <= n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
