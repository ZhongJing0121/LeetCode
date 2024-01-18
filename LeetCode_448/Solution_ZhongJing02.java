package LeetCode_448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448.找到所有数组中消失的数字
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing02 {
    /**
     * 使用原地交换数组
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // 用负数来标记所有出现过的元素
        for (int i = 0; i < nums.length; i++) {
            var index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }

        var res = new ArrayList<Integer>();

        // 如果某个下标的值是正数，就表示这个下标+1的值不存在
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
