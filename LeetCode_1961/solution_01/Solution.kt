package LeetCode_1961.solution_01

/**
 * 1961.检查字符串是否为数组前缀
 * Author: 仲景
 * Date: 2024/10/16
 */
class Solution {
    fun isPrefixString(s: String, words: Array<String>): Boolean {
        // s的索引
        var i = 0
        words.forEach { word ->
            word.forEach { c ->
                if (i < s.length && c == s[i]) i++
                // 如果不一样或者s用完了word没完，就不匹配
                else return false
            }
            if (i == s.length) return true
        }
        return false
    }
}