package LeetCode_953;

import java.util.Arrays;

/**
 * 953.验证外星语词典
 */
public class Solution_ZhongJing01 {
    public boolean isAlienSorted(String[] words, String order) {
        var orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        String[] clone = words.clone();
        Arrays.sort(clone, (s1, s2) -> {
            int n = s1.length(), m = s2.length(), i = 0, j = 0;
            while (i < n && j < m) {
                int c1 = s1.charAt(i) - 'a', c2 = s2.charAt(j) - 'a';
                // 如果首字母符合顺序，后面的就不判断了
                if (c1 != c2) return orderMap[c1] - orderMap[c2];
                i++;
                j++;
            }
            // 如果循环完，j没有完，i完了，长的应该在后面，所以返回1
            if (i < n) return 1;
            // 如果循环完，i完了，短的应该在前面，所以返回-1
            if (j < m) return -1;
            // 都一样，返回0，表示相等
            return 0;
        });

        // 判断排序后的顺序和原来的顺序一致不
        for (int i = 0; i < clone.length; i++) {
            if (!clone[i].equals(words[i])) return false;
        }
        return true;
    }
}
