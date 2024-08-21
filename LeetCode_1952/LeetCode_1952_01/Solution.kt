package LeetCode_1952.LeetCode_1952_01

/**
 * 1952. 三除数
 */
class Solution {
    fun isThree(n: Int): Boolean {
        var i = 1
        var res = 0
        while (i * i <= n) {
            if (n % i == 0) {
                res++
                if (n / i != i) {
                    res++
                }
            }
            i++
        }
        return res == 3
    }
}