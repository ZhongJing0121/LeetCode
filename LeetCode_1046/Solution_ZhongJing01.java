package LeetCode_1046;

import java.util.PriorityQueue;

public class Solution_ZhongJing01 {
    /**
     * 1046. 最后一块石头的重量
     */
    public int lastStoneWeight(int[] stones) {
        // 创建一个大根堆
        var maxHeap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

        // 元素全部入堆
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            var x = maxHeap.poll();
            var y = maxHeap.poll();

            if (x > y) {
                maxHeap.offer(x - y);
            }
        }

        if (maxHeap.isEmpty()) {
            return 0;
        }
        return maxHeap.poll();
    }
}
