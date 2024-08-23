package LeetCode_1160.`01`

/**
 * 1160.拼写单词
 */
class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val charsCountMap = getStrCharMap(chars)
        var res = 0
        words.forEach { word ->
            val wordCharCountMap = getStrCharMap(word)
            for (i in 0..25) {
                if (wordCharCountMap[i] > charsCountMap[i]) return@forEach
            }
            res += word.length
        }
        return res
    }

    /**
     * 获取字符串中每个字符出现次数,返回Map
     */
    fun getStrCharMap(s: String): IntArray {
        val res = IntArray(26)
        s.forEach { c ->
            res[c - 'a']++
        }
        return res
    }
}