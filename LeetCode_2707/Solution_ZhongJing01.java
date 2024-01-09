package LeetCode_2707;

import java.util.Set;

/**
 * 2707.字符串中的额外字符
 * 暴力递归方法（LeetCode提交会超时）
 *
 * @author ZhongJing </p>
 * @date 2024/01/09 </p>
 */
public class Solution_ZhongJing01 {

    /**
     * 暴力递归
     */
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = Set.of(dictionary);
        return process(s, set, s.length() - 1);
    }

    /**
     * 暴力递归
     */
    private int process(String s, Set<String> set, int index) {
        if (index < 0) {
            return 0;
        }

        // 假设当前字符是多出来的字符时的最小额外字符数
        int min = process(s, set, index - 1) + 1;

        // 如果选当前字符
        for (int j = 0; j <= index; j++) {
            if (set.contains(s.substring(j, index + 1))) {
                // 假设当前字符不是额外字符时，最小额外字符数
                min = Math.min(min, process(s, set, j - 1));
            }
        }

        return min;
    }
}
