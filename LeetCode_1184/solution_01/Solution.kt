package LeetCode_1184.solution_01

/**
 * 1184.公交站间的距离
 * Author: 仲景
 * Date: 2024/10/17
 */
class Solution {
    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        // 遍历一遍把 [minIndex, maxIndex]、[maxIndex, len]+[0, minIndex]两个区间的和求出来
        // 一个是正这走，一个反着走，看看哪种比较近
        val minIndex = minOf(start, destination)
        val maxIndex = if (minIndex == start) destination else start
        var lengthOne = 0
        var lengthTwo = 0
        distance.forEachIndexed { index, i ->
            if (index in minIndex..<maxIndex) lengthOne += i
            else lengthTwo += i
        }
        return minOf(lengthOne, lengthTwo)
    }
}