package LeetCode_2367.LeetCode_2367_01

/**
 * 2367.算术三元组的数目
 */
class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val numSet = mutableSetOf<Int>()
        var count = 0
        nums.forEach { num ->
            if (num - diff in numSet && num - diff * 2 in numSet) count++
            numSet.add(num)
        }
        return count
    }
}