package LeetCode_1784.`01`

/**
 * 1784.检查二进制字符串字段
 */
class Solution {
    fun checkOnesSegment(s: String): Boolean {
        var res = 0
        var i = 0
        while (i < s.length) {
            val c = s[i]
            var j = i
            while (j < s.length && s[j] == c) j++
            if (c == '1') res++
            if (res > 1) return false
            i = j
        }
        return true
    }
}