package LeetCode_448;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 448.找到所有数组中消失的数字
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing01 {
    /**
     * 使用map的方法
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 定义一个hashset
        var set = new HashSet<Integer>();

        // 把所有数字都添加到set里
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        var res = new ArrayList<Integer>();

        // 如果1~n某个数不在set里，就是缺失的数字
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }
}
