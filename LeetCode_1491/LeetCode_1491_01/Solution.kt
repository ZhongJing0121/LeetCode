package LeetCode_1491.LeetCode_1491_01

/**
 * 1491.去掉最低工资和最高工资后的工资平均值
 */
class Solution {
    fun average(salary: IntArray): Double {
        var sum = 0.0
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        salary.forEach {
            if (it < min) min = it
            if (it > max) max = it
            sum += it
        }
        return (sum - min - max) / (salary.size - 2)
    }
}