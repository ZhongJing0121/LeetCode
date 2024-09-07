package LeetCode_434;

/**
 * 434.字符串中的单词数
 *
 * @author ZhongJing </p>
 * @date 2024/01/17 </p>
 */
public class Solution_ZhongJing01 {
    public int countSegments(String s) {
        char[] charArray = s.toCharArray();
        int res = 0;
        boolean lock = true;
        for (char c : charArray) {
            if (c != ' ' && lock) {
                lock = false;
                res++;
            }
            if (c == ' ') {
                lock = true;
            }
        }
        return res;
    }
}

