package LeetCode_819;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 819.最常见的单词
 */
public class Solution_ZhongJing01 {
    public String mostCommonWord(String paragraph, String[] banned) {
        var sb = new StringBuilder();
        var bannedSet = new HashSet<String>(Arrays.asList(banned));
        var wordCountMap = new HashMap<String, Integer>();

        for (int i = 0; i < paragraph.length(); i++) {
            var c = paragraph.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('a' + (c - 'A')));
            } else {
                // 判断sb
                var word = sb.toString();
                sb.setLength(0);
                if (!bannedSet.contains(word) && !word.isBlank()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        var word = sb.toString();
        if (!bannedSet.contains(word) && !word.isBlank()) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // 统计最多次数的word
        int maxCount = Integer.MIN_VALUE;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxWord;
    }
}
