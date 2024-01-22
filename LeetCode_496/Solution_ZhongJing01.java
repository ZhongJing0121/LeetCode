package LeetCode_496;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * 496.下一个更大元素 I
 *
 * @author ZhongJing </p>
 * @date 2024/01/22 </p>
 */
public class Solution_ZhongJing01 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // 倒序遍历nums2，生成map
        for (int i = nums2.length - 1; i >= 0; i--) {
            // 单调栈，栈顶元素小于当前元素，栈顶元素出栈
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            // 生成当前元素的下一个更大元素
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            // 当前元素入栈
            stack.push(nums2[i]);
        }

        // 遍历nums1，生成结果
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
