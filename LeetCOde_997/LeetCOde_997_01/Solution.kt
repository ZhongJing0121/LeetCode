package LeetCOde_997.LeetCOde_997_01

/**
 * 997.找到小镇的法官
 */
class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val graphIn = IntArray(n + 1)
        val graphOut = IntArray(n + 1)

        trust.forEach {
            graphOut[it[0]]++
            graphIn[it[1]]++
        }

        for (i in 1..n) {
            if (graphOut[i] == 0 && graphIn[i] == n - 1) return i
        }
        return -1
    }
}