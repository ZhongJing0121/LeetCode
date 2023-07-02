package LeetCode_2465;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 题目：不同的平均值数目
 * 日期：2023-07-02
 * 作者：屈泽
 */
public class Solution_QuZe {

    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        int a = distinctAverages1(nums);
        System.out.println("a="+a);
    }

    /**
     * 解法一
     * @param nums
     * @return
     */
    public static int distinctAverages1(int[] nums) {
        if(nums==null){
            return nums.length;
        }

        Arrays.sort(nums);
        Set<Integer> res = new HashSet<>();
        for (int i = 0, j = nums.length - 1; i < j; ++i, --j) {
            res.add(nums[i] + nums[j]);
        }
        return res.size();
    }
}
