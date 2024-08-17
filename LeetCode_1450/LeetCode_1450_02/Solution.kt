package LeetCode_1450.LeetCode_1450_02

/**
 * 1450.在既定时间做作业的学生人数
 */
class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0

        startTime.forEachIndexed { i, time ->
            if (queryTime in time..endTime[i]) count++
        }

        return count
    }
}