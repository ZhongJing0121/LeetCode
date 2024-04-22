package LeetCode_796;

public class Solution_ZhongJing01 {
    /**
     * 796.旋转字符串
     */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
