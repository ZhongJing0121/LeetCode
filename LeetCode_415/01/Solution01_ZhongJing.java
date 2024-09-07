package LeetCode_415;

/**
 * 题目：415. 字符串相加
 * 日期：2023-07-17
 * 作者：仲景
 */
public class Solution01_ZhongJing {
    public String addStrings(String num1, String num2) {
        var len1 = num1.length();
        var len2 = num2.length();
        var d = 0;
        var p1 = len1 - 1;
        var p2 = len2 - 1;
        var sb = new StringBuilder();

        while (p1 >= 0 || p2 >= 0) {
            var n1 = 0;
            var n2 = 0;

            if (p1 >= 0) {
                n1 = num1.charAt(p1--) - '0';
            }

            if (p2 >= 0) {
                n2 = num2.charAt(p2--) - '0';
            }

            var curSum = n1 + n2 + d;
            sb.append(Integer.toString(curSum % 10));
            d = curSum / 10;
        }

        if (d != 0) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
