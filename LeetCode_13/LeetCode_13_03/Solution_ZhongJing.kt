package LeetCode_13.LeetCode_13_03

/**
 * 日期：2023-07-02 <br>
 * 作者：仲景
 */
class Solution {
    fun romanToInt(s: String): Int {
        var numMap = mapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )

        var res = 0

        // 遍历字符串
        for (i in 0 until s.length - 1) {
            if (numMap[s[i]]!! < numMap[s[i + 1]]!!) {
                res -= numMap[s[i]]!!
            } else {
                res += numMap[s[i]]!!
            }
        }

        res += numMap[s[s.length - 1]]!!

        return res
    }
}
