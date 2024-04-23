package LeetCode_1281;

/**
 * 1281.整数的各位积和之差
 */
public class Solution_ZhongJing01 {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        while (n != 0) {
            var cur = n % 10;
            product *= cur;
            sum += cur;
            n /= 10;
        }

        return product - sum;
    }
}
