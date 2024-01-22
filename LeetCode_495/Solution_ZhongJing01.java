package LeetCode_495;

/**
 * 495.提莫攻击
 *
 * @author ZhongJing </p>
 * @date 2024/01/22 </p>
 */
public class Solution_ZhongJing01 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        int preTime = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            // 如果前一次攻击的时间小于当前攻击的时间，那么就加上持续时间
            if (preTime < timeSeries[i]) {
                sum += duration;
            } else {
                // 如果前一次攻击的时间大于当前攻击的时间，那么就加上持续时间减去前一次攻击的时间
                sum += duration - (preTime - timeSeries[i]);
            }
            // 更新前一次攻击的时间
            preTime = timeSeries[i] + duration;
        }
        return sum;
    }
}
