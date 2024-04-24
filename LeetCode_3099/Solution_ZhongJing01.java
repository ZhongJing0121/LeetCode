package LeetCode_3099;

/**
 * 3099.哈沙德数
 */
public class Solution_ZhongJing01 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return x % sum == 0 ? sum : -1;
    }
}
