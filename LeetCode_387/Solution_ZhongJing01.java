package LeetCode_387;

import java.util.HashMap;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Solution_ZhongJing01 {
    public int firstUniqChar(String s) {
        var m = new HashMap<Character, Integer>();
        char[] str = s.toCharArray();
        for (char c : str) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length; i++) {
            if (m.get(str[i]) == 1) return i;
        }

        return -1;
    }
}
