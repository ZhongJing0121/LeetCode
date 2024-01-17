package LeetCode_2744;

/**
 * 2744.最大字符串配对数目
 *
 * @author ZhongJing </p>
 * @date 2024/01/17 </p>
 */
public class Solution_ZhongJing01 {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        var map = new boolean[26][26];
        for (String word : words) {
            int first = word.charAt(0) - 'a';
            int end = word.charAt(1) - 'a';

            if (map[end][first]) {
                res++;
            } else {
                map[first][end] = true;
            }
        }
        return res;
    }
}
