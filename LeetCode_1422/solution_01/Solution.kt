package LeetCode_1422.solution_01

class Solution {
    /**
     * 1422.分割字符串的最大得分
     * Author: 仲景
     * Date: 2024/10/21
     */
    fun maxScore(s: String): Int {
        val len = s.length
        // 如果左边只有1个，其他都在右边的得分
        var sum = s.substring(1).count { it == '1' }
            .let { it -> if (s[0] == '0') it + 1 else it }
        var res = sum
        // 依次把字符从右边移到左边，取最大得分
        for (i in 1 until len - 1) {
            sum += if (s[i] == '0') 1 else -1
            res = maxOf(res, sum)
        }
        return res
    }
}