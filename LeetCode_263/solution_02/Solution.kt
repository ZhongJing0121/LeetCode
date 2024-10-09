package LeetCode_263.solution_02

class Solution {
    /**
     * 263.丑数
     */
    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false
        var num = n
        while (num % 2 == 0) num /= 2
        while (num % 3 == 0) num /= 3
        while (num % 5 == 0) num /= 5
        return num == 1
    }
}