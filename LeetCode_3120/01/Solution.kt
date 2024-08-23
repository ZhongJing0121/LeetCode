package LeetCode_3120.`01`

/**
 * 3120.统计特殊字母的数量 I
 */
class Solution {
    fun numberOfSpecialChars(word: String): Int {
        val lower = IntArray(27)
        val upper = IntArray(27)

        word.forEach { c ->
            when (c) {
                in 'a'..'z' -> {
                    lower[c - 'a']++
                }

                in 'A'..'Z' -> {
                    upper[c - 'A']++
                }
            }
        }

        var res = 0
        for (i in lower.indices) {
            if (lower[i] != 0 && upper[i] != 0) res++
        }
        return res
    }
}