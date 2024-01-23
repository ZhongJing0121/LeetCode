package LeetCode_2765;

/**
 * 2765.最长交替子数组
 *
 * @author ZhongJing </p>
 * @date 2024/01/23 </p>
 */
public class Solution_ZhongJing01 {
    public int alternatingSubarray(int[] nums) {
        int len = nums.length;
        int i = 0;
        int res = -1;
        while (i < len - 1) {
            // 如果下一个和当前的差值不为1，就跳过
            if (nums[i + 1] - nums[i] != 1) {
                i++;
                continue;
            }
            int startIndex = i;
            // i+1已经比较过了，从i+2开始比较
            i += 2;
            // i和i+2应该是一样的，所以第一个结果应该是0，然后是1，然后是0，然后是1
            // 正好i和i+2的间隔模以2的结果就是0
            while (i < len && nums[i] == nums[startIndex] + (i - startIndex) % 2) {
                i++;
            }
            // i - startIndex就是当前的长度
            res = Math.max(res, i - startIndex);
            // 数据特殊性
            --i;
        }
        return res;
    }
}
