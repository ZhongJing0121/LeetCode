package LeetCode_2149.solution_01

class Solution {
    /**
     * 2149.按符号重排数组
     * Author: 仲景
     * Date: 2024/10/21
     */
    fun rearrangeArray(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        var i = 0
        var j = 1

        nums.forEach { num ->
            if (num < 0) {
                res[j] = num
                j += 2
            } else {
                res[i] = num
                i += 2
            }
        }
        return res
    }
}