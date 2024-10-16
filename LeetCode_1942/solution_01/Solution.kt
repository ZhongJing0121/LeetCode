package LeetCode_1942.solution_01

class Solution {
    /**
     * 1492.n 的第 k 个因子
     * @date 2024-10-16
     * @author 仲景
     */
    fun kthFactor(n: Int, k: Int): Int {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) {
                count++
                if (count == k) return i
            }
        }
        return -1
    }
}