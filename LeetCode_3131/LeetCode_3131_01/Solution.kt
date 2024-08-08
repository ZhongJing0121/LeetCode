package LeetCode_3131.LeetCode_3131_01

import kotlin.math.abs

/**
 * 3131.找出与数组相加的整数 I
 */
class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        return abs(nums1.sum() - nums2.sum()) / nums1.size
    }
}