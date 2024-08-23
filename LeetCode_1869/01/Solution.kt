package LeetCode_1869.`01`

import kotlin.math.max

/**
 * 1869.哪种连续子字符串更长
 */
class Solution {
    fun checkZeroOnes(s: String): Boolean {
        var zeroCount = 0
        var oneCount = 0
        var i = 0
        val n = s.length
        while (i < n) {
            var j = i
            while (j < n && s[j] == s[i]) j++
            if (s[i] == '0') {
                zeroCount = max(zeroCount, j - i)
            } else {
                oneCount = max(oneCount, j - i)
            }
            i = j
        }

        return oneCount > zeroCount
    }
}