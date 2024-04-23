package LeetCode_1365;

/**
 * 1365.有多少小于当前数字的数字
 * 方法一：前缀和
 */
public class Solution_ZhongJing01 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        var preSumArr = new int[101];

        for (int num : nums) {
            preSumArr[num]++;
        }

        // 计算前缀和
        var preSum = preSumArr[0];
        preSumArr[0] = 0;
        for (int i = 1; i < preSumArr.length; i++) {
            var temp = preSumArr[i];
            preSumArr[i] = preSum;
            preSum = temp + preSum;
        }

        var res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = preSumArr[nums[i]];
        }

        return res;
    }
}
