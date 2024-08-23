package LeetCode_2595.`01`

/**
 * 2595.奇偶位数
 */
class Solution {
    fun evenOddBit(n: Int): IntArray {
        var num = n
        val res = IntArray(2)
        var resIndex = 0
        while (num > 0) {
            res[resIndex] += num and 1
            num = num shr 1
            resIndex = resIndex xor 1
        }
        return res
    }
}