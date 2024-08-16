package LeetCode_1470.LeetCode_1470_02

/**
 * 1470.重新排列数组
 */
class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var left = 0;
        var right = nums.size / 2
        var index = 0;
        val res = IntArray(n * 2)
        while (left < n) {
            res[index++] = nums[left++]
            res[index++] = nums[right++]
        }
        return res
    }
}