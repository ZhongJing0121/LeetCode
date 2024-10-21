package LeetCode_2078.solution_01

class Solution {
    /**
     * 2078.两栋颜色不同且距离最远的房子
     * Author: 仲景
     * Date: 2024/10/21
     */
    fun maxDistance(colors: IntArray): Int {
        if (colors[0] != colors[colors.lastIndex]) return colors.lastIndex
        var left = 0
        var right = colors.lastIndex
        val color0 = colors[0]
        while (colors[left] == color0) left++
        while (colors[right] == color0) right--
        return maxOf(left - 0, colors.lastIndex - right)
    }
}