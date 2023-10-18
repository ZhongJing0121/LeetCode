package LeetCode_2530;

import java.util.PriorityQueue;

/**
 * 2530.执行 K 次操作后的最大分数
 *
 * @author ZhongJing </p>
 * @date 2023/10/18 </p>
 */
public class Solution_ZhongJing01 {
    public static void main(String[] args) {
        var test = new Solution_ZhongJing01();

        System.out.println(test.maxKelements(new int[]{672579538, 806947365, 854095676, 815137524}, 3));
    }

    public long maxKelements(int[] nums, int k) {
        // 创建大根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        // 遍历nums，存储值大根堆
        for (int num : nums) {
            heap.add(num);
        }

        long res = 0;
        // 取k次
        for (int i = 0; i < k; i++) {
            long temp = heap.poll();
            res += temp;
            heap.add((int) Math.ceil((double) temp / 3));
        }

        return res;
    }
}
