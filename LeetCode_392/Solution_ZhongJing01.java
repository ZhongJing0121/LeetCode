package LeetCode_392;

/**
 * @author ZhongJing </p>
 * @date 2023/08/22 </p>
 */
public class Solution_ZhongJing01 {
    public boolean isSubsequence(String s, String t) {
        var s1 = s.toCharArray();
        var s2 = t.toCharArray();

        var i = 0;
        var j = 0;

        var len1 = s1.length;
        var len2 = s2.length;

        while (i < len1 && j < len2) {
            if (s1[i] == s2[j]) {
                i++;
            }
            j++;
        }

        return i == len1;
    }
}
