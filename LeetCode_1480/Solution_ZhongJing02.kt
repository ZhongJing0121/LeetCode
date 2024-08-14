package LeetCode_1480

/**
 * 1480.一维数组的动态和
 */
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] = nums[i] + nums[i - 1]
        }
        return nums
    }
}