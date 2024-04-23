package LeetCode_2278;

/**
 * 2278.字母在字符串中的百分比
 */
public class Solution_ZhongJing01 {
    public int percentageLetter(String s, char letter) {
        var count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        return count * 100 / s.length();
    }
}
