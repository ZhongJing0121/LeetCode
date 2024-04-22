package LeetCode_2185;

public class Solution_ZhongJing01 {
    /**
     * 2185.统计包含给定前缀的字符串
     */
    public int prefixCount(String[] words, String pref) {
        var res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) res++;
        }
        return res;
    }
}
