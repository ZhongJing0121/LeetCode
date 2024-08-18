package LeetCode_2124.LeetCode_2124_01

/**
 * 2124.检查是否所有 A 都在 B 之前
 */
class Solution {
    fun checkString(s: String): Boolean {
        val firstB = s.indexOfFirst { it == 'b' }.also { if (it == -1) return true }
        val lastA = s.indexOfLast { it == 'a' }.also { if (it == -1) return true }
        return lastA < firstB
    }
}