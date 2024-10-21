package LeetCode_2864.solution_01

class Solution {
    /**
     * 2864.最大二进制奇数
     * Author: 仲景
     * Date: 2024/10/21
     */
    fun maximumOddBinaryNumber(s: String): String {
        // 统计0和1的个数
        var zeroCount = 0
        var oneCount = 0
        s.forEach { c ->
            if (c == '0') zeroCount++
            if (c == '1') oneCount++
        }
        val sb = StringBuilder()
        while (oneCount > 1) {
            sb.append('1')
            oneCount--
        }
        while (zeroCount-- > 0) {
            sb.append('0')
        }
        return sb.append('1').toString()
    }
}