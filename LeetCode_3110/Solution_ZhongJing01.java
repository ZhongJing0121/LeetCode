package LeetCode_3110;

/**
 * 3110.字符串的分数
 */
public class Solution_ZhongJing01 {
    public int scoreOfString(String s) {
        int sum = 0;

        for (int i = 1; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }

        return sum;
    }
}
