package LeetCode_2788.solution_01

class Solution {
    /**
     * 2788.按分隔符拆分字符串
     * Author: 仲景
     * Date: 2024/10/21
     */
    fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
        return words.flatMap { word -> word.split(separator) }.filter { it.isNotEmpty() }
    }
}