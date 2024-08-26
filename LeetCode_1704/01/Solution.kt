package LeetCode_1704.`01`

/**
 * 1704.判断字符串的两半是否相似
 */
class Solution {
    fun halvesAreAlike(s: String): Boolean {
        // 元音字母集合
        val set = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        val mid = s.length / 2
        var preCount = 0
        var sufCount = 0
        for (i in 0..<mid) {
            if (s[i] in set) preCount++
            if (s[mid + i] in set) sufCount++
        }
        return preCount == sufCount
    }
}