package LeetCode_2707;

import java.util.Set;

/**
 * 2707.字符串中的额外字符
 * 动态规划
 *
 * @author ZhongJing </p>
 * @date 2024/01/09 </p>
 */
public class Solution_ZhongJing03 {
    public int minExtraChar(String s, String[] dictionary) {
        int len = s.length();
        Set<String> set = Set.of(dictionary);

        // 从s[0]到s[i]的最小额外字符数
        int[] dp = new int[len + 1];

        for (int i = 0; i < s.length(); i++) {
            // 假设当前字符是多出来的字符时的最小额外字符数
            dp[i + 1] = dp[i] + 1;

            // 如果选当前字符
            for (int j = 0; j <= i; j++) {
                if (set.contains(s.substring(j, i + 1))) {
                    // 假设当前字符不是额外字符时，最小额外字符数
                    dp[i + 1] = Math.min(dp[i + 1], dp[j]);
                }
            }
        }
        return dp[len];
    }
}
