package LeetCode_2810

import java.lang.StringBuilder

class Solution {

    /**
     * 2810.故障键盘
     */
    fun finalString(s: String): String {
        val sb = StringBuilder()
        // 遍历字符串
        s.forEach { c ->
            // 如果当前字符是i就反转，不是i就添加
            c.takeIf { it == 'i' }?.let { sb.reverse() } ?: sb.append(c)
        }
        return sb.toString()
    }
}