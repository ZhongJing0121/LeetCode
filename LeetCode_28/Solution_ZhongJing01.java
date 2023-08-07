package LeetCode_28;

/**
 * 题目：28. 找出字符串中第一个匹配项的下标
 *
 * @author ZhongJing </p>
 * @date 2023/08/07 </p>
 */
public class Solution_ZhongJing01 {
    public int strStr(String haystack, String needle) {
        // 如果两个字符串为空，或者要匹配的字符串比原字符串还长，一定找不到
        if (haystack == null || needle == null || needle.length() < 1 || haystack.length() < needle.length()) {
            return -1;
        }
        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();

        int x = 0;
        int y = 0;

        int[] next = nextArray(str2);

        // 比较
        while (x < str1.length && y < str2.length) {
            if (str1[x] == str2[y]) {
                x++;
                y++;
            } else if (next[y] == -1) { // y == 0
                x++;
            } else {
                y = next[y];
            }
        }

        // 如果上面循环结束之后y越界，一定是找到了匹配的字段
        return y == str2.length ? x - y : -1;
    }

    public int[] nextArray(char[] str) {
        if (str.length == 1) {
            return new int[]{-1};
        }

        int[] next = new int[str.length];

        next[0] = -1;
        next[1] = 0;

        int i = 2;
        int preIndex = 0;

        while (i < next.length) {
            if (str[i - 1] == str[preIndex]) {
                next[i++] = ++preIndex;
            } else if (preIndex > 0) {
                preIndex = next[preIndex];
            } else {
                next[i++] = 0;
            }
        }

        return next;
    }
}
