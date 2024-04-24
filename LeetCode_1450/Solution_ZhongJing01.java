package LeetCode_1450;

/**
 * 1450.在既定时间做作业的学生人数
 */
public class Solution_ZhongJing01 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        var res = 0;
        var len = startTime.length;
        for (int i = 0; i < len; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) res++;
        }
        return res;
    }
}
