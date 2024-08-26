package LeetCode_2215.`01`

/**
 * 2215.找出两数组的不同
 */
class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        return listOf(set1.filter { it !in set2 }, set2.filter { it !in set1 })
    }
}