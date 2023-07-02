package LeetCode_20;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
public class Solution_ZhongJing {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        LinkedList<Character> stack = new LinkedList<>();

        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 如果都是右括号，弹出栈元素进行比较
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || stack.pop() != map.get(c))
                    return false;
            } else {
                // 如果都是左括号，把元素压入栈
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
