package LeetCode_1464.LeetCode_1464_02


/**
 * 1464.数组中两元素的最大乘积
 */
class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max1 = nums[0]
        var max2 = nums[1]

        if (max1 < max2) max1 = max2.also { max2 = max1 }

        for (i in 2 until nums.size) {
            if (nums[i] > max1) {
                max2 = max1
                max1 = nums[i]
            } else if (nums[i] > max2) {
                max2 = nums[i]
            }
        }

        return (max1 - 1) * (max2 - 1)
    }
}