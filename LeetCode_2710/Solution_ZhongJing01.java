package LeetCode_2710;

/**
 * 2710.移除字符串中的尾随零
 */
public class Solution_ZhongJing01 {
    public String removeTrailingZeros(String num) {
        var i = num.length() - 1;
        while (i >= 0 && num.charAt(i) == '0') {
            i--;
        }
        return num.substring(0, i + 1);
    }
}
