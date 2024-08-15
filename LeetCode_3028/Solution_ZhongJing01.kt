package LeetCode_3028

/**
 * 1480.一维数组的动态和
 */
class Solution {
    fun returnToBoundaryCount(nums: IntArray): Int {
        var count = if (nums[0] == 0) 1 else 0
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
            if (nums[i] == 0) count++
        }
        return count
    }
}