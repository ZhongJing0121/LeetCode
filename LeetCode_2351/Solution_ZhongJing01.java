package LeetCode_2351;

import java.util.HashSet;

/**
 * 2351.第一个出现两次的字母
 */
public class Solution_ZhongJing01 {
    public char repeatedCharacter(String s) {
        var charSet = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (charSet.contains(c)) {
                return c;
            }
            charSet.add(c);
        }

        return '0';
    }
}
