package LeetCode_1523.`01`

/**
 * 1523.在区间范围内统计奇数数目
 */
class Solution {
    fun countOdds(low: Int, high: Int): Int {
        return (high + 1) / 2 - low / 2
    }
}