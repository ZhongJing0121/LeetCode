package LeetCode_2651;

public class Solution_ZhongJing01 {
    /**
     * 2651.计算列车到站时间
     */
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return arrivalTime + delayedTime % 24;
    }
}
