package LeetCode_20

import java.util.LinkedList

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
class Solution {
    fun isValid(s: String): Boolean {
        val m = mapOf<Char, Char>(
            ')' to '(',
            ']' to '[',
            '}' to '{',
        )

        val stack = LinkedList<Char>()
        s.forEach {
            if (it == '(' || it == '[' || it == '{') {
                stack.push(it)
            } else {
                if (stack.isEmpty() || stack.pop() != m[it]) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}
