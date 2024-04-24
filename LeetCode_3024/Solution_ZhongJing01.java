package LeetCode_3024;

/**
 * 3024.三角形类型
 */
public class Solution_ZhongJing01 {
    public String triangleType(int[] nums) {
        // 判断是否能构成三角形
        if (nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) {
            return "none";
        }

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
            return "isosceles";
        }

        return "scalene";
    }
}
