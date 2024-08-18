package LeetCode_2148.LeetCode_2148_01

/**
 * 2148.元素计数
 */
class Solution {
    fun countElements(nums: IntArray): Int {
        var minNum = nums[0]
        var minNumCount = 1

        var maxNum = nums[0]
        var maxNumCount = 1

        for (i in 1..nums.lastIndex) {
            if (nums[i] < minNum) {
                minNum = nums[i]
                minNumCount = 1
            } else if (nums[i] == minNum) {
                minNumCount++
            }

            if (nums[i] > maxNum) {
                maxNum = nums[i]
                maxNumCount = 1
            } else if (nums[i] == maxNum) {
                maxNumCount++
            }
        }

        return if (maxNum == minNum) 0 else nums.size - maxNumCount - minNumCount
    }
}