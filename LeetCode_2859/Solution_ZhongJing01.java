package LeetCode_2859;

import java.util.List;

/**
 * 2859.计算 K 置位下标对应元素的和
 *
 * @author ZhongJing </p>
 * @date 2024/01/25 </p>
 */
public class Solution_ZhongJing01 {
    public static void main(String[] args) {
        Solution_ZhongJing01 solution = new Solution_ZhongJing01();
        System.out.println(solution.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1));
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (getKSetBits(i) == k) sum += nums.get(i);
        }
        return sum;
    }

    /**
     * 获取一个数的二进制中1的个数
     */
    public int getKSetBits(int num) {
        int count = 0;
        // Brian Kernighan 算法
        while (num != 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }
}
