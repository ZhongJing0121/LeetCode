package LeetCode_551.LeetCode_551_01

/**
 * 551.学生出勤记录 I
 */
class Solution {
    fun checkRecord(s: String): Boolean {
        // 总缺勤数
        var aCount = 0
        s.forEachIndexed { i, c ->
            if ((c == 'A' && ++aCount >= 2) || (c == 'L' && i >= 2 && s[i - 1] == 'L' && s[i - 2] == 'L'))
                return false
        }
        return true
    }
}