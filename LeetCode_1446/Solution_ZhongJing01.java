package LeetCode_1446;

/**
 * 1446.连续字符
 */
public class Solution_ZhongJing01 {
    public int maxPower(String s) {
        var maxLen = 0;
        int left = 0, right = 0;

        while (left < s.length()) {
            var leftChar = s.charAt(left);
            right = left + 1;
            while (right < s.length() && s.charAt(right) == leftChar) {
                right++;
            }
            maxLen = Math.max(maxLen, right - left);
            left = right;
        }

        return maxLen;
    }
}
