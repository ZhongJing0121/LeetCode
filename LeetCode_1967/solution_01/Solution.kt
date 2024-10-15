package LeetCode_1967.solution_01

class Solution {
    /**
     * 1967.作为子字符串出现在单词中的字符串数目
     */
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        return patterns.count { word.contains(it) }
    }
}