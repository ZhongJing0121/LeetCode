package LeetCode_2208;

import java.util.PriorityQueue;

/**
 * 题目：2208.将数组和减半的最少操作次数
 * 日期：2023-07-25
 * 作者：仲景
 */
public class Solution01_ZhongJing {
    public static int halveArray(int[] nums) {
        var maxHeap = new PriorityQueue<Double>((a, b) -> b.compareTo(a));
        var sum = 0.0;
        for (int num : nums) {
            sum += num;
            maxHeap.offer((double) num);
        }

        var tempSum = sum;
        sum /= 2;
        var count = 0;

        while (tempSum > sum) {
            var cur = maxHeap.poll() / 2;
            tempSum -= cur;
            maxHeap.offer(cur);
            count++;
        }

        return count;
    }
}