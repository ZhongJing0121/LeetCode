package LeetCode_2169;

public class Solution_ZhongJing01 {
    /**
     * 2169.得到0的操作数
     */
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }
}
