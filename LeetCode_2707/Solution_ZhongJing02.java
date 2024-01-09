package LeetCode_2707;

import java.util.Arrays;
import java.util.Set;

/**
 * 2707.字符串中的额外字符
 * 记忆化搜索
 *
 * @author ZhongJing </p>
 * @date 2024/01/09 </p>
 */
public class Solution_ZhongJing02 {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = Set.of(dictionary);
        int[] cache = new int[s.length()];
        Arrays.fill(cache, -1);
        return process(s, set, s.length() - 1, cache);
    }

    private int process(String s, Set<String> set, int index, int[] cache) {
        if (index < 0) {
            return 0;
        }

        if (cache[index] != -1) {
            return cache[index];
        }

        int min = process(s, set, index - 1, cache) + 1;

        for (int j = 0; j <= index; j++) {
            if (set.contains(s.substring(j, index + 1))) {
                min = Math.min(min, process(s, set, j - 1, cache));
            }
        }

        cache[index] = min;
        return min;
    }
}
