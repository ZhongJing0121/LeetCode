package LeetCode_2798;

/**
 * 2798.满足目标工作时长的员工数目
 */
public class Solution_ZhongJing01 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
}
