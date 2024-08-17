package LeetCode_1455.LeetCode_1455_02

/**
 * 1455.检查单词是否为句中其他单词的前缀
 */
class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        val words = sentence.split(" ")
        words.forEachIndexed { i, word ->
            if (startWith(word, searchWord)) return i + 1
        }
        return -1
    }

    /**
     * str2是否是str1的前缀
     */
    private fun startWith(str1: String, str2: String): Boolean {
        if (str2.length > str1.length) return false
        str2.forEachIndexed { i, c ->
            if (str2[i] != str1[i]) return false
        }
        return true
    }
}