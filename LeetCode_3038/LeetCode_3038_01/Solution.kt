package LeetCode_3038.LeetCode_3038_01

/**
 * 3038.相同分数的最大操作数目 I
 */
class Solution {
    fun maxOperations(nums: IntArray): Int {
        var count = 1;
        val n = nums.size
        val sum = nums[0] + nums[1]
        var i = 2
        var j = 3
        while (i < n && j < n && nums[i] + nums[j] == sum) {
            i = j + 1
            j = i + 1
            count++
        }
        return count
    }
}