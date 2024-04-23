package LeetCode_1502;

import java.util.Arrays;

/**
 * 1502.判断能否形成等差数列
 */
public class Solution_ZhongJing01 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // 排序
        Arrays.sort(arr);

        var diff = arr[1] - arr[0];

        // 遍历
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] + diff != arr[i]) {
                return false;
            }
        }

        return true;
    }
}
