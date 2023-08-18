package LeetCode_389;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Solution_ZhongJing01 {
    public char findTheDifference(String s, String t) {
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();
        var sCountMap = new int[26];
        var tCountMap = new int[26];

        for (char c : sArr) sCountMap[c - 'a']++;
        for (char c : tArr) tCountMap[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (sCountMap[i] != tCountMap[i]) return (char) ('a' + i);
        }

        return ' ';
    }
}
