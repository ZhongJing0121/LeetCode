package LeetCode_2089;

import java.util.ArrayList;
import java.util.List;

/**
 * 2089.找出数组排序后的目标下标
 * 方法二：一次遍历，不需要排序，小于target的数量就是最左边target的下标，等于target的数量就是答案的长度，递增即可
 */
public class Solution_ZhongJing02 {
    public List<Integer> targetIndices(int[] nums, int target) {
        var res = new ArrayList<Integer>();

        int lessCount = 0, eqCount = 0;

        for (int num : nums) {
            if (num < target) {
                lessCount++;
            } else if (num == target) {
                eqCount++;
            }
        }

        for (int i = 0; i < eqCount; i++) {
            res.add(lessCount + i);
        }

        return res;
    }
}
