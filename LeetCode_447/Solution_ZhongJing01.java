package LeetCode_447;

import java.util.HashMap;
import java.util.Map;

/**
 * 447.回旋镖的数量
 *
 * @author ZhongJing </p>
 * @date 2024/01/08 </p>
 */
public class Solution_ZhongJing01 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        // 存储欧氏距离平方的map
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] point1 : points) {
            int x1 = point1[0];
            int y1 = point1[1];

            // 清空上一次循环
            map.clear();

            // 计算别的点到这个点的欧式距离
            for (int[] points2 : points) {
                int x2 = points2[0];
                int y2 = points2[1];
                // 获取点1和点2之间的欧氏距离的平方
                int d = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                // 之前有没有相同距离的点
                int eqCount = map.getOrDefault(d, 0);
                // 如果有，按照排列组合，应该是2倍的回旋镖（参考a不变，b、c互换）
                res += eqCount * 2;
                // 该距离出现次数+1
                map.put(d, eqCount + 1);
            }
        }
        return res;
    }
}
