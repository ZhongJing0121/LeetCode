package LeetCode_09

/**
 * 日期：2023-07-02
 * <br>
 * 作者：仲景
 */
class Solution {
    fun isPalindrome(x: Int): Boolean {
        var num = x
        var res = 0

        while (num > 0) {
            res = res * 10 + (num % 10)
            num /= 10
        }

        return res == x
    }
}
