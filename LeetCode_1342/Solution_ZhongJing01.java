package LeetCode_1342;

/**
 * 1342.将数字变成 0 的操作次数
 */
public class Solution_ZhongJing01 {
    public int numberOfSteps(int num) {
        var count = 0;

        while (num != 0) {
            count++;
            if (num % 2 == 0) num /= 2;
            else num -= 1;
        }

        return count;
    }
}
