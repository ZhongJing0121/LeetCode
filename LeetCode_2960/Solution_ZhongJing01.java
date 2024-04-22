package LeetCode_2960;

public class Solution_ZhongJing01 {
    /**
     * 2960.统计已测试设备
     */
    public int countTestedDevices(int[] batteryPercentages) {
        int diff = 0;

        for (int batteryPercentage : batteryPercentages) {
            if (batteryPercentage > diff) diff++;
        }

        return diff;
    }
}
