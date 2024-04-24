package LeetCode_2287;

/**
 * 2287.重排字符形成目标字符串
 */
public class Solution_ZhongJing01 {
    public int rearrangeCharacters(String s, String target) {
        var countMap = new int[26];
        var targetCharCount = new int[26];
        for (int i = 0; i < target.length(); i++) {
            targetCharCount[target.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            countMap[s.charAt(i) - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < target.length(); i++) {
            var c = target.charAt(i) - 'a';
            min = Math.min(countMap[c] / targetCharCount[c], min);
        }

        return min;
    }
}
