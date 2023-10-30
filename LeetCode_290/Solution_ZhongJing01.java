package LeetCode_290;

import java.util.HashMap;
import java.util.Map;

/**
 * 290.单词规律
 *
 * @author ZhongJing </p>
 * @date 2023/10/30 </p>
 */
public class Solution_ZhongJing01 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();

        String[] str = s.split(" ");

        if (pattern.length() != str.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = str[i];

            if ((patternMap.containsKey(p) && !patternMap.get(p).equals(word)) || (strMap.containsKey(word) && strMap.get(word) != p)) {
                return false;
            }
            patternMap.put(p, word);
            strMap.put(word, p);
        }

        return true;
    }
}
