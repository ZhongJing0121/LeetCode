package LeetCode_860_01;

/**
 * 题目：860. 柠檬水找零
 * 日期：2023-07-22
 * 作者：仲景
 */
public class Solution01_ZhongJing {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;
        for (int money : bills) {
            if (money == 5) {
                fiveCount++;
            } else if (money == 10) {
                fiveCount--;
                tenCount++;
            } else if (tenCount > 0) {
                tenCount--;
                fiveCount--;
            } else {
                fiveCount -= 3;
            }

            if (fiveCount < 0) {
                return false;
            }
        }

        return true;
    }
}
