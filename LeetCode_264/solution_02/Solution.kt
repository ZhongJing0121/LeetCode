package LeetCode_264.solution_02

class Solution {
    /**
     * 264. 丑数 II
     */
    fun nthUglyNumber(n: Int): Int {
        val dp = IntArray(n)
        dp[0] = 1
        var (d1, d2, d3) = listOf(0, 0, 0)
        for (i in 1 until n) {
            dp[i] = minOf(dp[d1] * 2, dp[d2] * 3, dp[d3] * 5)
            if (dp[i] == dp[d1] * 2) d1++
            if (dp[i] == dp[d2] * 3) d2++
            if (dp[i] == dp[d3] * 5) d3++
        }
        return dp[n - 1]
    }
}