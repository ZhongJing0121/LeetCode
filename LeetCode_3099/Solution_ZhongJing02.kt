package LeetCode_3099

/**
 * 3099.哈沙德数
 */
class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var sum = 0
        var num = x
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        return if (x % sum == 0) sum else -1
    }
}