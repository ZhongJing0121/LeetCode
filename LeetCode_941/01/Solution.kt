package LeetCode_941.`01`

/**
 * 941.有效的山脉数组
 */
class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        // 长度小于3，直接false
        if (arr.size < 3) return false

        // 找到第一个山峰
        var i = 0;
        while (i < arr.size - 1 && arr[i] < arr[i + 1]) i++

        // 如果已经到最后了，返回false
        if (i == 0 || i == arr.lastIndex) return false

        // 看后面的值是不是都小于山峰
        while (i < arr.size - 1 && arr[i] > arr[i + 1]) i++

        return i == arr.lastIndex
    }
}