package LeetCode_342;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Solution_ZhongJing01 {
    public boolean isPowerOfFour(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        else
            return isPowerOfFour(n / 4);
    }
}
