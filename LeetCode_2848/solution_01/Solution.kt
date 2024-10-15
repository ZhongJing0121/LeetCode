package LeetCode_2848.solution_01

class Solution {
    /**
     * 2848.与车相交的点
     */
    fun numberOfPoints(nums: List<List<Int>>): Int {
        // 最大值
        val maxNum = nums.maxOf { it[1] }
        // 差分数组，表示数字出现的次数
        val d = IntArray(maxNum + 2) { 0 }

        // 利用差分数组让d中的it[0]到it[1]区间内所有数都+1
        nums.forEach {
            d[it[0]]++
            d[it[1] + 1]--
        }

        var res = 0
        var preSum = 0
        // 还原差分数组，如果当前次数不为0，则表示覆盖，结果+1
        d.forEach { num ->
            preSum += num
            if (preSum > 0) res++
        }
        return res
    }
}