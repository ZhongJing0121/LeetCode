package LeetCode_2828;

import java.util.List;

/**
 * 2828.判别首字母缩略词
 */
public class Solution_ZhongJing01 {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;

        var sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }

        return sb.toString().equals(s);
    }
}
