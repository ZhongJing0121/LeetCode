package LeetCode_1686;

import java.util.Arrays;

/**
 * 1686.石子游戏 VI
 *
 * @author ZhongJing </p>
 * @date 2024/02/02 </p>
 */
public class Solution_ZhongJing01 {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        // 索引排序
        var indexArr = new Integer[aliceValues.length];
        for (int i = 0; i < indexArr.length; i++) {
            indexArr[i] = i;
        }
        Arrays.sort(indexArr, (a, b) -> (aliceValues[b] + bobValues[b]) - (aliceValues[a] + bobValues[a]));

        int sum = 0;
        for (int i = 0; i < indexArr.length; i++) {
            sum += i % 2 == 0 ? aliceValues[indexArr[i]] : -bobValues[indexArr[i]];
        }

        return Integer.compare(sum, 0);
    }
}
