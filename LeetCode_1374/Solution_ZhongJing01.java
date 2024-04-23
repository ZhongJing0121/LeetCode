package LeetCode_1374;

/**
 * 1374.生成每种字符都是奇数个的字符串
 */
public class Solution_ZhongJing01 {
    public String generateTheString(int n) {
        var sb = new StringBuilder();
        var sLen = 0;
        var bLen = 0;

        // 如果n是偶数
        if (n % 2 == 0) {
            sLen = n - 1;
            bLen = 1;
        } else {
            sLen = n;
        }

        sb.append("s".repeat(sLen));
        sb.append("b".repeat(bLen));

        return sb.toString();
    }
}
