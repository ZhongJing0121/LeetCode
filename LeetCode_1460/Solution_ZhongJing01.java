package LeetCode_1460;

/**
 * 1460.通过翻转子数组使两个数组相等
 */
public class Solution_ZhongJing01 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) return false;
        var numMap = new int[1001];
        int diff = 0;

        for (int i = 0; i < target.length; i++) {
            if (++numMap[target[i]] == 1) {
                diff++;
            }
            if (--numMap[arr[i]] == 0) {
                diff--;
            }
        }

        return diff == 0;
    }
}
