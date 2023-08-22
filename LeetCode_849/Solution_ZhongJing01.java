package LeetCode_849;

/**
 * @author ZhongJing </p>
 * @date 2023/08/22 </p>
 */
public class Solution_ZhongJing01 {
    public int maxDistToClosest(int[] seats) {
        var left = 0;
        var right = 0;
        var len = seats.length;
        var maxLen = 0;

        while (left < len && seats[left] == 0) left++;
        // 从开头到第一个人的距离
        maxLen = left;

        while (left < len) {
            right = left + 1;
            // 找到下一个有人蹲坑的点
            while (right < len && seats[right] == 0) right++;
            if (right == len) {
                // 如果越界了，说明没有下一个蹲坑的人了，计算历史最大距离和left到结尾的距离哪个大
                maxLen = Math.max(maxLen, right - left - 1);
            } else {
                // 没有越界，计算两个点之间的最大距离
                maxLen = Math.max(maxLen, (right - left) / 2);
            }
            // 下一个left就是这一个right，因为两两比较，前一对的终点是下一对的起点
            left = right;
        }

        return maxLen;
    }
}
