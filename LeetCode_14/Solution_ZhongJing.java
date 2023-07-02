package LeetCode_14;

/**
 * 日期：2023-07-02 <br>
 * 作者：仲景
 */
public class Solution_ZhongJing {
    public String longestCommonPrefix(String[] strs) {

        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // 计算strs[i]和公共前缀的公共前缀
            pre = m(strs[i], pre);
            if(pre.length() == 0)
                return "";
        }

        return pre;
    }

    /**
     求两个字符串的公共前缀，没有返回null
     */
    public String m(String s1, String s2) {
        int index = 0;

        while(index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index))
                index++;
            else
                break;
        }

        return s1.substring(0, index);
    }
}
