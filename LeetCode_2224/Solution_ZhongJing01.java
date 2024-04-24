package LeetCode_2224;

/**
 * 2224.转化时间需要的最少操作数
 */
public class Solution_ZhongJing01 {
    public int convertTime(String current, String correct) {
        var currentAllMinute = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));

        var correctAllMinute = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));

        int res = 0, diff = correctAllMinute - currentAllMinute;

        res += diff / 60;
        diff = diff % 60;
        res += diff / 15;
        diff = diff % 15;
        res += diff / 5;
        diff = diff % 5;
        res += diff;

        return res;
    }
}
