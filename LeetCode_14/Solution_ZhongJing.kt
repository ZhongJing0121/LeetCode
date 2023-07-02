package LeetCode_14

/**
 * 日期：2023-07-02 <br>
 * 作者：仲景
 */
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val len = strs.size
        var i = 1
        var prefix = strs[0]
        while (i < len) {
            prefix = f(strs[i++], prefix)
        }

        return prefix
    }

    // 求两个字符串的最长公共前缀
    fun f(str1: String, str2: String): String {
        val len1 = str1.length
        val len2 = str2.length
        if (len1 == 0 || len2 == 0) {
            return ""
        }
        var prefix = StringBuilder()
        var i = 0

        while (i < len1 && i < len2) {
            if (str1[i] == str2[i]) {
                prefix.append(str1[i++])
            } else {
                return prefix.toString()
            }
        }

        return prefix.toString()
    }
}
