package LeetCode_136.01;

/**
 * 136. 只出现一次的数字
 *
 * @author ZhongJing </p>
 * @date 2023/10/18 </p>
 */
public class Solution_ZhongJing {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
