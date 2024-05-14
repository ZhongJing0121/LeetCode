package LeetCode_2670_01;

import java.util.HashSet;

/**
 * 2670.找出不同元素数目差数组
 *
 * @author ZhongJing </p>
 * @date 2024/01/31 </p>
 */
public class Solution_ZhongJing01 {
    public int[] distinctDifferenceArray(int[] nums) {
        // 构建前缀数组
        var prefixArray = new int[nums.length];

        // 记录出现的数字次数
        var set = new HashSet<Integer>();

        // 从前往后遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 前缀包含当前数，先add再赋值
            set.add(nums[i]);
            prefixArray[i] = set.size();
        }

        // 构建后缀数组
        var res = new int[nums.length];
        // 清空set
        set.clear();
        // 从后往前遍历数组
        for (int i = nums.length - 1; i >= 0; i--) {
            // 结果等于前缀-后缀
            res[i] = prefixArray[i] - set.size();
            // 后缀不包含当前数，先赋值再add
            set.add(nums[i]);
        }

        return res;
    }

}
