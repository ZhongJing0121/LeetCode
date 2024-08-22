package LeetCode_3069.LeetCode_3069_01

/**
 * 3069. 将元素分配到两个数组中 I
 */
class Solution {
    fun resultArray(nums: IntArray): IntArray {
        val res1 = mutableListOf(nums[0])
        val res2 = mutableListOf(nums[1])

        for (i in 2..nums.lastIndex) {
            if (res1[res1.lastIndex] > res2[res2.lastIndex]) {
                res1.add(nums[i])
            } else {
                res2.add(nums[i])
            }
        }
        res1.addAll(res2)
        return res1.toIntArray()
    }
}