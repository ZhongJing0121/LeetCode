package LeetCode_2169;

public class Solution_ZhongJing02 {
    /**
     * 2169.得到0的操作数
     */
    public int countOperations(int num1, int num2) {
        int count = 0;
        int temp;
        while (num1 > 0) {
            count += num2 / num1;
            temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        return count;
    }
}
