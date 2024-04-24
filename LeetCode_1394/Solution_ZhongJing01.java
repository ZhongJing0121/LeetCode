package LeetCode_1394;

/**
 * 1394.找出数组中的幸运数
 */
public class Solution_ZhongJing01 {
    public int findLucky(int[] arr) {
        var numCountMap = new int[501];

        for (int i : arr) {
            numCountMap[i]++;
        }

        int maxLuckyNum = -1;

        for (int i = 1; i < numCountMap.length; i++) {
            if (numCountMap[i] == i) {
                maxLuckyNum = i;
            }
        }

        return maxLuckyNum;
    }
}
